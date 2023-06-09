package com.zbkj.admin.pub;

import com.zbkj.admin.service.WeChatMessageService;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * 微信缓存表 前端控制器
 * +----------------------------------------------------------------------
 * | CRMEB [ CRMEB赋能开发者，助力企业发展 ]
 * +----------------------------------------------------------------------
 * | Copyright (c) 2016~2022 https://www.crmeb.com All rights reserved.
 * +----------------------------------------------------------------------
 * | Licensed CRMEB并不是自由软件，未经许可不能去掉CRMEB相关版权
 * +----------------------------------------------------------------------
 * | Author: CRMEB Team <admin@crmeb.com>
 * +----------------------------------------------------------------------
 */
@Slf4j
@RestController
@RequestMapping("api/public/wechat/message")
@Tag(name ="微信开放平台 -- 消息")
public class WeChatMessageController {

    @Autowired
    private WeChatMessageService weChatMessageService;

    /**
     * 微信关键字回复
     * @author Mr.Zhang
     * @since 2020-04-22
     */
    @Operation(summary = "接受微信推送过来的消息")
    @RequestMapping(value = "/webHook", method = RequestMethod.POST)
    public String webHook(HttpServletRequest request){
       return weChatMessageService.init(request);
    }

    /**
     * 微信推送地址验证
     * @param signature
     * @param timestamp
     * @param nonce
     * @param echostr
     * @param response
     * @throws IOException
     */
    @RequestMapping(value = { "/webHook" }, method = RequestMethod.GET)
    private void webHook(
            @RequestParam(value = "signature", required = false) String signature,
            @RequestParam(value = "timestamp", required = false) String timestamp,
            @RequestParam(value = "nonce", required = false) String nonce,
            @RequestParam(value = "echostr") String echostr,
            HttpServletResponse response) throws IOException {
        PrintWriter writer = response.getWriter();
        writer.print(echostr);
        writer.flush();
        writer.close();
    }
}



