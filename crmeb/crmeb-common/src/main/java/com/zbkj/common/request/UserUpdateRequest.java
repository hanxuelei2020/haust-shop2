package com.zbkj.common.request;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 用户更新请求对象
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
@Schema(name ="UserUpdateRequest", description="用户更新请求对象")
public class UserUpdateRequest implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "uid")
    private Integer uid;

    @Schema(name  = "真实姓名")
    private String realName;

    @Schema(name  = "生日")
    private String birthday;

    @Schema(name  = "身份证号码")
    private String cardId;

    @Schema(name  = "用户备注")
    private String mark;

    @Schema(name  = "状态是否正常， 0 = 禁止， 1 = 正常")
    @NotNull(message = "状态不能为空")
    private Boolean status;

    @Schema(name  = "详细地址")
    private String addres;

//    @Schema(name  = "等级")
//    private Integer level;

    @Schema(name  = "用户分组id")
    private String groupId;

    @Schema(name  = "用户标签id")
    private String tagId;

    @Schema(name  = "是否为推广员")
    @NotNull(message = "是否为推广员不能为空")
    private Boolean isPromoter;

}
