package com.zbkj.common.vo;

 
import lombok.Data;

/**
 * 微信调起支付参数对象
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
@Schema(name ="WxPayJsResultVo对象", description="微信调起支付参数对象")
public class WxPayJsResultVo {

    @Schema(name  = "微信分配的小程序ID")
    private String appId;

    @Schema(name  = "随机字符串，不长于32位")
    private String nonceStr;

    @Schema(name  = "统一下单接口返回的 prepay_id 参数值")
    private String packages;

    @Schema(name  = "签名类型，默认为MD5，支持HMAC-SHA256和MD5。")
    private String signType;

    @Schema(name  = "时间戳从1970年1月1日00:00:00至今的秒数,即当前的时间")
    private String timeStamp;

    @Schema(name  = "支付签名")
    private String paySign;

    @Schema(name  = "H5支付跳转链接")
    private String mwebUrl;

    @Schema(name  = "微信商户号")
    private String partnerid;

    @Schema(name  = "拉起收银台的ticket")
    private String ticket;
}
