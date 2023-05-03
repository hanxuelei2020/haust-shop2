package com.zbkj.common.vo;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import org.hibernate.validator.constraints.NotBlank;
import java.io.Serializable;
import java.util.List;

/**
 * SystemConfigFormVo对象
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
@Schema(name ="SystemConfigFormVo对象", description="form对象")
public class SystemConfigFormVo implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "表单名称")
    private String formRef;

    @Schema(name  = "form对象")
    private String formModel;

    @Schema(name  = "大小")
    private String size;

    @Schema(name  = "label位置")
    private String labelPosition;

    @Schema(name  = "label宽度")
    private String labelWidth;

    @Schema(name  = "form规则")
    private String formRules;

    @Schema(name  = "")
    private String gutter;

    @Schema(name  = "是否禁用")
    private String disabled;

    @Schema(name  = "span")
    private String span;

    @Schema(name  = "button")
    private String formBtns;

    @Schema(name  = "字段值列表")
    private List<String> fields;



}
