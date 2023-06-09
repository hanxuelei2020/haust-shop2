package com.zbkj.common.interceptor;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import java.util.Base64;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *  Swagger 文档
 *  +----------------------------------------------------------------------
 *  | CRMEB [ CRMEB赋能开发者，助力企业发展 ]
 *  +----------------------------------------------------------------------
 *  | Copyright (c) 2016~2022 https://www.crmeb.com All rights reserved.
 *  +----------------------------------------------------------------------
 *  | Licensed CRMEB并不是自由软件，未经许可不能去掉CRMEB相关版权
 *  +----------------------------------------------------------------------
 *  | Author: CRMEB Team <admin@crmeb.com>
 *  +----------------------------------------------------------------------
 */
public class SwaggerInterceptor implements HandlerInterceptor {
    private String username;
    private String password;
    private Boolean check;
    public SwaggerInterceptor(String username, String password, Boolean check) {
        this.username = username;
        this.password = password;
        this.check = check;
    }

    @Override
    public boolean preHandle(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response, Object handler) throws Exception {
        String authorization = request.getHeader("Authorization");
        boolean isAuthSuccess = httpBasicAuth(authorization);
        if (!isAuthSuccess) {
            response.setCharacterEncoding("utf-8");
            response.setStatus(401);
//            response.setStatus(401,"Unauthorized");
            response.setHeader("WWW-authenticate", "Basic realm=\"Realm\"");
            try (PrintWriter writer = response.getWriter()) {
                writer.print("Forbidden, unauthorized user");
            }
        }
        return isAuthSuccess;
    }

    @Override
    public void postHandle(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response, Object handler, Exception ex) throws Exception {
        String uri = request.getRequestURI();
        AntPathMatcher pathMatcher = new AntPathMatcher();
        if (!pathMatcher.match("/swagger-ui.html", uri) && !pathMatcher.match("/webjars/**", uri)) {
            response.setStatus(404);
            return;
        }
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource[] resources = resolver.getResources("classpath:/META-INF/resources" + uri);
        if (resources.length > 0) {
            FileCopyUtils.copy(resources[0].getInputStream(), response.getOutputStream());
        } else {
            response.setStatus(404);
        }
    }

    public boolean httpBasicAuth(String authorization) throws IOException {
        if(check){
            if (authorization != null && authorization.split(" ").length == 2) {
                String userAndPass = new String(Base64.getDecoder().decode(authorization.split(" ")[1]));
                String username = userAndPass.split(":").length == 2 ? userAndPass.split(":")[0] : null;
                String password = userAndPass.split(":").length == 2 ? userAndPass.split(":")[1] : null;
                return this.username.equals(username) && this.password.equals(password);
            }
            return false;
        }
        return true;
    }
}
