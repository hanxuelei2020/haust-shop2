package com.zbkj.common.model.seckill;

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
 * 商品秒杀产品表
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
@TableName("eb_store_seckill")
@Schema(name ="StoreSeckill对象", description="商品秒杀产品表")
public class StoreSeckill implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "商品秒杀产品表id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @Schema(name  = "商品id")
    private Integer productId;

    @Schema(name  = "推荐图")
    private String image;

    @Schema(name  = "轮播图")
    private String images;

    @Schema(name  = "活动标题")
    private String title;

    @Schema(name  = "简介")
    private String info;

    @Schema(name  = "价格")
    private BigDecimal price;

    @Schema(name  = "成本")
    private BigDecimal cost;

    @Schema(name  = "原价")
    private BigDecimal otPrice;

    @Schema(name  = "返多少积分")
    private Integer giveIntegral;

    @Schema(name  = "排序")
    private Integer sort;

    @Schema(name  = "库存")
    private Integer stock;

    @Schema(name  = "销量")
    private Integer sales;

    @Schema(name  = "单位名")
    private String unitName;

    @Schema(name  = "邮费")
    private BigDecimal postage;

    @Schema(name  = "内容")
    private String description;

    @Schema(name  = "开始时间")
    private Date startTime;

    @Schema(name  = "结束时间")
    private Date stopTime;

    @Schema(name  = "添加时间")
    private Date createTime;

    @Schema(name  = "秒杀状态 0=关闭 1=开启")
    private Integer status;

    @Schema(name  = "是否包邮")
    private Boolean isPostage;

    @Schema(name  = "删除 0未删除1已删除")
    private Boolean isDel;

    @Schema(name  = "最多秒杀几个")
    private Integer num;

    @Schema(name  = "显示")
    private Boolean isShow;

    @Schema(name  = "时间段ID")
    private Integer timeId;

    @Schema(name  = "运费模板ID")
    private Integer tempId;

    @Schema(name  = "重量")
    private BigDecimal weight;

    @Schema(name  = "体积")
    private BigDecimal volume;

    @Schema(name  = "限购总数 随销量递减")
    private Integer quota;

    @Schema(name  = "限购总数显示 不变")
    private Integer quotaShow;

    @Schema(name  = "规格 0单 1多")
    private Boolean specType;


}
