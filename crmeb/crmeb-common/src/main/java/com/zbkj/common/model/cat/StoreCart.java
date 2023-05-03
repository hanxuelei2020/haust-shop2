package com.zbkj.common.model.cat;

import com.baomidou.mybatisplus.annotation.TableField;
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
 * 购物车表
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
@TableName("eb_store_cart")
@Schema(name ="StoreCart对象", description="购物车表")
public class StoreCart implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "购物车表ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(name  = "用户ID")
    private Integer uid;

    @Schema(name  = "类型")
    private String type;

    @Schema(name  = "商品ID")
    private Integer productId;

    @Schema(name  = "商品属性")
    private String productAttrUnique;

    @Schema(name  = "商品数量")
    private Integer cartNum;

    @Schema(name  = "是否为立即购买")
    private Boolean isNew;

    @Schema(name  = "拼团id")
    private Integer combinationId;

    @Schema(name  = "秒杀商品ID")
    private Integer seckillId;

    @Schema(name  = "砍价id")
    private Integer bargainId;

    @Schema(name  = "添加时间")
    private Date createTime;

    @Schema(name  = "更新时间")
    private Date updateTime;

    @Schema(name  = "已添加的商品是否有效状态")
    private Boolean status;

    @Schema(name  = "团长拼团id")
    @TableField(exist = false)
    private Integer pinkId;
}
