package com.zbkj.common.vo;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.HashMap;

/**
 * 微信模板发送类
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
@Schema(name ="SendTemplateMessageVo对象", description="微信模板发送类")
public class ProgramTemplateMessageVo {
    @Schema(name  = "OPENID", required = true)
    private String touser;

    @Schema(name  = "模板ID", required = true)
    private String template_id;

    @Schema(name  = "模板跳转链接小程序地址")
    private String page;

    @Schema(name  = "发送内容", required = true)
    private HashMap<String, SendProgramTemplateMessageItemVo> data;

    @Schema(name  = "跳转小程序类型：developer为开发版；trial为体验版；formal为正式版；默认为正式版")
    private String miniprogram_state = "formal";

    @Schema(name  = "进入小程序查看”的语言类型，支持zh_CN(简体中文)、en_US(英文)、zh_HK(繁体中文)、zh_TW(繁体中文)，默认为zh_CN\n")
    private String lang = "zh_CN";
}
