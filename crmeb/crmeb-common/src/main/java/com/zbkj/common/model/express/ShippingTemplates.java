package com.zbkj.common.model.express;

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
 *  运费模版对象
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
@TableName("eb_shipping_templates")
@Schema(name ="ShippingTemplates对象", description="")
public class ShippingTemplates implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @Schema(name  = "模板名称")
    private String name;

    @Schema(name  = "计费方式")
    private Integer type;

    @Schema(name  = "指定包邮")
    private Boolean appoint;

    @Schema(name  = "排序")
    private Integer sort;

    @Schema(name  = "创建时间")
    private Date createTime;

    @Schema(name  = "修改时间")
    private Date updateTime;


}
