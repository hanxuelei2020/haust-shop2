package com.zbkj.common.request;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import org.hibernate.validator.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 系统配置请求对象
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
@Schema(name ="SystemConfigAdminRequest对象", description="系统配置请求对象")
public class SystemConfigAdminRequest implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "配置id")
    @NotNull(message = "配置id不能为空")
    private Integer id;

    @Schema(name  = "字段名称")
    @NotBlank(message = "字段名称不能为空")
    private String name;

    @Schema(name  = "字段提示文字")
    @NotBlank(message = "字段提示文字不能为空")
    private String title;

    @Schema(name  = "表单id")
    @NotNull(message = "表单id不能为空")
    private Integer formId;

    @Schema(name  = "值")
    @NotBlank(message = "值不能为空")
    private String value;

    @Schema(name  = "是否隐藏")
    @NotNull(message = "状态不能为空")
    private Boolean status;
}
