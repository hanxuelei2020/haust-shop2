package com.zbkj.common.response;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 首页经营数据响应对象
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
@Schema(name ="HomeOperatingDataResponse对象", description="首页经营数据响应对象")
public class HomeOperatingDataResponse implements Serializable {

    private static final long serialVersionUID = -1486435421582495511L;

    @Schema(name  = "待发货订单数量")
    private Integer notShippingOrderNum;

    @Schema(name  = "退款中订单数量")
    private Integer refundingOrderNum;

    @Schema(name  = "待核销订单数量")
    private Integer notWriteOffOrderNum;

    @Schema(name  = "库存预警商品数量")
    private Integer vigilanceInventoryNum;

    @Schema(name  = "上架商品数量")
    private Integer onSaleProductNum;

    @Schema(name  = "仓库中商品数量")
    private Integer notSaleProductNum;

    @Schema(name  = "提现申请待审核数量")
    private Integer notAuditNum;

    @Schema(name  = "用户充值总金额")
    private BigDecimal totalRechargeAmount;

}
