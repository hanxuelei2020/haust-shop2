package com.zbkj.common.response;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

/**
 * 首页商品对象
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
@Schema(name ="IndexProductResponse对象", description="首页商品对象")
public class IndexProductResponse {


    @Schema(name  = "商品id")
    private Integer id;

    @Schema(name  = "商品图片")
    private String image;

    @Schema(name  = "商品名称")
    private String storeName;

    @Schema(name  = "商品价格")
    private BigDecimal price;

    @Schema(name  = "市场价")
    private BigDecimal otPrice;

    @Schema(name  = "销量")
    private Integer sales;

    @Schema(name  = "虚拟销量")
    private Integer ficti;

    @Schema(name  = "单位名")
    private String unitName;

    @Schema(name  = "活动显示排序0=默认，1=秒杀，2=砍价，3=拼团")
    private String activity;

    @Schema(name  = "为移动端特定参数")
    private ProductActivityItemResponse activityH5;

    @Schema(name  = "购物车商品数量")
    private Integer cartNum;

    @Schema(name  = "库存")
    private Integer stock;

    @Schema(name  = "展示图")
    private String flatPattern;
}
