package com.zbkj.common.adaptor;

import com.alibaba.druid.filter.stat.StatFilterContextListenerAdapter;
import com.alibaba.druid.support.http.AbstractWebStatImpl;
import com.alibaba.druid.support.http.stat.WebAppStat;
import com.alibaba.druid.support.http.stat.WebRequestStat;
import com.alibaba.druid.support.http.stat.WebSessionStat;
import com.alibaba.druid.support.logging.Log;
import com.alibaba.druid.support.logging.LogFactory;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;


public class AbstractWebStatImplAdaptor {
    private static final Log LOG = LogFactory.getLog(AbstractWebStatImpl.class);
    public static final int DEFAULT_MAX_STAT_SESSION_COUNT = 1000;
    protected WebAppStat webAppStat;
    protected boolean sessionStatEnable = true;
    protected int sessionStatMaxCount = 1000;
    protected boolean createSession;
    protected boolean profileEnable;
    protected String contextPath;
    protected String principalSessionName;
    protected String principalCookieName;
    protected String realIpHeader;
    protected WebStatFilterContextListener statFilterContextListener = new WebStatFilterContextListener();

    public AbstractWebStatImplAdaptor() {
    }

    public boolean isSessionStatEnable() {
        return this.sessionStatEnable;
    }

    public void setSessionStatEnable(boolean sessionStatEnable) {
        this.sessionStatEnable = sessionStatEnable;
    }

    public boolean isProfileEnable() {
        return this.profileEnable;
    }

    public void setProfileEnable(boolean profileEnable) {
        this.profileEnable = profileEnable;
    }

    public String getContextPath() {
        return this.contextPath;
    }

    public int getSessionStatMaxCount() {
        return this.sessionStatMaxCount;
    }

    public String getRequestURI(HttpServletRequest request) {
        return request.getRequestURI();
    }

    public String getPrincipalSessionName() {
        return this.principalSessionName;
    }

    public String getPrincipalCookieName() {
        return this.principalCookieName;
    }

    public WebSessionStat getSessionStat(HttpServletRequest request) {
        if (!this.isSessionStatEnable()) {
            return null;
        } else {
            WebSessionStat sessionStat = null;
            String sessionId = this.getSessionId(request);
            if (sessionId != null) {
                sessionStat = this.webAppStat.getSessionStat(sessionId, true);
            }

            if (sessionStat != null) {
                long currentMillis = System.currentTimeMillis();
                String userAgent = request.getHeader("user-agent");
                if (sessionStat.getCreateTimeMillis() == -1L) {
                    HttpSession session = request.getSession(false);
                    if (session != null) {
                        sessionStat.setCreateTimeMillis(session.getCreationTime());
                    } else {
                        sessionStat.setCreateTimeMillis(currentMillis);
                    }

                    this.webAppStat.computeUserAgent(userAgent);
                    this.webAppStat.incrementSessionCount();
                }

                sessionStat.setUserAgent(userAgent);
                String ip = this.getRemoteAddress(request);
                sessionStat.addRemoteAddress(ip);
            }

            return sessionStat;
        }
    }

    protected String getRemoteAddress(HttpServletRequest request) {
        String ip = null;
        if (this.realIpHeader != null && this.realIpHeader.length() != 0) {
            ip = request.getHeader(this.realIpHeader);
        }

        if (ip == null || ip.length() == 0) {
            ip = DruidWebUtilsAdaptor.getRemoteAddr(request);
        }

        return ip;
    }

