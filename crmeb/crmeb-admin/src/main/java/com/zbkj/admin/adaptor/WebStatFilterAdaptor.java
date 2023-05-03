package com.zbkj.admin.adaptor;


import com.alibaba.druid.filter.stat.StatFilterContext;
import com.alibaba.druid.support.http.WebStatFilter;
import com.alibaba.druid.support.http.stat.*;
import com.alibaba.druid.support.logging.Log;
import com.alibaba.druid.support.logging.LogFactory;
import com.alibaba.druid.support.profile.ProfileEntryKey;
import com.alibaba.druid.support.profile.ProfileEntryReqStat;
import com.alibaba.druid.support.profile.Profiler;
import com.alibaba.druid.util.DruidWebUtils;
import com.alibaba.druid.util.PatternMatcher;
import com.alibaba.druid.util.ServletPathMatcher;
import jakarta.servlet.*;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletResponseWrapper;
import java.io.IOException;
import java.util.*;

public class WebStatFilterAdaptor extends AbstractWebStatImplAdaptor implements Filter {
    private static final Log LOG = LogFactory.getLog(WebStatFilter.class);
    public static final String PARAM_NAME_PROFILE_ENABLE = "profileEnable";
    public static final String PARAM_NAME_SESSION_STAT_ENABLE = "sessionStatEnable";
    public static final String PARAM_NAME_SESSION_STAT_MAX_COUNT = "sessionStatMaxCount";
    public static final String PARAM_NAME_EXCLUSIONS = "exclusions";
    public static final String PARAM_NAME_PRINCIPAL_SESSION_NAME = "principalSessionName";
    public static final String PARAM_NAME_PRINCIPAL_COOKIE_NAME = "principalCookieName";
    public static final String PARAM_NAME_REAL_IP_HEADER = "realIpHeader";
    protected PatternMatcher pathMatcher = new ServletPathMatcher();
    private Set<String> excludesPattern;

