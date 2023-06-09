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
public class TemplateMessageVo {
    @Schema(name  = "OPENID", required = true)
    private String touser;

    @Schema(name  = "模板ID", required = true)
    private String template_id;

    @Schema(name  = "模板跳转链接（海外帐号没有跳转能力）")
    private String url;

    @Schema(name  = "发送内容")
    private HashMap<String, SendTemplateMessageItemVo> data;
}
