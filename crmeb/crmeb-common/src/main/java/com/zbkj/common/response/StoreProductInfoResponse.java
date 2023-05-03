package com.zbkj.common.response;

import com.zbkj.common.model.product.StoreProductAttr;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 商品详情响应对象
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
@Schema(name ="StoreProductInfoResponse对象", description="商品详情响应对象")
public class StoreProductInfoResponse implements Serializable {

    private static final long serialVersionUID = 9215241889318610262L;

    @Schema(name  = "商品id")
    private Integer id;

    @Schema(name  = "商品图片")
    private String image;

    @Schema(name  = "轮播图")
    private String sliderImage;

    @Schema(name  = "商品名称")
    private String storeName;

    @Schema(name  = "商品简介")
    private String storeInfo;

    @Schema(name  = "关键字")
    private String keyword;

    @Schema(name  = "分类id")
    private String cateId;

    @Schema(name  = "分类中文")
    private String cateStr;

    @Schema(name  = "单位名")
    private String unitName;

    @Schema(name  = "排序")
    private Integer sort;

    @Schema(name  = "是否热卖")
    private Boolean isHot;

    @Schema(name  = "是否优惠")
    private Boolean isBenefit;

    @Schema(name  = "是否精品")
    private Boolean isBest;

    @Schema(name  = "是否新品")
    private Boolean isNew;

    @Schema(name  = "获得积分")
    private Integer giveIntegral;

    @Schema(name  = "是否优品推荐")
    private Boolean isGood;

    @Schema(name  = "是否单独分佣")
    private Boolean isSub;

    @Schema(name  = "虚拟销量")
    private Integer ficti;

    @Schema(name  = "运费模板ID")
    private Integer tempId;

    @Schema(name  = "规格 0单 1多")
    private Boolean specType;

    @Schema(name  = "活动显示排序 0=默认，1=秒杀，2=砍价，3=拼团")
    private List<String> activity;

    @Schema(name  = "商品属性")
    private List<StoreProductAttr> attr;

    @Schema(name  = "商品属性详情")
    private List<AttrValueResponse> attrValue;

    @Schema(name  = "商品描述")
    private String content;

    @Schema(name  = "产品ID")
    private Integer productId;

//    @Schema(name  = "优惠券")
//    private List<StoreCoupon> coupons;

    @Schema(name  = "优惠券Ids")
    private List<Integer> couponIds;

    // 以下为活动商品部分

    @Schema(name  = "状态 0=关闭 1=开启|营销商品用")
    private Integer status;

    @Schema(name  = "运费模板ID|秒杀商品专用")
    private Integer timeId;

    @Schema(name  = "秒杀开启时间|秒杀专用")
    private String startTimeStr;

    @Schema(name  = "秒杀结束时间|秒杀专用")
    private String stopTimeStr;

    @Schema(name  = "当天参与秒杀次数|秒杀专用")
    private Integer num;

    @Schema(name  = "砍价开启时间|砍价专用")
    private Long startTime;

    @Schema(name  = "砍价结束时间|砍价专用")
    private Long stopTime;

    @Schema(name  = "砍价活动名称|砍价专用")
    private String title;

    @Schema(name  = "帮砍次数|砍价专用")
    private Integer bargainNum;

    @Schema(name  = "帮助砍价好友人数|砍价专用")
    private Integer peopleNum;

    @Schema(name  = "拼团订单有效时间(小时)|拼团专用")
    private Integer effectiveTime;

    @Schema(name  = "每个订单可购买数量|拼团专用")
    private Integer onceNum;

    @Schema(name  = "虚拟成团百分比|拼团专用")
    private Integer virtualRation;

    @Schema(name  = "参团人数|拼团专用")
    private Integer people;

    @Schema(name  = "商品状态|拼团专用")
    private Boolean isShow;

    @Schema(name  = "简介|拼团专用")
    private String info;

    @Schema(name  = "展示图")
    private String flatPattern;
}
