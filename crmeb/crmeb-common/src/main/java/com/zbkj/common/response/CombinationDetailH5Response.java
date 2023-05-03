package com.zbkj.common.response;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *  拼团商品移动端对象
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
@Schema(name ="CombinationDetailH5Response对象", description="拼团商品移动端对象")
public class CombinationDetailH5Response implements Serializable {

    private static final long serialVersionUID = -885733985825623484L;

    @Schema(name  = "拼团商品ID")
    private Integer id;

    @Schema(name  = "商品id")
    private Integer productId;

    @Schema(name  = "推荐图")
    private String image;

    @Schema(name  = "轮播图")
    private String sliderImage;

    @Schema(name  = "活动标题")
    private String storeName;

    @Schema(name  = "参团人数")
    private Integer people;

    @Schema(name  = "简介")
    private String storeInfo;

    @Schema(name  = "价格")
    private BigDecimal price;

    @Schema(name  = "销量")
    private Integer sales;

    @Schema(name  = "单位名")
    private String unitName;

    @Schema(name  = "限购总数")
    private Integer quota;

    @Schema(name  = "限量总数显示")
    private Integer quotaShow;

    @Schema(name  = "原价")
    private BigDecimal otPrice;

    @Schema(name  = "每个订单可购买数量")
    private Integer onceNum;

    @Schema(name  = "虚拟销量")
    private Integer ficti;

    @Schema(name  = "商品详情")
    private String content;
}
