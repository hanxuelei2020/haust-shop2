package com.zbkj.common.request;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.Valid;
import org.hibernate.validator.constraints.NotBlank;
import java.io.Serializable;

/**
 * 配置表表单字段明细
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
@Schema(name ="SystemFormItemCheckRequest对象", description="表单字段明细")
public class SystemFormItemCheckRequest implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "字段名称", required = true)
    @NotBlank(message = "请设置 SystemFormItemCheckRequest 对象的 name 属性")
    private String name;

    @Schema(name  = "字段值", required = true)
    private String value;

    @Schema(name  = "字段显示文字", required = true)
    private String title;

}
