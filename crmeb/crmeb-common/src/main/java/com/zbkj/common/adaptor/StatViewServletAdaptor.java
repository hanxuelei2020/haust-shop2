package com.zbkj.common.adaptor;

import com.alibaba.druid.stat.DruidStatService;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.logging.Log;
import com.alibaba.druid.support.logging.LogFactory;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.management.MBeanServerConnection;
import javax.management.ObjectName;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class StatViewServletAdaptor extends ResourceServletAdaptor {
    private static final Log LOG = LogFactory.getLog(StatViewServlet.class);
    private static final long serialVersionUID = 1L;
    public static final String PARAM_NAME_RESET_ENABLE = "resetEnable";
    public static final String PARAM_NAME_JMX_URL = "jmxUrl";
    public static final String PARAM_NAME_JMX_USERNAME = "jmxUsername";
    public static final String PARAM_NAME_JMX_PASSWORD = "jmxPassword";
    private DruidStatService statService = DruidStatService.getInstance();
    private String jmxUrl;
    private String jmxUsername;
    private String jmxPassword;
    private MBeanServerConnection conn;

    public StatViewServletAdaptor() {
        super("support/http/resources");
    }

    public void init() throws ServletException {
        super.init();

        String param;
        try {
            param = this.getInitParameter("resetEnable");
            if (param != null && param.trim().length() != 0) {
                param = param.trim();
                boolean resetEnable = Boolean.parseBoolean(param);
                this.statService.setResetEnable(resetEnable);
            }
        } catch (Exception var4) {
            String msg = "initParameter config error, resetEnable : " + this.getInitParameter("resetEnable");
            LOG.error(msg, var4);
        }

        param = this.readInitParam("jmxUrl");
        if (param != null) {
            this.jmxUrl = param;
            this.jmxUsername = this.readInitParam("jmxUsername");
            this.jmxPassword = this.readInitParam("jmxPassword");

            try {
                this.initJmxConn();
            } catch (IOException var3) {
                LOG.error("init jmx connection error", var3);
            }
        }

    }

    private String readInitParam(String key) {
        String value = null;

        try {
            String param = this.getInitParameter(key);
            if (param != null) {
                param = param.trim();
                if (param.length() > 0) {
                    value = param;
                }
            }
        } catch (Exception var5) {
            String msg = "initParameter config [" + key + "] error";
            LOG.warn(msg, var5);
        }

        return value;
    }

    private void initJmxConn() throws IOException {
        if (this.jmxUrl != null) {
            JMXServiceURL url = new JMXServiceURL(this.jmxUrl);
            Map<String, String[]> env = null;
            if (this.jmxUsername != null) {
                env = new HashMap();
                String[] credentials = new String[]{this.jmxUsername, this.jmxPassword};
                env.put("jmx.remote.credentials", credentials);
            }

            JMXConnector jmxc = JMXConnectorFactory.connect(url, env);
            this.conn = jmxc.getMBeanServerConnection();
        }

    }

    private String getJmxResult(MBeanServerConnection connetion, String url) throws Exception {
        ObjectName name = new ObjectName("com.alibaba.druid:type=DruidStatService");
        String result = (String)this.conn.invoke(name, "service", new String[]{url}, new String[]{String.class.getName()});
        return result;
    }

    protected String process(String url) {
        String resp = null;
        if (this.jmxUrl == null) {
            resp = this.statService.service(url);
        } else if (this.conn == null) {
            try {
                this.initJmxConn();
            } catch (IOException var6) {
                LOG.error("init jmx connection error", var6);
                resp = DruidStatService.returnJSONResult(-1, "init jmx connection error" + var6.getMessage());
            }

            if (this.conn != null) {
                try {
                    resp = this.getJmxResult(this.conn, url);
                } catch (Exception var5) {
                    LOG.error("get jmx data error", var5);
                    resp = DruidStatService.returnJSONResult(-1, "get data error:" + var5.getMessage());
                }
            }
        } else {
            try {
                resp = this.getJmxResult(this.conn, url);
            } catch (Exception var4) {
                LOG.error("get jmx data error", var4);
                resp = DruidStatService.returnJSONResult(-1, "get data error" + var4.getMessage());
            }
        }

        return resp;
    }

    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String contextPath = request.getContextPath();
        String servletPath = request.getServletPath();
        String requestURI = request.getRequestURI();
        response.setCharacterEncoding("utf-8");
        if (contextPath == null) {
            contextPath = "";
        }

        (new StringBuilder()).append(contextPath).append(servletPath).toString();
        String path = requestURI.substring(contextPath.length() + servletPath.length());
        if (!"".equals(path)) {
            if ("/".equals(path)) {
                response.sendRedirect("index.html");
            } else {
                super.service(request, response);
            }
        } else {
            if (!contextPath.equals("") && !contextPath.equals("/")) {
                response.sendRedirect("druid/index.html");
            } else {
                response.sendRedirect("/druid/index.html");
            }

        }
    }
}
