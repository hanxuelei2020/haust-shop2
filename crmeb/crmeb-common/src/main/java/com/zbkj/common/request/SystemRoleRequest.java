package com.zbkj.common.request;

 
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 身份管理请求对象
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
@Schema(name ="SystemRoleRequest对象", description="身份管理请求对象")
public class SystemRoleRequest implements Serializable {

    private static final long serialVersionUID = -7616469901068422271L;

    @Schema(name  = "角色id(添加时不填，修改时必填)")
    private Integer id;

    @Schema(name  = "身份管理名称", required = true)
    @NotNull(message = "身份管理名称不能为空")
    @Length(max = 32, message = "身份管理名称不能超过32个字符")
    private String roleName;

    @Schema(name  = "权限字符串(英文逗号拼接)", required = true)
    @NotNull(message = "权限不能为空")
    private String rules;

    @Schema(name  = "状态：0-关闭，1-正常", required = true)
    @NotNull(message = "状态不能为空")
    private Boolean status;
}
