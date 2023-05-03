package com.zbkj.common.request;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.Min;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.LinkedHashMap;

/**
 * 商品属性值表
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
@Schema(name ="StoreProductAttrValueRequest对象", description="商品属性值表")
public class StoreProductAttrValueRequest implements Serializable {

    private static final long serialVersionUID=1L;
    @Schema(name  = "ID")
    private Integer id;

    @Schema(name  = "商品ID", example = "0")
    @Min(value = 0, message = "请选择商品")
    private Integer productId;

    @Schema(name  = "商品属性索引值 (attr_value|attr_value[|....])")
    private String suk;

    @Schema(name  = "属性对应的库存")
    private Integer stock;

    @Schema(name  = "销量")
    private Integer sales;

    @Schema(name  = "属性金额")
    private BigDecimal price;

    @Schema(name  = "图片")
    private String image;

    @Schema(name  = "唯一值")
    private String unique;

    @Schema(name  = "成本价")
    private BigDecimal cost;

    @Schema(name  = "商品条码")
    private String barCode;

    @Schema(name  = "原价")
    private BigDecimal otPrice;

    @Schema(name  = "重量")
    private BigDecimal weight;

    @Schema(name  = "体积")
    private BigDecimal volume;

    @Schema(name  = "一级返佣")
    private BigDecimal brokerage;

    @Schema(name  = "二级返佣")
    private BigDecimal brokerageTwo;

    @Schema(name  = "活动类型 0=商品，1=秒杀，2=砍价，3=拼团")
    private Integer type;

    @Schema(name  = "活动限购数量")
    private Integer quota;

    @Schema(name  = "活动限购数量显示")
    private Integer quotaShow;

    @Schema(name  = "创建时间")
    private Date createTime;

    @Schema(name  = "更新时间")
    private Date updateTime;

    @Schema(name  = "attrValue字段，前端传递后用作sku字段")
    private String attrValue;

    @Schema(name  = "是否选中-秒杀用")
    private Boolean checked;

    @Schema(name  = "砍价商品最低价")
    private BigDecimal minPrice;
}
