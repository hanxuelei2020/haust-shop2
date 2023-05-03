package com.zbkj.common.request;

import com.zbkj.common.constants.Constants;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import org.hibernate.validator.constraints.NotBlank;
import java.io.Serializable;

/**
 * 商品排行请求对象
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
@Schema(name ="ProductRankingRequest对象", description="商品排行请求对象")
public class ProductRankingRequest implements Serializable {

    private static final long serialVersionUID = 3362714265772774491L;

    @Schema(name  = "排序参数:pageviews-浏览量,collectNum-收藏数,addCartNum-加购数,salesNum-销量,salesAmount-销售额")
    @NotBlank(message = "请选择排序参数")
    private String sortKey;

    @Schema(name  = "时间参数")
    @NotBlank(message = "请先选择时间")
    private String dateLimit;

    @Schema(name  = "页码", example= Constants.DEFAULT_PAGE + "")
    private int page = Constants.DEFAULT_PAGE;

    @Schema(name  = "每页数量", example = Constants.DEFAULT_LIMIT + "")
    private int limit = Constants.DEFAULT_LIMIT;
}
