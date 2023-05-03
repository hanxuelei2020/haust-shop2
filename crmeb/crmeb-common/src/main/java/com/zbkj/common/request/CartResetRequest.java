package com.zbkj.common.request;


 
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 购物车重选Request对象类
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
public class CartResetRequest {

    @Schema(name  = "购物车id")
    @NotNull(message = "id 不能为空")
    private Long id;

    @Schema(name  = "购物车数量")
    @NotNull(message = "num 不能为空")
    private Integer num;

    @Schema(name  = "商品id")
    @NotNull(message = "productId 不能为空")
    private Integer productId;

    @Schema(name  = "AttrValue Id")
    @NotNull(message = "unique 不能为空")
    private Integer unique;
}
