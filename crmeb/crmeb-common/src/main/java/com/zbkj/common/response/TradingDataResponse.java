package com.zbkj.common.response;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 交易概览数据对象
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
@Schema(name ="TradingDataResponse对象", description="交易概览数据对象")
public class TradingDataResponse implements Serializable {

    private static final long serialVersionUID = -6332062115310922579L;

    @Schema(name  = "营业额")
    private BigDecimal turnover;

    @Schema(name  = "营业额环比")
    private String turnoverRatio;

    @Schema(name  = "商品支付金额")
    private BigDecimal proPayAmount;

    @Schema(name  = "商品支付金额环比")
    private String proPayAmountRatio;

    @Schema(name  = "充值金额")
    private BigDecimal rechargeAmount;

    @Schema(name  = "充值金额环比")
    private String rechargeAmountRatio;

    @Schema(name  = "支出金额")
    private BigDecimal payoutAmount;

    @Schema(name  = "支出金额环比")
    private String payoutAmountRatio;

    @Schema(name  = "余额支付金额")
    private BigDecimal balanceAmount;

    @Schema(name  = "余额支付金额月环比")
    private String balanceAmountRatio;

    @Schema(name  = "支付佣金金额")
    private BigDecimal payoutBrokerageAmount;

    @Schema(name  = "支付佣金金额环比")
    private String payoutBrokerageAmountRatio;

    @Schema(name  = "商品退款金额")
    private BigDecimal proRefundAmount;

    @Schema(name  = "商品退款金额环比")
    private String proRefundAmountRatio;

}
