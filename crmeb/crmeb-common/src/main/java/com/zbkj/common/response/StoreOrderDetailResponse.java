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
 * 订单信息响应对象（pc列表用）
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
@Schema(name ="StoreOrderDetailResponse对象", description="订单信息响应对象（pc列表用）")
public class StoreOrderDetailResponse implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "订单号")
    private String orderId;

    @Schema(name  = "实际支付金额")
    private BigDecimal payPrice;

    @Schema(name  = "支付方式")
    private String payType;

    @Schema(name  = "创建时间")
    private Date createTime;

    @Schema(name  = "订单状态（0：待发货；1：待收货；2：已收货，待评价；3：已完成；）")
    private Integer status;

    @Schema(name  = "商品信息")
    private List<StoreOrderInfoOldVo> productList = new ArrayList<>();

    @Schema(name  = "订单状态")
    private Map<String, String> statusStr;

    @Schema(name  = "支付方式")
    private String payTypeStr;

    @Schema(name  = "是否删除")
    private Boolean isDel;

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

    @Schema(name  = "核销码")
    private String verifyCode;

    @Schema(name  = "订单类型")
    private String orderType;

    @Schema(name  = "订单管理员备注")
    private String remark;

    @Schema(name  = "用户姓名")
    private String realName;

//    @Schema(name  = "备注")
//    private String mark;

//    @Schema(name  = "订单总价")
//    private BigDecimal totalPrice;

    @Schema(name  = "支付状态")
    private Boolean paid;

    @Schema(name  = "订单类型:0-普通订单，1-视频号订单")
    private Integer type;

    @Schema(name  = "是否改价,0-否，1-是")
    private Boolean isAlterPrice;
}
