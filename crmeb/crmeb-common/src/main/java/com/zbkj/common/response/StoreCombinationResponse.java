package com.zbkj.common.response;

 
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

/**
 * 拼团商品响应体
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
public class StoreCombinationResponse implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "拼团商品ID")
    private Integer id;

    @Schema(name  = "商品id")
    private Integer productId;

    @Schema(name  = "商户id")
    private Integer merId;

    @Schema(name  = "推荐图")
    private String image;

    @Schema(name  = "轮播图")
    private String images;

    @Schema(name  = "活动标题")
    private String title;

    @Schema(name  = "活动属性")
    private String attr;

    @Schema(name  = "参团人数")
    private Integer people;

    @Schema(name  = "简介")
    private String info;

    @Schema(name  = "价格")
    private BigDecimal price;

    @Schema(name  = "排序")
    private Integer sort;

    @Schema(name  = "销量")
    private Integer sales;

    @Schema(name  = "库存")
    private Integer stock;

    @Schema(name  = "添加时间")
    private Long addTime;

    @Schema(name  = "推荐")
    private Boolean isHost;

    @Schema(name  = "商品状态")
    private Boolean isShow;

    private Boolean isDel;

    private Boolean combination;

    @Schema(name  = "商户是否可用1可用0不可用")
    private Boolean merUse;

    @Schema(name  = "是否包邮1是0否")
    private Boolean isPostage;

    @Schema(name  = "邮费")
    private BigDecimal postage;

    @Schema(name  = "拼团开始时间")
    private Long startTime;

    @Schema(name  = "拼团结束时间")
    private Long stopTime;

    @Schema(name  = "拼团结束时间")
    private String stopTimeStr;

    @Schema(name  = "拼团订单有效时间(小时)")
    private Integer effectiveTime;

    @Schema(name  = "拼图商品成本")
    private BigDecimal cost;

    @Schema(name  = "浏览量")
    private Integer browse;

    @Schema(name  = "单位名")
    private String unitName;

    @Schema(name  = "运费模板ID")
    private Integer tempId;

    @Schema(name  = "重量")
    private BigDecimal weight;

    @Schema(name  = "体积")
    private BigDecimal volume;

    @Schema(name  = "单次购买数量")
    private Integer num;

    @Schema(name  = "限购总数")
    private Integer quota;

    @Schema(name  = "限量总数显示")
    private Integer quotaShow;

    @Schema(name  = "原价")
    private BigDecimal otPrice;

    @Schema(name  = "每个订单可购买数量")
    private Integer onceNum;

    @Schema(name  = "虚拟成团百分比")
    private Integer virtualRation;

    @Schema(name  = "拼团人数")
    private Integer countPeople;

    @Schema(name  = "参与人数")
    private Integer countPeopleAll;

    @Schema(name  = "成团数量")
    private Integer countPeoplePink;

    @Schema(name  = "限量剩余")
    private Integer remainingQuota;

    @Schema(name  = "商品规格")
//    private List<StoreProductAttr> productAttr;
    private List<HashMap<String, Object>> productAttr;

    @Schema(name  = "商品规格值")
//    private List<StoreProductAttrValue> productValue;
    private HashMap<String,Object> productValue;

    @Schema(name  = "商品单双规格")
    private Boolean specType;

    @Schema(name  = "拼团单属性AttrValueId")
    private Integer aloneAttrValueId;
}
