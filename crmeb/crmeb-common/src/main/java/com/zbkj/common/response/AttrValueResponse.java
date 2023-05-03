package com.zbkj.common.response;

import com.baomidou.mybatisplus.annotation.TableName;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.Min;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品属性值响应对象
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
@Schema(name ="AttrValueResponse对象", description="商品属性值响应对象")
public class AttrValueResponse implements Serializable {

    private static final long serialVersionUID=1L;
    @Schema(name  = "ID")
    private Integer id;

    @Schema(name  = "商品ID")
    private Integer productId;

    @Schema(name  = "sku")
    private String suk;

    @Schema(name  = "属性对应的库存")
    private Integer stock;

    @Schema(name  = "销量")
    private Integer sales;

    @Schema(name  = "属性金额")
    private BigDecimal price;

    @Schema(name  = "图片")
    private String image;

    @Schema(name  = "成本价")
    private BigDecimal cost;

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

    @Schema(name  = "attrValue字段")
    private String attrValue;

    @Schema(name  = "砍价商品最低价|砍价专用字段")
    private BigDecimal minPrice;
}
