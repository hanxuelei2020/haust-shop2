package com.zbkj.common.vo;

 
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 拼团商品ExeclVo对象
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
public class CombinationProductExcelVo {

    @Schema(name  = "编号")
    private Integer id;

    @Schema(name  = "拼团名称")
    private String title;

    @Schema(name  = "原价")
    private BigDecimal otPrice;

    @Schema(name  = "拼团价")
    private BigDecimal price;

    @Schema(name  = "库存剩余")
    private Integer quotaShow;

    @Schema(name  = "拼团人数")
    private Integer countPeople;

    @Schema(name  = "参与人数")
    private Integer countPeopleAll;

    @Schema(name  = "成团数量")
    private Integer countPeoplePink;

    @Schema(name  = "销量")
    private Integer sales;

    @Schema(name  = "商品状态")
    private String isShow;

    @Schema(name  = "拼团结束时间")
    private String stopTime;
}
