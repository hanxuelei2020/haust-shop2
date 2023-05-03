package com.zbkj.common.response;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 购物车详情响应对象
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
@Schema(name ="CartInfoResponse对象", description="购物车详情响应对象")
public class CartInfoResponse implements Serializable {

    private static final long serialVersionUID = 3558884699193209193L;

    @Schema(name  = "购物车表ID")
    private Long id;

    @Schema(name  = "商品ID")
    private Integer productId;

    @Schema(name  = "商品属性")
    private String productAttrUnique;

    @Schema(name  = "商品数量")
    private Integer cartNum;

    @Schema(name  = "商品图片")
    private String image;

    @Schema(name  = "商品名称")
    private String storeName;

    @Schema(name  = "商品规格id")
    private Integer attrId;

    @Schema(name  = "商品属性索引值 (attr_value|attr_value[|....])")
    private String suk;

    @Schema(name  = "sku价格")
    private BigDecimal price;

    @Schema(name  = "商品是否有效")
    private Boolean attrStatus;

    @Schema(name  = "sku库存")
    private Integer stock;

    @Schema(name  = "sku会员价格")
    private BigDecimal vipPrice;
}
