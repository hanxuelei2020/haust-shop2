package com.zbkj.common.model.log;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 商品统计
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
@TableName("eb_store_product_log")
@Schema(name ="StoreProductLog对象", description="商品统计")
public class StoreProductLog implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "商品统计表ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @Schema(name  = "类型visit,cart,order,pay,collect,refund")
    private String type;

    @Schema(name  = "商品ID")
    private Integer productId;

    @Schema(name  = "用户ID")
    private Integer uid;

    @Schema(name  = "是否浏览")
    private Boolean visitNum;

    @Schema(name  = "加入购物车数量")
    private Integer cartNum;

    @Schema(name  = "下单数量")
    private Integer orderNum;

    @Schema(name  = "支付数量")
    private Integer payNum;

    @Schema(name  = "支付金额")
    private BigDecimal payPrice;

    @Schema(name  = "商品成本价")
    private BigDecimal costPrice;

    @Schema(name  = "支付用户ID")
    private Integer payUid;

    @Schema(name  = "退款数量")
    private Integer refundNum;

    @Schema(name  = "退款金额")
    private BigDecimal refundPrice;

    @Schema(name  = "收藏")
    private Boolean collectNum;

    @Schema(name  = "添加时间")
    private Long addTime;


}
