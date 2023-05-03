package com.zbkj.common.response;

import com.zbkj.common.model.product.StoreProductAttr;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/**
 * 商品秒杀详情响应对象
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
@Schema(name ="StoreSeckillDetailResponse对象", description="商品秒杀详情响应对象")
public class StoreSeckillDetailResponse implements Serializable {

    private static final long serialVersionUID = -4101548587444327191L;

    @Schema(name  = "产品属性")
    private List<StoreProductAttr> productAttr;

    @Schema(name  = "商品属性详情")
    private HashMap<String,Object> productValue;

    @Schema(name  = "返佣金额区间")
    private String priceName;

    @Schema(name  = "收藏标识")
    private Boolean userCollect;

    @Schema(name  = "秒杀商品信息")
    private SecKillDetailH5Response storeSeckill;

    @Schema(name  = "主商品状态:normal-正常，sellOut-售罄，soldOut-下架,delete-删除")
    private String masterStatus;
}
