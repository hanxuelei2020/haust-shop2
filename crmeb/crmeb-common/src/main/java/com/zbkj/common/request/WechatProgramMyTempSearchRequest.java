package com.zbkj.common.request;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 小程序我的模板
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
@Schema(name ="WechatProgramMyTempSearchRequest对象", description="小程序我的模板")
public class WechatProgramMyTempSearchRequest implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "模版标题")
    private String title;

    @Schema(name  = "我的模板id")
    private String tempId;

    @Schema(name  = "状态 0，禁用，1启用")
    private Boolean status;

    @Schema(name  = "应用场景")
    private String type;

    private Integer id;
}
