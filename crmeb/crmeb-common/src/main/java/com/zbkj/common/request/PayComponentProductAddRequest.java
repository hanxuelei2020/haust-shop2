package com.zbkj.common.request;



import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
 * 组件商品添加Request对象
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
@Schema(name ="PayComponentProductAddRequest对象", description="组件商品添加Request对象")
public class PayComponentProductAddRequest implements Serializable {

    private static final long serialVersionUID = -2196197495866986580L;

    @Schema(name  = "商品ID(更新时必填)")
    private Integer id;

    @Schema(name  = "主商品ID", required = true)
    @NotNull(message = "请先选择主商品")
    private Integer primaryProductId;

    @Schema(name  = "标题", required = true)
    @NotNull(message = "标题不能为空")
    private String title;

    @Schema(name  = "轮播图,多张", required = true)
    @NotNull(message = "轮播图不能为空")
    private String headImg;

    @Schema(name  = "商品资质图片,多张")
    private String qualificationPics;

    @Schema(name  = "第三级类目ID", required = true)
    @NotNull(message = "第三级类目不能为空")
    private Integer thirdCatId;

    @Schema(name  = "品牌id")
    private Integer brandId;

    @Schema(name  = "商品详情")
    private String descInfo;

    @Schema(name  = "商品详情图片,多图")
    private String descImgs;

    @Schema(name  = "运费模板ID", required = true)
    @NotNull(message = "运费模板不能为空")
    private Integer tempId;

    @Schema(name  = "库存")
    private Integer stock;

    @Schema(name  = "单位名", required = true)
    private String unitName;

    @Schema(name  = "获得积分", required = true)
    private Integer giveIntegral;

    @Schema(name  = "虚拟销量", required = true)
    private Integer ficti;

    @Schema(name  = "规格 0单 1多", required = true)
    private Boolean specType;

    @Schema(name  = "商品属性")
    private List<StoreProductAttrAddRequest> attr;

    @Schema(name  = "商品属性详情")
    private List<StoreProductAttrValueAddRequest> attrValue;
}
