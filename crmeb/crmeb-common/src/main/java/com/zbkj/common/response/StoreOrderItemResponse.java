package com.zbkj.common.response;

import com.zbkj.common.vo.StoreOrderInfoOldVo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

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
@Schema(name ="StoreOrderItemResponse对象", description="核销订单")
public class StoreOrderItemResponse implements Serializable {

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

    @Schema(name  = "订单总价")
    private BigDecimal totalPrice;

    @Schema(name  = "实际支付金额")
    private BigDecimal payPrice;

    @Schema(name  = "支付状态")
    private Boolean paid;

    @Schema(name  = "支付时间")
    private Date payTime;

    @Schema(name  = "支付方式")
    private String payType;

    @Schema(name  = "创建时间")
    private Date createTime;

    @Schema(name  = "订单状态（-1 : 申请退款 -2 : 退货成功 0：待发货；1：待收货；2：已收货；3：待评价；-1：已退款）")
    private Integer status;

    @Schema(name  = "门店名称")
    private String storeName;

    @Schema(name  = "店员名称")
    private String clerkName;

    @Schema(name  = "商品信息")
    private List<StoreOrderInfoOldVo> productList = new ArrayList<>();

    @Schema(name  = "订单状态")
    private Map<String, String> statusStr;

    @Schema(name  = "支付方式")
    private String payTypeStr;

    @Schema(name  = "邮费")
    private BigDecimal totalPostage;

    @Schema(name  = "支付邮费")
    private BigDecimal payPostage;

    @Schema(name  = "消费赚取积分")
    private BigDecimal gainIntegral;

    @Schema(name  = "使用积分")
    private BigDecimal useIntegral;

    @Schema(name  = "给用户退了多少积分")
    private BigDecimal backIntegral;

    @Schema(name  = "是否删除")
    private Boolean isDel;

    @Schema(name  = "后台是否删除")
    private Boolean isSystemDel;

    @Schema(name  = "用户备注")
    private String mark;

    @Schema(name  = "管理员备注")
    private String remark;

    @Schema(name  = "退款图片")
    private String refundReasonWapImg;

    @Schema(name  = "退款用户说明")
    private String refundReasonWapExplain;

    @Schema(name  = "退款时间")
    private Date refundReasonTime;

    @Schema(name  = "前台退款原因")
    private String refundReasonWap;

    @Schema(name  = "不退款的理由")
    private String refundReason;

    @Schema(name  = "退款金额")
    private BigDecimal refundPrice;

    @Schema(name  = "0 未退款 1 申请中 2 已退款")
    private Integer refundStatus;

    @Schema(name  = "订单商品总数")
    private Integer totalNum;

    @Schema(name  = "配送方式 1=快递 ，2=门店自提")
    private Integer shippingType;

    @Schema(name  = "核销码")
    private String verifyCode;

    @Schema(name  = "推广人信息")
    private StoreOrderSpreadInfoResponse spreadInfo = new StoreOrderSpreadInfoResponse();

    @Schema(name  = "订单类型")
    private String orderType;
}
