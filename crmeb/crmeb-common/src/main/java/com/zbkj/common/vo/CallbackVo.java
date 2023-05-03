package com.zbkj.common.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 微信回调对象
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
@Schema(name ="CallbackVo对象", description="微信回调")
public class CallbackVo {
    @Schema(name  = "调用接口提交的公众账号ID")
    @JsonProperty(value = "appid")
    private String appId;

    @Schema(name  = "调用接口提交的商户号")
    @JsonProperty(value = "mch_id")
    private String mchId;

    @Schema(name  = "调用接口提交的终端设备号")
    @JsonProperty(value = "device_info")
    private String deviceInfo;

    @Schema(name  = "微信返回的随机字符串")
    @JsonProperty(value = "nonce_str")
    private String nonceStr;

    @Schema(name  = "微信返回的签名")
    private String sign;

    @Schema(name  = "SUCCESS/FAIL此字段是通信标识，非交易标识，交易是否成功需要查看trade_state来判断")
    @JsonProperty(value = "return_code")
    private String returnCode;

    @Schema(name  = "当return_code为FAIL时返回信息为错误原因 ，例如 签名失败 参数格式校验错误")
    @JsonProperty(value = "return_msg")
    private String returnMsg;

    @Schema(name  = "SUCCESS/FAIL 业务结果")
    @JsonProperty(value = "result_code")
    private String resultCode;

    @Schema(name  = "详细参见错误列表")
    @JsonProperty(value = "err_code")
    private String errCode;

    @Schema(name  = "错误返回的信息描述")
    @JsonProperty(value = "err_code_des")
    private String errCodeDes;

    @Schema(name  = "用户在商户appid下的唯一标识")
    private String openid;

    @Schema(name  = "微信支付订单号")
    @JsonProperty(value = "transaction_id")
    private String transactionId;

    @Schema(name  = "微信支付订单号")
    @JsonProperty(value = "out_trade_no")
    private String outTradeNo;

    @Schema(name  = "商家数据包，原样返回")
    private String attach;

    @Schema(name  = "支付完成时间，格式为yyyyMMddHHmmss，如2009年12月25日9点10分10秒表示为20091225091010。其他详见时间规则")
    @JsonProperty(value = "time_end")
    private String timeEnd;

    @Schema(name  = "用户是否关注公众账号，Y-关注，N-未关注")
    @JsonProperty(value = "is_subscribe")
    private String isSubscribe;

    @Schema(name  = "银行类型")
    @JsonProperty(value = "bank_type")
    private String bankType;

    @Schema(name  = "现金支付金额")
    @JsonProperty(value = "cash_fee")
    private Integer cashFee;

    @Schema(name  = "总代金券金额")
    @JsonProperty(value = "coupon_fee")
    private Integer couponFee;

}
