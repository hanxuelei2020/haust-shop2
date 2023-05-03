package com.zbkj.common.response;

 
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 订单数量响应对象
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
@Schema(name ="OrderDataResponse对象", description="订单数量响应对象")
public class OrderDataResponse implements Serializable {

    private static final long serialVersionUID = 1387727608277207652L;

    @Schema(name  = "已完成订单数量")
    private Integer completeCount;

    @Schema(name  = "待核销订单数量")
    private Integer evaluatedCount;

//    @Schema(name  = "用户昵称")
//    private Integer verificationCount;

    @Schema(name  = "支付订单总数")
    private Integer orderCount;

    @Schema(name  = "待收货订单数量")
    private Integer receivedCount;

    @Schema(name  = "退款订单数量")
    private Integer refundCount;

    @Schema(name  = "总消费钱数")
    private BigDecimal sumPrice;

    @Schema(name  = "未支付订单数量")
    private Integer unPaidCount;

    @Schema(name  = "待发货订单数量")
    private Integer unShippedCount;
}
