package com.zbkj.common.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.DecimalMin;
import org.hibernate.validator.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 用户提现表
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
@Schema(name ="UserExtractRequest对象", description="用户提现")
public class UserExtractRequest implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "姓名")
    @NotBlank(message = "提现用户名称必须填写")
    @Length(max = 64, message = "提现用户名称不能超过64个字符")
    @JsonProperty(value = "name")
    private String realName;

    @Schema(name  = "提现方式| alipay=支付宝,bank=银行卡,weixin=微信", allowableValues = "range[alipay,weixin,bank]")
    @NotBlank(message = "请选择提现方式， 支付宝|微信|银行卡")
    private String extractType;

    @Schema(name  = "银行卡")
    @JsonProperty(value = "cardum")
    private String bankCode;

    @Schema(name  = "提现银行名称")
    private String bankName;

    @Schema(name  = "支付宝账号")
    private String alipayCode;

    @Schema(name  = "提现金额")
    @JsonProperty(value = "money")
    @NotNull(message = "请输入提现金额")
    @DecimalMin(value = "0.1", message = "提现金额不能小于0.1")
    private BigDecimal extractPrice;

    @Schema(name  = "微信号")
    private String wechat;

    @Schema(name  = "备注")
    private String mark;

    @Schema(name  = "微信收款码")
    private String qrcodeUrl;
}
