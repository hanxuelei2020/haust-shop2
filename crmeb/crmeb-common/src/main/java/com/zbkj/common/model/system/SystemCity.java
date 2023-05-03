package com.zbkj.common.model.system;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.util.Date;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 城市表
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
@TableName("eb_system_city")
@Schema(name ="SystemCity对象", description="城市表")
public class SystemCity implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @Schema(name  = "城市id")
    private Integer cityId;

    @Schema(name  = "省市级别")
    private Integer level;

    @Schema(name  = "父级id")
    private Integer parentId;

    @Schema(name  = "区号")
    private String areaCode;

    @Schema(name  = "名称")
    private String name;

    @Schema(name  = "合并名称")
    private String mergerName;

    @Schema(name  = "经度")
    private String lng;

    @Schema(name  = "纬度")
    private String lat;

    @Schema(name  = "是否展示")
    private Boolean isShow;

    @Schema(name  = "创建时间")
    private Date createTime;

    @Schema(name  = "修改时间")
    private Date updateTime;

}
