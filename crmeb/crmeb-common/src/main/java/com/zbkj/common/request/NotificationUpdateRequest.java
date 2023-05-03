package com.zbkj.common.request;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import org.hibernate.validator.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 系统通知修改请求对象
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
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Schema(name ="NotificationUpdateRequest对象", description="系统通知修改请求对象")
public class NotificationUpdateRequest implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "通知id")
    @NotNull(message = "通知id不能为空")
    private Integer id;

    @Schema(name  = "wechat-公众号模板消息，routine-小程序订阅消息，sms-短信")
    @NotEmpty(message = "详情类型不能为空")
    private String detailType;

    @Schema(name  = "模板id(wechat、routine)")
    private String tempId;

    @Schema(name  = "状态,1-开启，2-关闭")
    @NotNull(message = "状态不能为空")
    private Integer status;
}
