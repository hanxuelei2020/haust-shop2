package com.zbkj.common.request;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import org.hibernate.validator.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;

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
@Schema(name ="StoreProductAttrValueAddRequest对象", description="商品规格属性添加对象")
public class StoreProductAttrValueAddRequest implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "ID")
    private Integer id;

    @Schema(name  = "商品ID|添加时为0，修改时为商品id", example = "0", required = true)
    @Min(value = 0, message = "请选择商品")
    private Integer productId;

    @Schema(name  = "商品规格属性库存", required = true)
    @NotNull(message = "商品规格属性库存不能为空")
    @Min(value = 0, message = "库存不能小于0")
    private Integer stock;

    @Schema(name  = "sku|活动商品必传")
    private String suk;

//    @Schema(name  = "销量", required = true)
//    @NotNull(message = "销量不能为空")
//    @Min(value = 0, message = "销量不能小于0")
//    private Integer sales;

    @Schema(name  = "规格属性金额", required = true)
    @NotNull(message = "规格属性金额不能为空")
    @DecimalMin(value = "0", message = "金额不能小于0")
    private BigDecimal price;

    @Schema(name  = "图片", required = true)
    @NotBlank(message = "商品规格属性图片不能为空")
    private String image;

    @Schema(name  = "成本价", required = true)
    @NotNull(message = "规格属性成本价不能为空")
    @DecimalMin(value = "0", message = "成本价不能小于0")
    private BigDecimal cost;

    @Schema(name  = "原价", required = true)
    @NotNull(message = "规格属性原价不能为空")
    @DecimalMin(value = "0", message = "原价不能小于0")
    private BigDecimal otPrice;

    @Schema(name  = "重量", required = true)
    @NotNull(message = "规格属性重量不能为空")
    @DecimalMin(value = "0", message = "重量不能小于0")
    private BigDecimal weight;

    @Schema(name  = "体积", required = true)
    @NotNull(message = "规格属性体积不能为空")
    @DecimalMin(value = "0", message = "体积不能小于0")
    private BigDecimal volume;

    @Schema(name  = "一级返佣", required = true)
    @NotNull(message = "规格属性一级返佣不能为空")
    @DecimalMin(value = "0", message = "一级返佣不能小于0")
    private BigDecimal brokerage;

    @Schema(name  = "二级返佣", required = true)
    @NotNull(message = "规格属性二级返佣不能为空")
    @DecimalMin(value = "0", message = "二级返佣不能小于0")
    private BigDecimal brokerageTwo;

    @Schema(name  = "attr_values 创建更新时的属性对应", required = true, example = "{\"尺码\":\"2XL\",\"颜色\":\"DX027白色\"}")
    @NotBlank(message = "attr_values不能为空")
    private String attrValue;

    @Schema(name  = "活动限购数量|活动商品专用字段")
    private Integer quota;

    @Schema(name  = "活动限购数量显示|活动商品专用字段,添加时不传")
    private Integer quotaShow;

//    @Schema(name  = "是否选中-秒杀用")
//    private Boolean checked;

    @Schema(name  = "砍价商品最低价|砍价专用")
    private BigDecimal minPrice;
}
