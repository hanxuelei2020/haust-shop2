package com.zbkj.common.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 小程序关键词
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
@Schema(name ="ProgramTempKeywordsVo对象", description="小程序关键词")
public class ProgramTempKeywordsVo {
    @Schema(name  = "关键词 id，选用模板时需要")
    private Integer kid;

    @Schema(name  = "关键词内容")
    private String name;

    @Schema(name  = "关键词内容对应的示例")
    private String example;

    @Schema(name  = "参数类型")
    private String rule;

    @Schema(name  = "代码里组装数据的时候，需要用到这个key")
    @JsonIgnore
    private String key;

    @Schema(name  = "代码里组装数据的时候，需要用到这个key")
    @JsonIgnore
    private String sendKey;
}
