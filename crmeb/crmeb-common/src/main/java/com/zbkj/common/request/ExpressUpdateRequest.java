package com.zbkj.common.request;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import org.hibernate.validator.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 快递公司编辑请求体
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
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("eb_express")
@Schema(name ="ExpressRequest对象", description="快递公司编辑请求体")
public class ExpressUpdateRequest implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "快递公司id")
    @NotNull(message = "快递公司id不能为空")
    private Integer id;

    @Schema(name  = "账号")
    private String account;

    @Schema(name  = "密码")
    private String password;

    @Schema(name  = "网点名称")
    private String netName;

    @Schema(name  = "排序")
    @NotNull(message = "排序不能为空")
    private Integer sort;

//    @Schema(name  = "是否显示")
//    @NotNull(message = "是否显示不能为空")
//    private Boolean isShow;

    @Schema(name  = "是否可用")
    @NotNull(message = "是否可用不能为空")
    private Boolean status;
}
