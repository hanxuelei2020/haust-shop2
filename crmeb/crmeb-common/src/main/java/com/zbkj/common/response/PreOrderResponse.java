package com.zbkj.common.response;

import com.zbkj.common.vo.OrderInfoVo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 预下单响应对象
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
@Schema(name ="PreOrderResponse对象", description="预下单响应对象")
public class PreOrderResponse implements Serializable {

    private static final long serialVersionUID = 7282892323898493847L;

    @Schema(name  = "订单详情对象")
    private OrderInfoVo orderInfoVo;

    @Schema(name  = "预下单订单号")
    private String preOrderNo;

    @Schema(name  = "门店自提是否开启")
    private String storeSelfMention;

    @Schema(name  = "余额支付 1 开启 2 关闭")
    private String yuePayStatus;

    @Schema(name  = "微信支付 1 开启 0 关闭")
    private String payWeixinOpen;

    @Schema(name  = "支付宝支付 1 开启 0 关闭")
    private String aliPayStatus;

}
