package com.zbkj.common.response;

 
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 商品排行响应对象
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
@Schema(name ="ProductRankingResponse对象", description="商品排行响应对象")
public class ProductRankingResponse implements Serializable {

    private static final long serialVersionUID = 3362714265772774491L;

    @Schema(name  = "顺序")
    private Integer sort;

    @Schema(name  = "商品id")
    private Integer productId;

    @Schema(name  = "浏览量")
    private Integer pageView;

    @Schema(name  = "收藏量")
    private Integer collectNum;

    @Schema(name  = "加购件数")
    private Integer addCartNum;

    @Schema(name  = "下单商品数（销售件数）")
    private Integer salesNum;

    @Schema(name  = "销售额")
    private BigDecimal salesAmount;

    @Schema(name  = "商品名称")
    private String proName;

    @Schema(name  = "商品图片")
    private String image;
}
