package com.zbkj.common.request;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import org.hibernate.validator.constraints.NotBlank;
import java.util.List;

/**
 * 预下单请求对象
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
@Schema(name ="PreOrderRequest对象", description="预下单请求对象")
public class PreOrderRequest {

    @Schema(name  = "预下单类型（“shoppingCart”：购物车下单，“buyNow”：立即购买，”again“： 再次购买，”video“: 视频号商品下单）")
    @NotBlank(message = "预下单类型不能为空")
    private String preOrderType;

    @Schema(name  = "订单详情列表")
    private List<PreOrderDetailRequest> orderDetails;

}
