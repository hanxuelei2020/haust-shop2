package com.zbkj.common.request;

import com.baomidou.mybatisplus.annotation.TableName;
import com.zbkj.common.model.product.StoreProductAttr;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * 商品请求对象
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
@Schema(name ="StoreProductRequest对象", description="商品请求对象")
public class StoreProductRequest implements Serializable {

    private static final long serialVersionUID = -452373239606480650L;

    @Schema(name  = "商品id")
    private Integer id;

    @Schema(name  = "商户Id(0为总后台管理员创建,不为0的时候是商户后台创建)")
    private Integer merId;

    @Schema(name  = "商品图片")
    @NotNull(message = "商拼图片不能为空")
    private String image;

    @Schema(name  = "轮播图")
    @NotNull(message = "轮播图不能为空")
    private String sliderImage;

    @Schema(name  = "商品名称")
    @NotNull(message = "商品名称不能为空")
    private String storeName;

    @Schema(name  = "商品简介")
    @NotNull(message = "商品简介不能为空")
    private String storeInfo;

    @Schema(name  = "关键字")
    @NotNull(message = "关键字不能为空")
    private String keyword;

    @Schema(name  = "商品条码（一维码）")
    private String barCode;

    @Schema(name  = "分类id")
    @NotNull(message = "分类id不能为空")
    private String cateId;

    @Schema(name  = "商品价格")
    private BigDecimal price;

    @Schema(name  = "会员价格")
    private BigDecimal vipPrice;

    @Schema(name  = "市场价")
    private BigDecimal otPrice;

    @Schema(name  = "邮费")
    private BigDecimal postage;

    @Schema(name  = "单位名")
    @NotNull(message = "单位名称不能为空")
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
    @NotNull(message = "商品规格不能为空")
    private Boolean specType;

    @Schema(name  = "活动显示排序 0=默认，1=秒杀，2=砍价，3=拼团")
    private List<String> activity;

    @Schema(name  = "商品属性")
    private List<StoreProductAttr> attr;

    @Schema(name  = "商品属性详情")
    private List<StoreProductAttrValueRequest> attrValue;

    @Schema(name  = "商品分类")
    private List<Integer> cateIds;

    @Schema(name  = "商品描述")
//    @NotNull(message = "商品描述不能为空")
    private String content;

    @Schema(name  = "优惠券id集合")
    private List<Integer> couponIds;
}
