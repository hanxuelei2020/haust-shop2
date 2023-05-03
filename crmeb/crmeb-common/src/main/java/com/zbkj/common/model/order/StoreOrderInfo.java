package com.zbkj.common.model.order;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 订单购物详情表
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
@TableName("eb_store_order_info")
@Schema(name ="StoreOrderInfo对象", description="订单购物详情表")
public class StoreOrderInfo implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @Schema(name  = "订单id")
    private Integer orderId;

    @Schema(name  = "商品ID")
    private Integer productId;

    @Schema(name  = "购买东西的详细信息")
    private String info;

    @Schema(name  = "唯一id")
    @TableField(value = "`unique`")
    private String unique;

    @Schema(name  = "订单号")
    private String orderNo;

    @Schema(name  = "商品名称")
    private String productName;

    @Schema(name  = "规格属性id")
    private Integer attrValueId;

    @Schema(name  = "商品图片")
    private String image;

    @Schema(name  = "sku")
    private String sku;

    @Schema(name  = "单价")
    private BigDecimal price;

    @Schema(name  = "购买数量")
    private Integer payNum;

    @Schema(name  = "重量")
    private BigDecimal weight;

    @Schema(name  = "体积")
    private BigDecimal volume;

    @Schema(name  = "获得积分")
    private Integer giveIntegral;

    @Schema(name  = "是否评价")
    private Boolean isReply;

    @Schema(name  = "是否单独分佣")
    private Boolean isSub;

    @Schema(name  = "会员价")
    private BigDecimal vipPrice;

    @Schema(name  = "商品类型:0-普通，1-秒杀，2-砍价，3-拼团，4-视频号")
    private Integer productType;
}
