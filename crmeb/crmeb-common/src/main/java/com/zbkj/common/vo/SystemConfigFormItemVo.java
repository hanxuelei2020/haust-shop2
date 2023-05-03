package com.zbkj.common.vo;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

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
public class SystemConfigFormItemVo implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "配置")
    private SystemConfigFormItemConfigVo __config__;

    @Schema(name  = "")
    private String placeholder;

    @Schema(name  = "")
    private String step;

    @Schema(name  = "")
    private String stepStrictly;

    @Schema(name  = "")
    private String controlsPosition;

    @Schema(name  = "")
    private String disabled;

    @Schema(name  = "")
    private String __vModel__;



}
