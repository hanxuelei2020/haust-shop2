package com.zbkj.common.request;

import com.zbkj.common.constants.RegularConstants;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import org.hibernate.validator.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

/**
 * 微信绑定手机号请求对象
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
@Schema(name ="WxBindingPhoneRequest", description="微信绑定手机号请求对象")
public class WxBindingPhoneRequest implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "手机号", required = true)
    @Pattern(regexp = RegularConstants.PHONE_TWO, message = "请输入正确的手机号")
    private String phone;

    @Schema(name  = "验证码", required = true)
    @Pattern(regexp = RegularConstants.VALIDATE_CODE_NUM_SIX, message = "请输入6位验证码")
    private String captcha;

    @Schema(name  = "类型:public-公众号，routine-小程序,iosWx-苹果微信，androidWx-安卓微信, ios-ios登录")
    @NotBlank(message = "类型不能为空")
    private String type;

    @Schema(name  = "新用户登录时返回的key")
    @NotBlank(message = "key不能为空")
    private String key;

    @Schema(name  = "小程序获取手机号加密数据")
    private String encryptedData;

    @Schema(name  = "加密算法的初始向量")
    private String iv;

    @Schema(name  = "小程序code")
    private String code;
}
