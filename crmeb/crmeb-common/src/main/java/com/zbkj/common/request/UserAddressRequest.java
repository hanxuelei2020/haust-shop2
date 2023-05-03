package com.zbkj.common.request;

import com.zbkj.common.constants.RegularConstants;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.Length;

import javax.validation.Valid;
import org.hibernate.validator.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

/**
 * 新增用户地址对象
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
@Schema(name ="UserAddressRequest对象", description="新增用户地址对象")
public class UserAddressRequest implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "用户地址id")
    private Integer id;

    @Schema(name  = "收货人姓名", required = true)
    @NotBlank(message = "收货人姓名不能为空")
    @Length(max = 32, message = "收货人姓名不能超过32个字符")
    private String realName;

    @Schema(name  = "收货人电话", required = true)
    @NotBlank(message = "收货人电话不能为空")
    @Pattern(regexp = RegularConstants.PHONE_TWO, message = "请填写正确的收货人电话")
    private String phone;

    @Schema(name  = "收货人详细地址", required = true)
    @NotBlank(message = "收货人详细地址不能为空")
    @Length(max = 256, message = "收货人详细地址不能超过32个字符")
    private String detail;

    @Schema(name  = "是否默认", example = "false", required = true)
    private Boolean isDefault;

    @Valid
    @Schema(name  = "城市信息", required = true)
    private UserAddressCityRequest address;
}
