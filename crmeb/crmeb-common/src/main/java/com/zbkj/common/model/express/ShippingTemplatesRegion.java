package com.zbkj.common.model.express;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *  运费模版区域
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
@TableName("eb_shipping_templates_region")
@Schema(name ="ShippingTemplatesRegion对象", description="")
public class ShippingTemplatesRegion implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @Schema(name  = "模板ID")
    private Integer tempId;

    @Schema(name  = "城市ID")
    private Integer cityId;

    @Schema(name  = "描述")
    private String title;

    @Schema(name  = "首件")
    private BigDecimal first;

    @Schema(name  = "首件运费")
    private BigDecimal firstPrice;

    @Schema(name  = "续件")
    private BigDecimal renewal;

    @Schema(name  = "续件运费")
    private BigDecimal renewalPrice;

    @Schema(name  = "计费方式 1按件数 2按重量 3按体积")
    private Integer type;

    @Schema(name  = "分组唯一值")
    private String uniqid;

    @Schema(name  = "是否无效")
    private Boolean status;

    @Schema(name  = "创建时间")
    private Date createTime;

    @Schema(name  = "修改时间")
    private Date updateTime;


}
