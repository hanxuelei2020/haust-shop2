package com.zbkj.common.vo;

 
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 菜单待选中Vo对象
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
@Schema(name ="MenuCheckVo对象", description="菜单待选中Vo对象")
public class MenuCheckVo implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "菜单ID")
    private Integer id;

    @Schema(name  = "父级ID")
    private Integer pid;

    @Schema(name  = "名称")
    private String name;

    @Schema(name  = "icon")
    private String icon;

    @Schema(name  = "是否选中")
    private Boolean checked;

    @Schema(name  = "排序")
    private Integer sort;

    @Schema(name  = "子对象列表")
    private List<MenuCheckVo> childList;
}
