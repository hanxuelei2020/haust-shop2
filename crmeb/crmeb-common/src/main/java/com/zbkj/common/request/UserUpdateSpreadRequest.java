package com.zbkj.common.request;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import org.hibernate.validator.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 更新推广人请求对象
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
@Schema(name ="UserUpdateSpreadRequest对象", description="更新推广人请求对象")
public class UserUpdateSpreadRequest implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "用户编号")
    @NotNull(message = "请选择用户")
    private Integer userId;

    @Schema(name  = "用户头像")
    @NotBlank(message = "请选择用户头像")
    private String image;

    @Schema(name  = "推广人编号")
    @NotNull(message = "请选择推广人")
    private Integer spreadUid;
}
