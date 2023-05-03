package com.zbkj.common.model.bargain;

import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 砍价表
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
@TableName("eb_store_bargain")
@Schema(name ="StoreBargain对象", description="砍价表")
public class StoreBargain implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "砍价商品ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @Schema(name  = "关联商品ID")
    private Integer productId;

    @Schema(name  = "砍价活动名称")
    private String title;

    @Schema(name  = "砍价活动图片")
    private String image;

    @Schema(name  = "单位名称")
    private String unitName;

    @Schema(name  = "库存")
    private Integer stock;

    @Schema(name  = "销量")
    private Integer sales;

    @Schema(name  = "砍价商品轮播图")
    private String images;

    @Schema(name  = "砍价开启时间")
    private Long startTime;

    @Schema(name  = "砍价结束时间")
    private Long stopTime;

    @Schema(name  = "砍价商品名称")
    private String storeName;

    @Schema(name  = "砍价金额")
    private BigDecimal price;

    @Schema(name  = "砍价商品最低价")
    private BigDecimal minPrice;

    @Schema(name  = "购买数量限制")
    // 单个活动每个用户发起砍价次数限制
    private Integer num;

    @Schema(name  = "用户每次砍价的最大金额")
    private BigDecimal bargainMaxPrice;

    @Schema(name  = "用户每次砍价的最小金额")
    private BigDecimal bargainMinPrice;

    @Schema(name  = "帮砍次数")
    // 单个商品用户可以帮砍的次数，例：次数设置为1，甲和乙同时将商品A的砍价链接发给丙，丙只能帮甲或乙其中一个人砍价
    private Integer bargainNum;

    @Schema(name  = "砍价状态 0(到砍价时间不自动开启)  1(到砍价时间自动开启时间)")
    private Boolean status;

    @Schema(name  = "反多少积分")
    private Integer giveIntegral;

    @Schema(name  = "砍价活动简介")
    private String info;

    @Schema(name  = "成本价")
    private BigDecimal cost;

    @Schema(name  = "排序")
    private Integer sort;

    @Schema(name  = "是否推荐0不推荐1推荐")
    private Boolean isHot;

    @Schema(name  = "是否删除 0未删除 1删除")
    private Boolean isDel;

    @Schema(name  = "添加时间")
    private Long addTime;

    @Schema(name  = "是否包邮 0不包邮 1包邮")
    private Boolean isPostage;

    @Schema(name  = "邮费")
    private BigDecimal postage;

    @Schema(name  = "砍价规则")
    private String rule;

    @Schema(name  = "砍价商品浏览量")
    private Integer look;

    @Schema(name  = "砍价商品分享量")
    private Integer share;

    @Schema(name  = "运费模板ID")
    private Integer tempId;

    @Schema(name  = "重量")
    private BigDecimal weight;

    @Schema(name  = "体积")
    private BigDecimal volume;

    @Schema(name  = "限购总数")
    private Integer quota;

    @Schema(name  = "限量总数显示")
    private Integer quotaShow;

    @Schema(name  = "帮助砍价好友人数")
    private Integer peopleNum;
}
