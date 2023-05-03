package com.zbkj.common.model.product;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 商品属性表
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
@TableName("eb_store_product_attr")
@Schema(name ="StoreProductAttr对象", description="商品属性表")
public class StoreProductAttr implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "attrId")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @Schema(name  = "商品ID")
    private Integer productId;

    @Schema(name  = "属性名")
    private String attrName;

    @Schema(name  = "属性值")
    private String attrValues;

    @Schema(name  = "活动类型 0=商品，1=秒杀，2=砍价，3=拼团")
    private Integer type;

    @Schema(name  = "是否删除,0-否，1-是")
    private Boolean isDel;
}
