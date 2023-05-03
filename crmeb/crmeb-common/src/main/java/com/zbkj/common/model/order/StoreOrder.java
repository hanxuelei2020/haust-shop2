package com.zbkj.common.model.order;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单表
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
@TableName("eb_store_order")
@Schema(name ="StoreOrder对象", description="订单表")
public class StoreOrder implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "订单ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @Schema(name  = "订单号")
    private String orderId;

    @Schema(name  = "用户id")
    private Integer uid;

    @Schema(name  = "用户姓名")
    private String realName;

    @Schema(name  = "用户电话")
    private String userPhone;

    @Schema(name  = "详细地址")
    private String userAddress;

    @Schema(name  = "运费金额")
    private BigDecimal freightPrice;

    @Schema(name  = "订单商品总数")
    private Integer totalNum;

    @Schema(name  = "订单总价")
    private BigDecimal totalPrice;

    @Schema(name  = "邮费")
    private BigDecimal totalPostage;

    @Schema(name  = "实际支付金额")
    private BigDecimal payPrice;

    @Schema(name  = "支付邮费")
    private BigDecimal payPostage;

    @Schema(name  = "抵扣金额")
    private BigDecimal deductionPrice;

    @Schema(name  = "优惠券id")
    private Integer couponId;

    @Schema(name  = "优惠券金额")
    private BigDecimal couponPrice;

    @Schema(name  = "支付状态")
    private Boolean paid;

    @Schema(name  = "支付时间")
    private Date payTime;

    @Schema(name  = "支付方式")
    private String payType;

    @Schema(name  = "创建时间")
    private Date createTime;

    @Schema(name  = "订单状态（0：待发货；1：待收货；2：已收货，待评价；3：已完成；）")
    private Integer status;

    @Schema(name  = "0 未退款 1 申请中 2 已退款 3 退款中")
    private Integer refundStatus;

    @Schema(name  = "退款图片")
    private String refundReasonWapImg;

    @Schema(name  = "退款用户说明")
    private String refundReasonWapExplain;

    @Schema(name  = "前台退款原因")
    private String refundReasonWap;

    @Schema(name  = "不退款的理由")
    private String refundReason;

    @Schema(name  = "退款时间")
    private Date refundReasonTime;

    @Schema(name  = "退款金额")
    private BigDecimal refundPrice;

    @Schema(name  = "快递名称/送货人姓名")
    private String deliveryName;

    @Schema(name  = "发货类型")
    private String deliveryType;

    @Schema(name  = "快递单号/手机号")
    private String deliveryId;

    @Schema(name  = "消费赚取积分")
    private Integer gainIntegral;

    @Schema(name  = "使用积分")
    private Integer useIntegral;

    @Schema(name  = "给用户退了多少积分")
    private Integer backIntegral;

    @Schema(name  = "备注")
    private String mark;

    @Schema(name  = "是否删除")
    private Boolean isDel;

    @Schema(name  = "管理员备注")
    private String remark;

    @Schema(name  = "商户ID")
    private Integer merId;

    private Integer isMerCheck;

    @Schema(name  = "拼团商品id0一般商品")
    private Integer combinationId;

    @Schema(name  = "拼团id 0没有拼团")
    private Integer pinkId;

    @Schema(name  = "成本价")
    private BigDecimal cost;

    @Schema(name  = "秒杀商品ID")
    private Integer seckillId;

    @Schema(name  = "砍价id")
    private Integer bargainId;

    @Schema(name  = "用户砍价活动id")
    private Integer bargainUserId;

    @Schema(name  = "核销码")
    private String verifyCode;

    @Schema(name  = "门店id")
    private Integer storeId;

    @Schema(name  = "配送方式 1=快递 ，2=门店自提")
    private Integer shippingType;

    @Schema(name  = "店员id")
    private Integer clerkId;

    @Schema(name  = "支付渠道(0-微信公众号,1-微信小程序,2-H5,3-余额,4-微信AppIos,5-微信AppIos安卓,6-支付宝支付，7-支付宝app支付)")
    private Integer isChannel;

    @Schema(name  = "消息提醒")
    private Boolean isRemind;

    @Schema(name  = "后台是否删除")
    private Boolean isSystemDel;

    @Schema(name  = "更新时间")
    private Date updateTime;

    @Schema(name  = "快递公司简称")
    private String deliveryCode;

    @Schema(name  = "订单类型:0-普通订单，1-视频号订单")
    private Integer type;

    @Schema(name  = "商品总价")
    private BigDecimal proTotalPrice;

    @Schema(name  = "改价前支付金额")
    private BigDecimal beforePayPrice;

    @Schema(name  = "是否改价,0-否，1-是")
    private Boolean isAlterPrice;

    @Schema(name  = "商户系统内部的订单号,32个字符内、可包含字母, 其他说明见商户订单号")
    private String outTradeNo;
}
