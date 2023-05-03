package com.zbkj.common.model.product;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * 商品点赞和收藏表
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
@TableName("eb_store_product_relation")
@Schema(name ="StoreProductRelation对象", description="商品点赞和收藏表")
public class StoreProductRelation implements Serializable {

    private static final long serialVersionUID=1L;
    @Schema(name  = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @Schema(name  = "用户ID")
    private Integer uid;

    @Schema(name  = "商品ID")
    private Integer productId;

    @Schema(name  = "类型(收藏(collect）、点赞(like))")
    private String type = "collect";

    @Schema(name  = "某种类型的商品(普通商品、秒杀商品)")
    private String category;

    @Schema(name  = "创建时间")
    private Date updateTime;

    @Schema(name  = "创建时间")
    private Date createTime;


}
