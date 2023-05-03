package com.zbkj.common.response;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.zbkj.common.model.product.StoreProductAttr;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * 秒杀商品 response
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
public class StoreSeckillResponse {

    @Schema(name  = "商品秒杀产品表id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @Schema(name  = "商品id")
    private Integer productId;

    @Schema(name  = "推荐图")
    private String image;

    @Schema(name  = "轮播图")
    private List<String> images;

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
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date startTime;

    @Schema(name  = "结束时间")
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date stopTime;

    @Schema(name  = "添加时间")
    private Date createTime;

    @Schema(name  = "秒杀状态 原本 0=关闭 1=开启")
    private Integer status;

    @Schema(name  = "秒杀状态String 未开始/进行中/活动已结束")
    private String statusName;

    @Schema(name  = "秒杀状态，前端用")
    private Integer killStatus;

    @Schema(name  = "是否包邮")
    private Boolean isPostage;

    @Schema(name  = "删除 0未删除1已删除")
    private Boolean isDel;

    @Schema(name  = "最多秒杀几个")
    private Integer num;

    @Schema(name  = "剩余限量")
    private int limitLeftNum;

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

    @Schema(name  = "限购总数")
    private Integer quota;

    @Schema(name  = "限购总数显示")
    private Integer quotaShow;

    @Schema(name  = "商品属性")
    private List<StoreProductAttr> attr;

    @Schema(name  = "商品属性详情")
    private List<StoreProductAttrValueResponse> attrValue;

    @Schema(name  = "管理端用于映射attrResults")
    private List<HashMap<String,Object>> attrValues;

    private Integer[] cateIds;

    @Schema(name  = "商品描述")
    private String content;

    @Schema(name  = "秒杀配置")
    private StoreSeckillManagerResponse storeSeckillManagerResponse;

    @Schema(name  = "规格 0单 1多")
    private boolean specType;

    @Schema(name  = "时间戳")
    private String timeSwap;

    @Schema(name  = "已抢百分比")
    private Integer percent;

    @Schema(name  = "当前正在秒杀的timeId")
    private Integer currentTimeId;

    @Schema(name  = "当前参与的秒杀的时间段")
    private String currentTime;
}