    public WebStatFilterAdaptor() {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest)request;
        HttpServletResponse httpResponse = (HttpServletResponse)response;
        WebStatFilterAdaptor.StatHttpServletResponseWrapper responseWrapper = new WebStatFilterAdaptor.StatHttpServletResponseWrapper(httpResponse);
        String requestURI = this.getRequestURI(httpRequest);
        if (this.isExclusion(requestURI)) {
            chain.doFilter(request, response);
        } else {
            long startNano = System.nanoTime();
            long startMillis = System.currentTimeMillis();
            WebRequestStat requestStat = new WebRequestStat(startNano, startMillis);
            WebRequestStat.set(requestStat);
            WebSessionStat sessionStat = this.getSessionStat(httpRequest);
            this.webAppStat.beforeInvoke();
            WebURIStat uriStat = this.webAppStat.getURIStat(requestURI, false);
            if (uriStat == null) {
                int index = requestURI.indexOf(";jsessionid=");
                if (index != -1) {
                    requestURI = requestURI.substring(0, index);
                    uriStat = this.webAppStat.getURIStat(requestURI, false);
                }
            }

            if (this.isProfileEnable()) {
                Profiler.initLocal();
                Profiler.enter(requestURI, "WEB");
            }

            if (uriStat != null) {
                uriStat.beforeInvoke();
            }

            if (sessionStat != null) {
                sessionStat.beforeInvoke();
            }

            Object error = null;
            boolean var34 = false;

            try {
                var34 = true;
                chain.doFilter(request, responseWrapper);
                var34 = false;
            } catch (IOException var35) {
                error = var35;
                throw var35;
            } catch (ServletException var36) {
                error = var36;
                throw var36;
            } catch (RuntimeException var37) {
                error = var37;
                throw var37;
            } catch (Error var38) {
                error = var38;
                throw var38;
            } finally {
                if (var34) {
                    long endNano = System.nanoTime();
                    requestStat.setEndNano(endNano);
                    long nanos = endNano - startNano;
                    this.webAppStat.afterInvoke((Throwable)error, nanos);
                    if (sessionStat == null) {
                        sessionStat = this.getSessionStat(httpRequest);
                        if (sessionStat != null) {
                            sessionStat.beforeInvoke();
                        }
                    }

                    if (sessionStat != null) {
                        sessionStat.afterInvoke((Throwable)error, nanos);
                        sessionStat.setPrincipal(this.getPrincipal(httpRequest));
                    }

                    if (uriStat == null) {
                        int status = responseWrapper.getStatus();
                        if (status == 404) {
                            String errorUrl = this.contextPath + "error_" + status;
                            uriStat = this.webAppStat.getURIStat(errorUrl, true);
                        } else {
                            uriStat = this.webAppStat.getURIStat(requestURI, true);
                        }

                        if (uriStat != null) {
                            uriStat.beforeInvoke();
                        }
                    }

                    if (uriStat != null) {
                        uriStat.afterInvoke((Throwable)error, nanos);
                    }

                    WebRequestStat.set((WebRequestStat)null);
                    if (this.isProfileEnable()) {
                        Profiler.release(nanos);
                        Map<ProfileEntryKey, ProfileEntryReqStat> requestStatsMap = Profiler.getStatsMap();
                        if (uriStat != null) {
                            uriStat.getProfiletat().record(requestStatsMap);
                        }

                        Profiler.removeLocal();
                    }

                }
            }

            long endNano = System.nanoTime();
            requestStat.setEndNano(endNano);
            long nanos = endNano - startNano;
            this.webAppStat.afterInvoke((Throwable)error, nanos);
            if (sessionStat == null) {
                sessionStat = this.getSessionStat(httpRequest);
                if (sessionStat != null) {
                    sessionStat.beforeInvoke();
                }
            }

            if (sessionStat != null) {
                sessionStat.afterInvoke((Throwable)error, nanos);
                sessionStat.setPrincipal(this.getPrincipal(httpRequest));
            }

            if (uriStat == null) {
                int status = responseWrapper.getStatus();
                if (status == 404) {
                    String errorUrl = this.contextPath + "error_" + status;
                    uriStat = this.webAppStat.getURIStat(errorUrl, true);
                } else {
                    uriStat = this.webAppStat.getURIStat(requestURI, true);
                }

                if (uriStat != null) {
                    uriStat.beforeInvoke();
                }
            }

            if (uriStat != null) {
                uriStat.afterInvoke((Throwable)error, nanos);
            }

            WebRequestStat.set((WebRequestStat)null);
            if (this.isProfileEnable()) {
                Profiler.release(nanos);
                Map<ProfileEntryKey, ProfileEntryReqStat> requestStatsMap = Profiler.getStatsMap();
                if (uriStat != null) {
                    uriStat.getProfiletat().record(requestStatsMap);
                }

                Profiler.removeLocal();
            }

        }
    }

    public boolean isExclusion(String requestURI) {
        if (this.excludesPattern != null && requestURI != null) {
            if (this.contextPath != null && requestURI.startsWith(this.contextPath)) {
                requestURI = requestURI.substring(this.contextPath.length());
                if (!requestURI.startsWith("/")) {
                    requestURI = "/" + requestURI;
                }
            }

            Iterator var2 = this.excludesPattern.iterator();

            String pattern;
            do {
                if (!var2.hasNext()) {
                    return false;
                }

                pattern = (String)var2.next();
            } while(!this.pathMatcher.matches(pattern, requestURI));

            return true;
        } else {
            return false;
        }
    }

    public void init(javax.servlet.FilterConfig config) throws javax.servlet.ServletException {
        String param = config.getInitParameter("exclusions");
        if (param != null && param.trim().length() != 0) {
            this.excludesPattern = new HashSet(Arrays.asList(param.split("\\s*,\\s*")));
        }

        param = config.getInitParameter("principalSessionName");
        if (param != null) {
            param = param.trim();
            if (param.length() != 0) {
                this.principalSessionName = param;
            }
        }

        param = config.getInitParameter("principalCookieName");
        if (param != null) {
            param = param.trim();
            if (param.length() != 0) {
                this.principalCookieName = param;
            }
        }

        param = config.getInitParameter("sessionStatEnable");
        if (param != null && param.trim().length() != 0) {
            param = param.trim();
            if ("true".equals(param)) {
                this.sessionStatEnable = true;
            } else if ("false".equals(param)) {
                this.sessionStatEnable = false;
            } else {
                LOG.error("WebStatFilter Parameter 'sessionStatEnable' config error");
            }
        }

        param = config.getInitParameter("profileEnable");
        if (param != null && param.trim().length() != 0) {
            param = param.trim();
            if ("true".equals(param)) {
                this.profileEnable = true;
            } else if ("false".equals(param)) {
                this.profileEnable = false;
            } else {
                LOG.error("WebStatFilter Parameter 'profileEnable' config error");
            }
        }

        param = config.getInitParameter("sessionStatMaxCount");
        if (param != null && param.trim().length() != 0) {
            param = param.trim();

            try {
                this.sessionStatMaxCount = Integer.parseInt(param);
            } catch (NumberFormatException var4) {
                LOG.error("WebStatFilter Parameter 'sessionStatEnable' config error", var4);
            }
        }

        param = config.getInitParameter("realIpHeader");
        if (param != null) {
            param = param.trim();
            if (param.length() != 0) {
                this.realIpHeader = param;
            }
        }

        StatFilterContext.getInstance().addContextListener(this.statFilterContextListener);
        this.contextPath = DruidWebUtils.getContextPath(config.getServletContext());
        if (this.webAppStat == null) {
            this.webAppStat = new WebAppStat(this.contextPath, this.sessionStatMaxCount);
        }

        WebAppStatManager.getInstance().addWebAppStatSet(this.webAppStat);
    }

    public void destroy() {
        StatFilterContext.getInstance().removeContextListener(this.statFilterContextListener);
        if (this.webAppStat != null) {
            WebAppStatManager.getInstance().remove(this.webAppStat);
        }

    }

    public void setWebAppStat(WebAppStat webAppStat) {
        this.webAppStat = webAppStat;
    }

    public WebAppStat getWebAppStat() {
        return this.webAppStat;
    }

    public AbstractWebStatImplAdaptor.WebStatFilterContextListener getStatFilterContextListener() {
        return this.statFilterContextListener;
    }

    public static final class StatHttpServletResponseWrapper extends HttpServletResponseWrapper implements HttpServletResponse {
        private int status = 200;

        public StatHttpServletResponseWrapper(HttpServletResponse response) {
            super(response);
        }

        public void setStatus(int statusCode) {
            super.setStatus(statusCode);
            this.status = statusCode;
        }


        public void sendError(int statusCode, String statusMessage) throws IOException {
            super.sendError(statusCode, statusMessage);
            this.status = statusCode;
        }

        public void sendError(int statusCode) throws IOException {
            super.sendError(statusCode);
            this.status = statusCode;
        }

        public int getStatus() {
            return this.status;
        }
    }
}
