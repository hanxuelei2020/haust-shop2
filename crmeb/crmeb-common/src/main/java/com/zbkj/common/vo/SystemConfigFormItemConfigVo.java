package com.zbkj.common.vo;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * item对象
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
@Schema(name ="SystemConfigFormItemVo对象", description="item对象")
public class SystemConfigFormItemConfigVo implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "")
    private String label;

    @Schema(name  = "")
    private String showLabel;

    @Schema(name  = "")
    private String changeTag;

    @Schema(name  = "")
    private String labelWidth;

    @Schema(name  = "")
    private String tag;

    @Schema(name  = "")
    private String tagIcon;

    @Schema(name  = "")
    private String span;

    @Schema(name  = "")
    private String layout;

    @Schema(name  = "")
    private Boolean required;

    @Schema(name  = "验证规则")
    private List<SystemConfigFormItemConfigRegListVo> regList;

    @Schema(name  = "")
    private String document;

    @Schema(name  = "")
    private String formId;

    @Schema(name  = "")
    private String renderKey;

    @Schema(name  = "")
    private String defaultValue;


}
