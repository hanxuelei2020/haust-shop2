package com.zbkj.common.response;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zbkj.common.model.coupon.StoreCoupon;
import com.zbkj.common.model.product.StoreProductAttr;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * 商品表
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
@TableName("eb_store_product")
@Schema(name ="StoreProduct对象", description="商品表")
public class StoreProductResponse implements Serializable {

    @Schema(name  = "商品id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @Schema(name  = "商户Id(0为总后台管理员创建,不为0的时候是商户后台创建)")
    private Integer merId;

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

    @Schema(name  = "商品条码（一维码）")
    private String barCode;

    @Schema(name  = "分类id")
    private String cateId;

    @Schema(name  = "分类中文")
    private String cateValues;

    @Schema(name  = "商品价格")
    private BigDecimal price;

    @Schema(name  = "会员价格")
    private BigDecimal vipPrice;

    @Schema(name  = "市场价")
    private BigDecimal otPrice;

    @Schema(name  = "邮费")
    private BigDecimal postage;

    @Schema(name  = "单位名")
    private String unitName;

    @Schema(name  = "排序")
    private Integer sort;

    @Schema(name  = "销量")
    private Integer sales;

    @Schema(name  = "库存")
    private Integer stock;

    @Schema(name  = "状态（0：未上架，1：上架）")
    private Boolean isShow;

    @Schema(name  = "是否热卖")
    private Boolean isHot;

    @Schema(name  = "是否优惠")
    private Boolean isBenefit;

    @Schema(name  = "是否精品")
    private Boolean isBest;

    @Schema(name  = "是否新品")
    private Boolean isNew;

    @Schema(name  = "添加时间")
    private Integer addTime;

    @Schema(name  = "是否包邮")
    private Boolean isPostage;

    @Schema(name  = "是否删除")
    private Boolean isDel;

    @Schema(name  = "商户是否代理 0不可代理1可代理")
    private Boolean merUse;

    @Schema(name  = "获得积分")
    private Integer giveIntegral;

    @Schema(name  = "成本价")
    private BigDecimal cost;

    @Schema(name  = "秒杀状态 0 未开启 1已开启")
    private Boolean isSeckill;

    @Schema(name  = "砍价状态 0未开启 1开启")
    private Boolean isBargain;

    @Schema(name  = "是否优品推荐")
    private Boolean isGood;

    @Schema(name  = "是否单独分佣")
    private Boolean isSub;

    @Schema(name  = "虚拟销量")
    private Integer ficti;

    @Schema(name  = "浏览量")
    private Integer browse;

    @Schema(name  = "商品二维码地址(用户小程序海报)")
    private String codePath;

    @Schema(name  = "淘宝京东1688类型")
    private String soureLink;

    @Schema(name  = "主图视频链接")
    private String videoLink;

    @Schema(name  = "运费模板ID")
    private Integer tempId;

    @Schema(name  = "规格 0单 1多")
    private Boolean specType;

    @Schema(name  = "活动显示排序 0=默认，1=秒杀，2=砍价，3=拼团")
    private String activity;

    @Schema(name  = "活动显示排序 0=默认，1=秒杀，2=砍价，3=拼团")
    private String activityStr;

    @Schema(name  = "为移动端特定参数")
    private ProductActivityItemResponse activityH5;

    @Schema(name  = "为移动端特定参数 所有参与的活动")
    private List<ProductActivityItemResponse> activityAllH5;

    @Schema(name  = "商品属性")
    private List<StoreProductAttr> attr;

    @Schema(name  = "商品属性详情")
    private List<StoreProductAttrValueResponse> attrValue;

    @Schema(name  = "管理端用于映射attrResults")
    private List<HashMap<String,Object>> attrValues;

    private Integer[] cateIds;

    @Schema(name  = "商品描述")
    private String content;

    @Schema(name  = "收藏数量")
    private Integer collectCount;

    @Schema(name  = "优惠券")
    private List<StoreCoupon> coupons;

    @Schema(name  = "优惠券Ids")
    private List<Integer> couponIds;

    // 秒杀用到
    @Schema(name  = "活动标题")
    private String title;

    @Schema(name  = "简介")
    private String info;

    @Schema(name  = "时间段ID")
    private Integer timeId;

    @Schema(name  = "最多秒杀几个")
    private Integer num;

    @Schema(name  = "开始时间")
    private Date startTime;

    @Schema(name  = "结束时间")
    private Date stopTime;

    @Schema(name  = "开始时间")
    private String startTimeStr;

    @Schema(name  = "结束时间")
    private String stopTimeStr;

    @Schema(name  = "秒杀状态 0=关闭 1=开启")
    private Integer status;

    @Schema(name  = "商品id")
    private Integer productId;

    @Schema(name  = "秒杀轮播图")
    private String images;

    @Schema(name  = "限购数量 - 销量")
    private Integer quota;

    @Schema(name  = "限购总数")
    private Integer quotaShow;

    @Schema(name  = "砍价规则")
    private String rule;

    @Schema(name  = "用户每次砍价的次数")
    private Integer bargainNum;

    @Schema(name  = "帮助砍价好友人数")
    private Integer peopleNum;

    // 拼团部分
    @Schema(name  = "推荐")
    private Boolean isHost;

    @Schema(name  = "参团人数")
    private Integer people;

    @Schema(name  = "拼团订单有效时间(小时)")
    private Integer effectiveTime;

    @Schema(name  = "单次购买数量")
    private Integer onceNum;

    @Schema(name  = "虚拟成团百分比")
    private Integer virtualRation;

    @Schema(name  = "砍价商品最低价")
    private BigDecimal minPrice;

    @Schema(name  = "砍价结束时间")
    private Long endTime;
}
