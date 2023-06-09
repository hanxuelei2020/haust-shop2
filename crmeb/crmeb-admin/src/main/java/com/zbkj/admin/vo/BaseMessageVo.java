package com.zbkj.admin.vo;

import com.zbkj.common.utils.DateUtil;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 微信消息基础模板
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
@Schema(name ="BaseMessageVo对象", description="微信消息基础模板")
public class BaseMessageVo{
    @Schema(name  = "开发者微信号")
    protected String ToUserName;

    @Schema(name  = "发送方帐号（一个OpenID）")
    protected String FromUserName;

    @Schema(name  = "消息创建时间 （整型）")
    protected Long CreateTime = DateUtil.getTime();

    @Schema(name  = "消息类型，文本为text")
    protected String MsgType = "text";
}
