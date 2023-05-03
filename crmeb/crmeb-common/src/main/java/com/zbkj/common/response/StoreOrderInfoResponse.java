package com.zbkj.common.response;

import com.zbkj.common.vo.StoreOrderInfoOldVo;
import com.zbkj.common.model.system.SystemStore;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 订单详情响应对象
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
@Schema(name ="StoreOrderInfoResponse对象", description="订单详情响应对象")
public class StoreOrderInfoResponse implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "订单ID")
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

    @Schema(name  = "订单商品总数")
    private Integer totalNum;

    @Schema(name  = "订单总价")
    private BigDecimal totalPrice;

    @Schema(name  = "实际支付金额")
    private BigDecimal payPrice;

    @Schema(name  = "支付邮费")
    private BigDecimal payPostage;

    @Schema(name  = "优惠券金额")
    private BigDecimal couponPrice;

    @Schema(name  = "抵扣金额")
    private BigDecimal deductionPrice;

    @Schema(name  = "支付方式")
    private String payType;

    @Schema(name  = "创建时间")
    private Date createTime;

    @Schema(name  = "订单状态（-1 : 申请退款 -2 : 退货成功 0：待发货；1：待收货；2：已收货；3：待评价；-1：已退款）")
    private Integer status;

    @Schema(name  = "0 未退款 1 申请中 2 已退款")
    private Integer refundStatus;

    @Schema(name  = "快递名称/送货人姓名")
    private String deliveryName;

    @Schema(name  = "发货类型")
    private String deliveryType;

    @Schema(name  = "快递单号/手机号")
    private String deliveryId;

    @Schema(name  = "备注")
    private String mark;

    @Schema(name  = "是否删除")
    private Boolean isDel;

    @Schema(name  = "管理员备注")
    private String remark;

    @Schema(name  = "退款金额")
    private BigDecimal refundPrice;

    @Schema(name  = "使用积分")
    private Integer useIntegral;

    @Schema(name  = "给用户退了多少积分")
    private Integer backIntegral;

    @Schema(name  = "核销码")
    private String verifyCode;

    @Schema(name  = "配送方式 1=快递 ，2=门店自提")
    private Integer shippingType;

    @Schema(name  = "订单状态")
    private Map<String, String> statusStr;

    @Schema(name  = "支付方式")
    private String payTypeStr;

    @Schema(name  = "用户昵称")
    private String nikeName;

    @Schema(name  = "用户电话")
    private String phone;

    @Schema(name  = "订单商品详情")
    List<StoreOrderInfoOldVo> orderInfo;

    @Schema(name  = "提货点")
    private SystemStore systemStore;

    @Schema(name  = "推广人名称")
    private String spreadName;

    @Schema(name  = "商品总价")
    private BigDecimal proTotalPrice;

    @Schema(name  = "退款时间")
    private Date refundReasonTime;
}
