package com.zbkj.admin.adaptor;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;

public class DruidWebUtilsAdaptor {
    public DruidWebUtilsAdaptor() {
    }

    public static String getRemoteAddr(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip != null && !isValidAddress(ip)) {
            ip = null;
        }

        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
            if (ip != null && !isValidAddress(ip)) {
                ip = null;
            }
        }

        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
            if (ip != null && !isValidAddress(ip)) {
                ip = null;
            }
        }

        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
            if (ip != null && !isValidAddress(ip)) {
                ip = null;
            }
        }

        return ip;
    }

    private static boolean isValidAddress(String ip) {
        if (ip == null) {
            return false;
        } else {
            for(int i = 0; i < ip.length(); ++i) {
                char ch = ip.charAt(i);
                if ((ch < '0' || ch > '9') && (ch < 'A' || ch > 'F') && (ch < 'a' || ch > 'f') && ch != '.' && ch != ':') {
                    return false;
                }
            }

            return true;
        }
    }

    private static String getContextPath_2_5(ServletContext context) {
        String contextPath = context.getContextPath();
        if (contextPath == null || contextPath.length() == 0) {
            contextPath = "/";
        }

        return contextPath;
    }

    public static String getContextPath(ServletContext context) {
        if (context.getMajorVersion() == 2 && context.getMinorVersion() < 5) {
            return null;
        } else {
            try {
                return getContextPath_2_5(context);
            } catch (NoSuchMethodError var2) {
                return null;
            }
        }
    }

    public static Boolean getBoolean(GenericServlet servlet, String key) {
        String property = servlet.getInitParameter(key);
        if ("true".equals(property)) {
            return Boolean.TRUE;
        } else {
            return "false".equals(property) ? Boolean.FALSE : null;
        }
    }
}
