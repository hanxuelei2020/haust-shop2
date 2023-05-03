package com.zbkj.common.response;



import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * PC登录返回对象
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
@Schema(name ="SystemLoginResponse对象", description="PC登录返回对象")
public class SystemLoginResponse implements Serializable {

    @Schema(name  = "id")
    private Integer id;

    @Schema(name  = "管理员账号")
    private String account;

    @Schema(name  = "管理员昵称")
    private String realName;

    @Schema(name  = "token")
    private String Token;

    @Schema(name  = "是否接收短信")
    private Boolean isSms;
}
