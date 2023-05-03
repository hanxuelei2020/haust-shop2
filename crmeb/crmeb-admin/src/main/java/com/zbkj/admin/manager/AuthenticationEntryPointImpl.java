package com.zbkj.admin.manager;

import com.alibaba.fastjson.JSONObject;
import com.zbkj.common.response.CommonResult;
import jakarta.servlet.ServletException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serializable;

/**
 * 认证失败处理类 返回未授权
 */
@Component
public class AuthenticationEntryPointImpl implements AuthenticationEntryPoint, Serializable {

    private static final long serialVersionUID = -8970718410437077606L;


    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        //        String msg = StrUtil.format("请求访问：{}，认证失败，无法访问系统资源", httpServletRequest.getRequestURI());
        response.setStatus(200);
        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");
        try {
            response.getWriter().print(JSONObject.toJSONString(CommonResult.unauthorized()));
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
