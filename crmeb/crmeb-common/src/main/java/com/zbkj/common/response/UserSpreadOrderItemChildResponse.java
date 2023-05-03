package com.zbkj.common.response;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 推广订单信息子集
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
@Schema(name ="UserSpreadOrderItemChildResponse对象", description="推广订单信息子集")
public class UserSpreadOrderItemChildResponse implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "订单号")
    private String orderId;

    @Schema(name  = "返佣时间")
    private Date time;

    @Schema(name  = "返佣金额")
    private BigDecimal number;

    @Schema(name  = "用户头像")
    private String avatar;

    @Schema(name  = "用户昵称")
    private String nickname;

    @Schema(name  = "订单显示类型")
    private String type;
}
