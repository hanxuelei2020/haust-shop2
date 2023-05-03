package com.zbkj.common.adaptor;


import com.alibaba.druid.support.http.ResourceServlet;
import com.alibaba.druid.support.http.util.IPAddress;
import com.alibaba.druid.support.http.util.IPRange;
import com.alibaba.druid.support.logging.Log;
import com.alibaba.druid.support.logging.LogFactory;
import com.alibaba.druid.util.StringUtils;
import com.alibaba.druid.util.Utils;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class ResourceServletAdaptor extends HttpServlet {
    private static final Log LOG = LogFactory.getLog(ResourceServlet.class);
    public static final String SESSION_USER_KEY = "druid-user";
    public static final String PARAM_NAME_USERNAME = "loginUsername";
    public static final String PARAM_NAME_PASSWORD = "loginPassword";
    public static final String PARAM_NAME_ALLOW = "allow";
    public static final String PARAM_NAME_DENY = "deny";
    public static final String PARAM_REMOTE_ADDR = "remoteAddress";
    protected final ResourceHandler handler;

    public ResourceServletAdaptor(String resourcePath) {
        this.handler = new ResourceHandler(resourcePath);
    }

    public void init() throws ServletException {
        this.initAuthEnv();
    }

    private void initAuthEnv() {
        String paramUserName = this.getInitParameter("loginUsername");
        if (!StringUtils.isEmpty(paramUserName)) {
            this.handler.username = paramUserName;
        }

        String paramPassword = this.getInitParameter("loginPassword");
        if (!StringUtils.isEmpty(paramPassword)) {
            this.handler.password = paramPassword;
        }

        String paramRemoteAddressHeader = this.getInitParameter("remoteAddress");
        if (!StringUtils.isEmpty(paramRemoteAddressHeader)) {
            this.handler.remoteAddressHeader = paramRemoteAddressHeader;
        }

        String param;
        String msg;
        String[] var6;
        int var7;
        int var8;
        String item;
        IPRange ipRange;
        String[] items;
        try {
            param = this.getInitParameter("allow");
            if (param != null && param.trim().length() != 0) {
                param = param.trim();
                items = param.split(",");
                var6 = items;
                var7 = items.length;

                for(var8 = 0; var8 < var7; ++var8) {
                    item = var6[var8];
                    if (item != null && item.length() != 0) {
                        ipRange = new IPRange(item);
                        this.handler.allowList.add(ipRange);
                    }
                }
            }
        } catch (Exception var12) {
            msg = "initParameter config error, allow : " + this.getInitParameter("allow");
            LOG.error(msg, var12);
        }

        try {
            param = this.getInitParameter("deny");
            if (param != null && param.trim().length() != 0) {
                param = param.trim();
                items = param.split(",");
                var6 = items;
                var7 = items.length;

                for(var8 = 0; var8 < var7; ++var8) {
                    item = var6[var8];
                    if (item != null && item.length() != 0) {
                        ipRange = new IPRange(item);
                        this.handler.denyList.add(ipRange);
                    }
                }
            }
        } catch (Exception var11) {
            msg = "initParameter config error, deny : " + this.getInitParameter("deny");
            LOG.error(msg, var11);
        }

    }

    public boolean isPermittedRequest(String remoteAddress) {
        return this.handler.isPermittedRequest(remoteAddress);
    }

    protected String getFilePath(String fileName) {
        return this.handler.resourcePath + fileName;
    }

    protected void returnResourceFile(String fileName, String uri, HttpServletResponse response) throws ServletException, IOException {
        this.handler.returnResourceFile(fileName, uri, response);
    }

    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String servletPath = request.getServletPath();
        this.handler.service(request, response, servletPath, new ResourceServlet.ProcessCallback() {
            public String process(String url) {
                return ResourceServletAdaptor.this.process(url);
            }
        });
    }

    public boolean ContainsUser(HttpServletRequest request) {
        return this.handler.containsUser(request);
    }

    public boolean checkLoginParam(HttpServletRequest request) {
        return this.handler.checkLoginParam(request);
    }

    public boolean isRequireAuth() {
        return this.handler.isRequireAuth();
    }

    public boolean isPermittedRequest(HttpServletRequest request) {
        return this.handler.isPermittedRequest(request);
    }

    protected String getRemoteAddress(HttpServletRequest request) {
        return this.handler.getRemoteAddress(request);
    }

    protected abstract String process(String var1);

    public static class ResourceHandler {
        protected String username;
        protected String password;
        protected List<IPRange> allowList = new ArrayList();
        protected List<IPRange> denyList = new ArrayList();
        protected String resourcePath;
        protected String remoteAddressHeader;

        public ResourceHandler(String resourcePath) {
            this.resourcePath = resourcePath;
        }

        protected void returnResourceFile(String fileName, String uri, HttpServletResponse response) throws ServletException, IOException {
            String filePath = this.getFilePath(fileName);
            if (filePath.endsWith(".html")) {
                response.setContentType("text/html; charset=utf-8");
            }

            if (fileName.endsWith(".jpg")) {
                byte[] bytes = Utils.readByteArrayFromResource(filePath);
                if (bytes != null) {
                    response.getOutputStream().write(bytes);
                }

            } else {
                String text = Utils.readFromResource(filePath);
                if (text != null) {
                    if (fileName.endsWith(".css")) {
                        response.setContentType("text/css;charset=utf-8");
                    } else if (fileName.endsWith(".js")) {
                        response.setContentType("text/javascript;charset=utf-8");
                    }

                    response.getWriter().write(text);
                }
            }
        }

        protected String getFilePath(String fileName) {
            return this.resourcePath + fileName;
        }

        public boolean checkLoginParam(HttpServletRequest request) {
            String usernameParam = request.getParameter("loginUsername");
            String passwordParam = request.getParameter("loginPassword");
            if (null != this.username && null != this.password) {
                return this.username.equals(usernameParam) && this.password.equals(passwordParam);
            } else {
                return false;
            }
        }

        protected String getRemoteAddress(HttpServletRequest request) {
            String remoteAddress = null;
            if (this.remoteAddressHeader != null) {
                remoteAddress = request.getHeader(this.remoteAddressHeader);
            }

            if (remoteAddress == null) {
                remoteAddress = request.getRemoteAddr();
            }

            return remoteAddress;
        }

        public boolean containsUser(HttpServletRequest request) {
            HttpSession session = request.getSession(false);
            return session != null && session.getAttribute("druid-user") != null;
        }

        public boolean isRequireAuth() {
            return this.username != null;
        }

        public boolean isPermittedRequest(HttpServletRequest request) {
            String remoteAddress = this.getRemoteAddress(request);
            return this.isPermittedRequest(remoteAddress);
        }

        public boolean isPermittedRequest(String remoteAddress) {
            boolean ipV6 = remoteAddress != null && remoteAddress.indexOf(58) != -1;
            if (!ipV6) {
                IPAddress ipAddress = new IPAddress(remoteAddress);
                Iterator var4 = this.denyList.iterator();

                IPRange range;
                do {
                    if (!var4.hasNext()) {
                        if (this.allowList.size() > 0) {
                            var4 = this.allowList.iterator();

                            do {
                                if (!var4.hasNext()) {
                                    return false;
                                }

                                range = (IPRange)var4.next();
                            } while(!range.isIPAddressInRange(ipAddress));

                            return true;
                        }

                        return true;
                    }

                    range = (IPRange)var4.next();
                } while(!range.isIPAddressInRange(ipAddress));

                return false;
            } else {
                return "0:0:0:0:0:0:0:1".equals(remoteAddress) || this.denyList.isEmpty() && this.allowList.isEmpty();
            }
        }

        public void service(HttpServletRequest request, HttpServletResponse response, String servletPath, ResourceServlet.ProcessCallback processCallback) throws ServletException, IOException {
            String contextPath = request.getContextPath();
            String requestURI = request.getRequestURI();
            response.setCharacterEncoding("utf-8");
            if (contextPath == null) {
                contextPath = "";
            }

            String uri = contextPath + servletPath;
            String path = requestURI.substring(contextPath.length() + servletPath.length());
            if (!this.isPermittedRequest(request)) {
                path = "/nopermit.html";
                this.returnResourceFile(path, uri, response);
            } else {
                String fullUrl;
                if ("/submitLogin".equals(path)) {
                    fullUrl = request.getParameter("loginUsername");
                    String passwordParam = request.getParameter("loginPassword");
                    if (this.username.equals(fullUrl) && this.password.equals(passwordParam)) {
                        request.getSession().setAttribute("druid-user", this.username);
                        response.getWriter().print("success");
                    } else {
                        response.getWriter().print("error");
                    }

                } else if (this.isRequireAuth() && !this.containsUser(request) && !this.checkLoginParam(request) && !"/login.html".equals(path) && !path.startsWith("/css") && !path.startsWith("/js") && !path.startsWith("/img")) {
                    if (!contextPath.equals("") && !contextPath.equals("/")) {
                        if ("".equals(path)) {
                            response.sendRedirect("druid/login.html");
                        } else {
                            response.sendRedirect("login.html");
                        }
                    } else {
                        response.sendRedirect("/druid/login.html");
                    }

                } else if (!"".equals(path) && !"/".equals(path)) {
                    if (path.contains(".json")) {
                        fullUrl = path;
                        if (request.getQueryString() != null && request.getQueryString().length() > 0) {
                            fullUrl = path + "?" + request.getQueryString();
                        }

                        response.getWriter().print(processCallback.process(fullUrl));
                    } else {
                        this.returnResourceFile(path, uri, response);
                    }
                } else {
                    this.returnResourceFile("/index.html", uri, response);
                }
            }
        }
    }

    public interface ProcessCallback {
        String process(String var1);
    }
}
