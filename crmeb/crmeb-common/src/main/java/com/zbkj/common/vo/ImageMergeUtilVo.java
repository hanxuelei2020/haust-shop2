package com.zbkj.common.vo;

 
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.Min;
import org.hibernate.validator.constraints.NotBlank;

/**
 * 图片合成详情
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
public class ImageMergeUtilVo {

    @Schema(name  = "图片地址", required = true)
    @NotBlank(message = "图片地址必须填写")
    private String path; //地址

    @Schema(name  = "x轴", required = true)
    @Min(value = 0, message = "x轴至少为0")
    private int x; //x轴

    @Schema(name  = "y轴", required = true)
    @Min(value = 0, message = "y轴至少为0")
    private int y; //y轴
}
