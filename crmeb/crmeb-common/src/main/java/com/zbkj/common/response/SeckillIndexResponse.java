package com.zbkj.common.response;

import com.zbkj.common.model.seckill.StoreSeckill;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * 秒杀首页响应对象
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
@Schema(name ="SeckillIndexResponse对象", description="秒杀首页响应对象")
public class SeckillIndexResponse {

    @Schema(name  = "秒杀时段信息")
    private SecKillResponse secKillResponse;

    @Schema(name  = "秒杀商品信息")
    private List<StoreSeckill> productList;
}