    public String getSessionId(HttpServletRequest httpRequest) {
        String sessionId = null;
        HttpSession session = httpRequest.getSession(this.createSession);
        if (session != null) {
            sessionId = session.getId();
        } else {
            Cookie[] cookies = httpRequest.getCookies();
            if (cookies != null) {
                Cookie[] var5 = cookies;
                int var6 = cookies.length;

                int var7;
                Cookie cookie;
                for(var7 = 0; var7 < var6; ++var7) {
                    cookie = var5[var7];
                    if (cookie.getName().equals("JSESSIONID")) {
                        sessionId = cookie.getValue();
                        break;
                    }
                }

                if (sessionId == null) {
                    var5 = cookies;
                    var6 = cookies.length;

                    for(var7 = 0; var7 < var6; ++var7) {
                        cookie = var5[var7];
                        if (cookie.getName().equals("JWT-SESSION")) {
                            sessionId = cookie.getValue();
                            break;
                        }
                    }
                }
            }
        }

        return sessionId;
    }

    public String getPrincipal(HttpServletRequest httpRequest) {
        if (this.principalSessionName != null) {
            HttpSession session = httpRequest.getSession(this.createSession);
            if (session == null) {
                return null;
            } else {
                Object sessionValue = null;

                try {
                    sessionValue = session.getAttribute(this.principalSessionName);
                } catch (Exception var6) {
                    if (LOG.isErrorEnabled()) {
                        LOG.error("session.getAttribute error", var6);
                    }
                }

                return sessionValue == null ? null : sessionValue.toString();
            }
        } else {
            if (this.principalCookieName != null && httpRequest.getCookies() != null) {
                Cookie[] var2 = httpRequest.getCookies();
                int var3 = var2.length;

                for(int var4 = 0; var4 < var3; ++var4) {
                    Cookie cookie = var2[var4];
                    if (this.principalCookieName.equals(cookie.getName())) {
                        return cookie.getValue();
                    }
                }
            }

            return null;
        }
    }

    public class WebStatFilterContextListener extends StatFilterContextListenerAdapter {
        public WebStatFilterContextListener() {
        }

        public void addUpdateCount(int updateCount) {
            WebRequestStat reqStat = WebRequestStat.current();
            if (reqStat != null) {
                reqStat.addJdbcUpdateCount((long)updateCount);
            }

        }

        public void addFetchRowCount(int fetchRowCount) {
            WebRequestStat reqStat = WebRequestStat.current();
            if (reqStat != null) {
                reqStat.addJdbcFetchRowCount((long)fetchRowCount);
            }

        }

        public void executeBefore(String sql, boolean inTransaction) {
            WebRequestStat reqStat = WebRequestStat.current();
            if (reqStat != null) {
                reqStat.incrementJdbcExecuteCount();
            }

        }

        public void executeAfter(String sql, long nanos, Throwable error) {
            WebRequestStat reqStat = WebRequestStat.current();
            if (reqStat != null) {
                reqStat.addJdbcExecuteTimeNano(nanos);
                if (error != null) {
                    reqStat.incrementJdbcExecuteErrorCount();
                }
            }

        }

        public void commit() {
            WebRequestStat reqStat = WebRequestStat.current();
            if (reqStat != null) {
                reqStat.incrementJdbcCommitCount();
            }

        }

        public void rollback() {
            WebRequestStat reqStat = WebRequestStat.current();
            if (reqStat != null) {
                reqStat.incrementJdbcRollbackCount();
            }

        }

        public void pool_connect() {
            WebRequestStat reqStat = WebRequestStat.current();
            if (reqStat != null) {
                reqStat.incrementJdbcPoolConnectCount();
            }

        }

        public void pool_close(long nanos) {
            WebRequestStat reqStat = WebRequestStat.current();
            if (reqStat != null) {
                reqStat.incrementJdbcPoolCloseCount();
            }

        }

        public void resultSet_open() {
            WebRequestStat reqStat = WebRequestStat.current();
            if (reqStat != null) {
                reqStat.incrementJdbcResultSetOpenCount();
            }

        }

        public void resultSet_close(long nanos) {
            WebRequestStat reqStat = WebRequestStat.current();
            if (reqStat != null) {
                reqStat.incrementJdbcResultSetCloseCount();
            }

        }
    }
}
