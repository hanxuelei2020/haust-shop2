package com.zbkj.common.response;

import com.zbkj.common.vo.MenuCheckVo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 角色详情响应对象
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
@Schema(name ="RoleInfoResponse对象", description="角色详情响应对象")
public class RoleInfoResponse implements Serializable {

    private static final long serialVersionUID = -6123516979502057197L;

    @Schema(name  = "角色id")
    private Integer id;

    @Schema(name  = "角色名称")
    private String roleName;

    @Schema(name  = "状态：0-关闭，1-正常")
    private Boolean status;

    @Schema(name  = "创建时间")
    private Date createTime;

    @Schema(name  = "修改时间")
    private Date updateTime;

    @Schema(name  = "修改时间")
    private List<MenuCheckVo> menuList;

}
