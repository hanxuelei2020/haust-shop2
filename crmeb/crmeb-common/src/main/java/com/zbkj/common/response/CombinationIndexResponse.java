package com.zbkj.common.response;

import com.zbkj.common.model.combination.StoreCombination;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * 拼团首页响应对象
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
@Schema(name ="CombinationIndexResponse对象", description="拼团首页响应对象")
public class CombinationIndexResponse {

    @Schema(name  = "拼团3位用户头像")
    private List<String> avatarList;

    @Schema(name  = "拼团总人数")
    private Integer totalPeople;

    @Schema(name  = "拼团商品列表")
    private List<StoreCombination> productList;

}
