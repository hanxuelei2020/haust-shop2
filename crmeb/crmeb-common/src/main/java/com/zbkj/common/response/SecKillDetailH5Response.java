package com.zbkj.common.response;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *  秒杀商品移动端对象
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
@Schema(name ="StoreSecKillH5Response对象", description="秒杀商品移动端对象")
public class SecKillDetailH5Response implements Serializable {

    private static final long serialVersionUID = -885733985825623484L;

    @Schema(name  = "商品秒杀产品表id")
    private Integer id;

    @Schema(name  = "商品id")
    private Integer productId;

    @Schema(name  = "推荐图")
    private String image;

    @Schema(name  = "轮播图")
    private String sliderImage;

    @Schema(name  = "秒杀商品名称")
    private String storeName;

    @Schema(name  = "简介")
    private String storeInfo;

    @Schema(name  = "价格")
    private BigDecimal price;

    @Schema(name  = "原价")
    private BigDecimal otPrice;

    @Schema(name  = "销量")
    private Integer sales;

    @Schema(name  = "单位名")
    private String unitName;

    @Schema(name  = "内容")
    private String description;

    @Schema(name  = "开始时间")
    private Date startTime;

    @Schema(name  = "结束时间")
    private Date stopTime;

    @Schema(name  = "最多秒杀几个")
    private Integer num;

    @Schema(name  = "时间段ID")
    private Integer timeId;

    @Schema(name  = "限购总数 随销量递减")
    private Integer quota;

    @Schema(name  = "限购总数显示 不变")
    private Integer quotaShow;

    @Schema(name  = "虚拟销量")
    private Integer ficti;

    @Schema(name  = "秒杀状态:0-关闭，1-即将开始，2-进行中，-1 - 已结束")
    private Integer seckillStatus;

    @Schema(name  = "商品详情")
    private String content;

    @Schema(name  = "结束时间（前端用）")
    private String timeSwap;
}
