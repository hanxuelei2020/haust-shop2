package com.zbkj.common.request;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 设置用户等级表
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
@Schema(name ="SystemUserLevelUpdateShowRequest对象", description="等级更改显示状态请求")
public class SystemUserLevelUpdateShowRequest implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "等级id")
    @NotNull(message = "等级id不能为空")
    private Integer id;

    @Schema(name  = "是否显示 1=显示,0=隐藏")
    @NotNull(message = "是否显示不能为空")
    private Boolean isShow;

}
