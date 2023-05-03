package com.zbkj.common.response;

import com.zbkj.common.model.order.StoreOrder;
import com.zbkj.common.vo.StoreOrderInfoOldVo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 订单列表响应对象
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
@Schema(name ="OrderDetailResponse对象", description="订单列表响应对象")
public class OrderDetailResponse implements Serializable {

    private static final long serialVersionUID = 1387727608277207652L;

    private StoreOrder storeOrder;
    private List<StoreOrderInfoOldVo> cartInfo;
    private String statusPic;
    private Integer offlinePayStatus;


    @Schema(name  = "订单id")
    private Integer id;

    @Schema(name  = "订单编号")
    private String orderId;

    @Schema(name  = "创建时间")
    private Date createTime;

    @Schema(name  = "支付状态")
    private Boolean paid;

    @Schema(name  = "支付时间")
    private Date payTime;

    @Schema(name  = "支付金额")
    private BigDecimal payPrice;

    @Schema(name  = "订单状态（0：待发货；1：待收货；2：已收货，待评价；3：已完成；）")
    private Integer status;

    @Schema(name  = "订单状态")
    private String orderStatus;

    @Schema(name  = "订单商品总数")
    private Integer totalNum;

    @Schema(name  = "支付邮费")
    private BigDecimal payPostage;

    @Schema(name  = "0 未退款 1 申请中 2 已退款 3 退款中")
    private Integer refundStatus;

    @Schema(name  = "快递名称/送货人姓名")
    private String deliveryName;

    @Schema(name  = "发货类型")
    private String deliveryType;

    @Schema(name  = "快递单号/手机号")
    private String deliveryId;

    @Schema(name  = "拼团id 0没有拼团")
    private Integer pinkId;

    @Schema(name  = "砍价id")
    private Integer bargainId;

    @Schema(name  = "核销码")
    private String verifyCode;

    @Schema(name  = "门店id")
    private Integer storeId;

    @Schema(name  = "配送方式 1=快递 ，2=门店自提")
    private Integer shippingType;

    @Schema(name  = "活动类型")
    private String activityType;

    @Schema(name  = "订单详情对象列表")
    private List<OrderInfoResponse> orderInfoList;

    @Schema(name  = "订单类型:0-普通订单，1-视频号订单")
    private Integer type;
}
