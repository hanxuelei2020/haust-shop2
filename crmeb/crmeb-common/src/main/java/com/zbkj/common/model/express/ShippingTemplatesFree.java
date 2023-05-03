package com.zbkj.common.model.express;

import java.math.BigDecimal;
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
 * 免费运费模版
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
@TableName("eb_shipping_templates_free")
@Schema(name ="ShippingTemplatesFree对象", description="")
public class ShippingTemplatesFree implements Serializable {

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

    @Schema(name  = "包邮件数")
    private BigDecimal number;

    @Schema(name  = "包邮金额")
    private BigDecimal price;

    @Schema(name  = "计费方式")
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
