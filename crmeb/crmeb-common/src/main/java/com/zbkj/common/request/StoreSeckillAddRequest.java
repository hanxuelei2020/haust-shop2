package com.zbkj.common.request;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * 秒杀商品添加请求对象
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
@Schema(name ="StoreSeckillAddRequest对象", description="秒杀商品添加请求对象")
public class StoreSeckillAddRequest {

    @Schema(name  = "商品秒杀产品表id|新增时不填，修改时必填")
    private Integer id;

    @Schema(name  = "主商品id", required = true)
    @NotNull(message = "主商品id不能为空")
    private Integer productId;

    @Schema(name  = "推荐图", required = true)
    @NotBlank(message = "推荐图不能为空")
    @Length(max = 255, message = "推荐图名称长度不能超过255个字符")
    private String image;

    @Schema(name  = "轮播图", required = true)
    @NotBlank(message = "轮播图不能为空")
    @Length(max = 2000, message = "轮播图长度不能超过2000个字符")
    private String images;

    @Schema(name  = "活动标题", required = true)
    @NotBlank(message = "活动标题不能为空")
    @Length(max = 255, message = "活动标题长度不能超过255个字符")
    private String title;

    @Schema(name  = "简介", required = true)
    @NotBlank(message = "简介不能为空")
    @Length(max = 255, message = "简介长度不能超过255个字符")
    private String info;

    @Schema(name  = "单位名", required = true)
    @NotBlank(message = "单位名不能为空")
    @Length(max = 16, message = "单位名长度不能超过16个字符")
    private String unitName;

    @Schema(name  = "开始时间", required = true)
    @NotBlank(message = "开始时间不能为空")
    private String startTime;

    @Schema(name  = "结束时间", required = true)
    @NotBlank(message = "结束时间不能为空")
    private String stopTime;

    @Schema(name  = "秒杀状态 0=关闭 1=开启", required = true)
    @NotNull(message = "秒杀状态不能为空")
    @Range(min = 0, max = 1, message = "未知的秒杀状态")
    private Integer status;

    @Schema(name  = "当天参加秒杀次数", required = true)
    @NotNull(message = "当天参加秒杀次数不能为空")
    private Integer num;

    @Schema(name  = "时间段ID", required = true)
    @NotNull(message = "时间段不能为空")
    private Integer timeId;

    @Schema(name  = "运费模板ID", required = true)
    @NotNull(message = "运费模板不能为空")
    private Integer tempId;

    @Schema(name  = "商品属性", required = true)
    @NotEmpty(message = "商品属性不能为空")
    private List<StoreProductAttrAddRequest> attr;

    @Schema(name  = "商品属性详情|只传选中项", required = true)
    @NotEmpty(message = "商品属性详情不能为空")
    private List<StoreProductAttrValueAddRequest> attrValue;

    @Schema(name  = "商品描述")
    private String content;

    @Schema(name  = "排序")
    private Integer sort;

    @Schema(name  = "规格 0单 1多", required = true)
    @NotNull(message = "规格类型不能为空")
    private Boolean specType;
}
