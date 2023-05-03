package com.zbkj.common.vo;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @program: crmeb
 * @author: 大粽子
 * @create: 2021-10-27 10:38
 **/
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Schema(name ="OrderExcelVo", description = "产品导出")
public class OrderExcelVo implements Serializable {

    @Schema(name  = "订单号")
    private String orderId;

    @Schema(name  = "实际支付金额")
    private String payPrice;

//    @Schema(name  = "支付方式")
//    private String payType;

    @Schema(name  = "创建时间")
    private String createTime;

//    @Schema(name  = "订单状态（0：待发货；1：待收货；2：已收货，待评价；3：已完成；）")
//    private String status;

    @Schema(name  = "商品信息")
    private String productName;

    @Schema(name  = "订单状态")
    private String statusStr;

    @Schema(name  = "支付方式")
    private String payTypeStr;

//    @Schema(name  = "是否删除")
//    private String isDel;
//
//    @Schema(name  = "退款图片")
//    private String refundReasonWapImg;
//
//    @Schema(name  = "退款用户说明")
//    private String refundReasonWapExplain;
//
//    @Schema(name  = "退款时间")
//    private String refundReasonTime;
//
//    @Schema(name  = "前台退款原因")
//    private String refundReasonWap;
//
//    @Schema(name  = "不退款的理由")
//    private String refundReason;
//
//    @Schema(name  = "退款金额")
//    private String refundPrice;
//
//    @Schema(name  = "0 未退款 1 申请中 2 已退款")
//    private String refundStatus;
//
//    @Schema(name  = "核销码")
//    private String verifyCode;

    @Schema(name  = "订单类型")
    private String orderType;

//    @Schema(name  = "订单管理员备注")
//    private String remark;

    @Schema(name  = "用户姓名")
    private String realName;

//    @Schema(name  = "支付状态")
//    private String paid;
//
//    @Schema(name  = "订单类型:0-普通订单，1-视频号订单")
//    private String type;
//
//    @Schema(name  = "是否改价,0-否，1-是")
//    private String isAlterPrice;
}
