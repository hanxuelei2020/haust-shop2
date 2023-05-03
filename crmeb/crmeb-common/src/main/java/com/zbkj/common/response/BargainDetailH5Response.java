package com.zbkj.common.response;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 砍价商品详情响应对象
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
@Schema(name ="BargainDetailH5Response对象", description="砍价商品详情响应对象")
public class BargainDetailH5Response implements Serializable {

    private static final long serialVersionUID = 4177599369617161973L;

    @Schema(name  = "砍价商品ID")
    private Integer id;

    @Schema(name  = "关联商品ID")
    private Integer productId;

    @Schema(name  = "砍价活动名称")
    private String title;

    @Schema(name  = "砍价活动图片")
    private String image;

    @Schema(name  = "单位名称")
    private String unitName;

    @Schema(name  = "销量")
    private Integer sales;

    @Schema(name  = "砍价开启时间")
    private Long startTime;

    @Schema(name  = "砍价结束时间")
    private Long stopTime;

    @Schema(name  = "砍价金额")
    private BigDecimal price;

    @Schema(name  = "砍价商品最低价")
    private BigDecimal minPrice;

    @Schema(name  = "购买数量限制")
    // 单个活动每个用户发起砍价次数限制
    private Integer num;

    @Schema(name  = "砍价活动简介")
    private String info;

//    @Schema(name  = "砍价规则")
//    private String rule;

    @Schema(name  = "限购总数")
    private Integer quota;

    @Schema(name  = "限量总数显示")
    private Integer quotaShow;

    @Schema(name  = "商品规格sku")
    private String sku;

    @Schema(name  = "商品规格属性id")
    private Integer attrValueId;

    @Schema(name  = "商品详情")
    private String content;

    @Schema(name  = "主商品状态:normal-正常，sellOut-售罄，soldOut-下架,delete-删除")
    private String masterStatus;

}
