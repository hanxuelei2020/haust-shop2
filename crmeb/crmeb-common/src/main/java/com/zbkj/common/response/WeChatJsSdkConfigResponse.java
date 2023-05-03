package com.zbkj.common.response;

import com.baomidou.mybatisplus.annotation.TableField;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 微信公众号js-sdk响应对象
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
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Schema(name ="WeChatJsSdkConfigResponse对象", description="微信公众号js-sdk响应对象对象")
public class WeChatJsSdkConfigResponse implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "url")
    private String url;

    @Schema(name  = "jsApiTicket")
    private String jsApiTicket;

    @Schema(name  = "nonceStr")
    private String nonceStr;

    @Schema(name  = "timestamp")
    private Long timestamp;

    @Schema(name  = "signature")
    private String signature;

    @Schema(name  = "jsApiList")
    private List<String> jsApiList;

    @Schema(name  = "debug")
    private Boolean debug;

    @Schema(name  = "appid")
    private String appId;
}
