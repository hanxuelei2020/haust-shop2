package com.zbkj.common.model.system;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * 系统菜单表
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
@TableName("eb_system_menu")
@Schema(name ="SystemMenu对象", description="系统菜单表")
public class SystemMenu implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @Schema(name  = "父级ID")
    private Integer pid;

    @Schema(name  = "名称")
    private String name;

    @Schema(name  = "icon")
    private String icon;

    @Schema(name  = "权限标识")
    private String perms;

    @Schema(name  = "组件路径")
    private String component;

    @Schema(name  = "类型，M-目录，C-菜单，A-按钮")
    private String menuType;

    @Schema(name  = "排序")
    private Integer sort;

    @Schema(name  = "显示状态")
    private Boolean isShow;

    @Schema(name  = "是否删除")
    @JsonIgnore
    private Boolean isDelte;

    @Schema(name  = "创建时间")
    private Date createTime;

    @Schema(name  = "更新时间")
    @JsonIgnore
    private Date updateTime;


}
