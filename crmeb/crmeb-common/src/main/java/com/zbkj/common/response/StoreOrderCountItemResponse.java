package com.zbkj.common.response;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 订单状态数量
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
@Schema(name ="StoreOrderCountItemResponse对象", description="订单状态数量")
public class StoreOrderCountItemResponse implements Serializable {

    private static final long serialVersionUID = -8605913636959651047L;

    @Schema(name  = "总数")
    private Integer all;

    @Schema(name  = "未支付")
    private Integer unPaid;

    @Schema(name  = "未发货")
    private Integer notShipped;

    @Schema(name  = "待收货")
    private Integer spike;

    @Schema(name  = "待评价")
    private Integer bargain;

    @Schema(name  = "交易完成")
    private Integer complete;

    @Schema(name  = "待核销")
    private Integer toBeWrittenOff;

    @Schema(name  = "退款中")
    private Integer refunding;

    @Schema(name  = "已退款")
    private Integer refunded;

    @Schema(name  = "0 未退款 1 申请中 2 已退款")
    private Integer refundStatus;

    @Schema(name  = "已删除")
    private Integer deleted;
}
