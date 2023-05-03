
package com.zbkj.common.vo;

 
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 调用微信退款所需要的参数
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
@Schema(name ="WxRefundVo", description="调用微信退款所需要的参数")
public class WxRefundVo {

    @Schema(name  = "appId，公众号名称，由商户传入", required = true)
    private String appid;

    @Schema(name  = "直连商户的商户号，由微信支付生成并下发", required = true)
    private String mch_id;

    @Schema(name  = "随机字符串，不长于32位", required = true)
    private String nonce_str;

    @Schema(name  = "签名", required = true)
    private String sign;

    @Schema(name  = "签名类型，目前支持HMAC-SHA256和MD5，默认为MD5")
    private String sign_type = "MD5";

    @Schema(name  = "微信支付订单号:微信生成的订单号，在支付通知中有返回")
    private String transaction_id;

    @Schema(name  = "商户系统内部的订单号,32个字符内、可包含字母, 其他说明见商户订单号", required = true)
    private String out_trade_no;

    @Schema(name  = "商户退款单号,同一退款单号多次请求只退一笔。")
    private String out_refund_no;

    @Schema(name  = "订单总金额，单位为分", required = true)
    private int total_fee;

    @Schema(name  = "退款金额，单位为分", required = true)
    private int refund_fee;

    @Schema(name  = "退款货币种类:符合ISO 4217标准的三位字母代码，默认人民币：CNY，其他值列表详见货币类型")
    private String refund_fee_type = "CNY";

    @Schema(name  = "退款结果通知url")
    private String notify_url;

}

