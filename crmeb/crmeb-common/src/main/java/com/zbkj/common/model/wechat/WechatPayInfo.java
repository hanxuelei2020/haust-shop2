package com.zbkj.common.model.wechat;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 微信订单表
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
@TableName("eb_wechat_pay_info")
@Schema(name ="WechatPayInfo对象", description="微信订单表")
public class WechatPayInfo implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @Schema(name  = "公众号唯一标识")
    private String appId;

    @Schema(name  = "商户号")
    private String mchId;

    @Schema(name  = "设备号,PC网页或公众号内支付可以传-WEB")
    private String deviceInfo;

    @Schema(name  = "用户的唯一标识")
    private String openId;

    @Schema(name  = "随机字符串")
    private String nonceStr;

    @Schema(name  = "签名")
    private String sign;

    @Schema(name  = "签名类型，默认为MD5，支持HMAC-SHA256和MD5")
    private String signType;

    @Schema(name  = "商品描述")
    private String body;

    @Schema(name  = "商品详细描述，对于使用单品优惠的商户，该字段必须按照规范上传")
    private String detail;

    @Schema(name  = "附加数据，在查询API和支付通知中原样返回，可作为自定义参数使用")
    private String attach;

    @Schema(name  = "商户订单号,要求32个字符内")
    private String outTradeNo;

    @Schema(name  = "标价币种：CNY：人民币 GBP：英镑 HKD：港币 USD：美元 JPY：日元 CAD：加拿大元 AUD：澳大利亚元 EUR：欧元 NZD：新西兰元 KRW：韩元 THB：泰铢")
    private String feeType;

    @Schema(name  = "标价金额")
    private Integer totalFee;

    @Schema(name  = "终端IP")
    private String spbillCreateIp;

    @Schema(name  = "交易起始时间")
    private String timeStart;

    @Schema(name  = "交易结束时间")
    private String timeExpire;

    @Schema(name  = "通知地址")
    private String notifyUrl;

    @Schema(name  = "交易类型,取值为：JSAPI，NATIVE，APP等")
    private String tradeType;

    @Schema(name  = "商品ID")
    private String productId;

    @Schema(name  = "场景信息")
    private String sceneInfo;

    @Schema(name  = "错误代码")
    private String errCode;

    @Schema(name  = "预支付交易会话标识")
    private String prepayId;

    @Schema(name  = "二维码链接")
    private String codeUrl;

    @Schema(name  = "是否关注公众账号")
    private String isSubscribe;

    @Schema(name  = "交易状态")
    private String tradeState;

    @Schema(name  = "付款银行")
    private String bankType;

    @Schema(name  = "现金支付金额")
    private Integer cashFee;

    @Schema(name  = "代金券金额")
    private Integer couponFee;

    @Schema(name  = "微信支付订单号")
    private String transactionId;

    @Schema(name  = "支付完成时间")
    private String timeEnd;

    @Schema(name  = "交易状态描述")
    private String tradeStateDesc;


}
