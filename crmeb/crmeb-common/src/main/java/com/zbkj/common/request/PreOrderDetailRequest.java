package com.zbkj.common.request;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 预下单详情请求对象
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
@Schema(name ="PreOrderRequest对象", description="预下单详情请求对象")
public class PreOrderDetailRequest {

    @Schema(name  = "购物车编号，购物车预下单时必填")
    private Long shoppingCartId;

    @Schema(name  = "商品id（立即购买必填）")
    private Integer productId;

    @Schema(name  = "商品规格属性id（立即购买、活动购买必填）")
    private Integer attrValueId;

    @Schema(name  = "商品数量（立即购买、活动购买必填）")
    private Integer productNum;

    @Schema(name  = "订单编号（再次购买必填）")
    private String orderNo;

    @Schema(name  = "砍价商品id")
    private Integer bargainId = 0;

    @Schema(name  = "用户砍价活动id")
    private Integer bargainUserId = 0;

    @Schema(name  = "拼团商品id")
    private Integer combinationId = 0;

    @Schema(name  = "拼团团长id")
    private Integer pinkId = 0;

    @Schema(name  = "秒杀商品id")
    private Integer seckillId = 0;

}
