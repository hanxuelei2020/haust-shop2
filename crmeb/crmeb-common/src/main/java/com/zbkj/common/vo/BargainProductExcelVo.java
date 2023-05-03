package com.zbkj.common.vo;

 
import lombok.Data;

import java.math.BigDecimal;

/**
 * 砍价商品ExeclVo对象
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
public class BargainProductExcelVo {

    @Schema(name  = "砍价活动名称")
    private String title;

    @Schema(name  = "砍价活动简介")
    private String info;

    @Schema(name  = "砍价金额")
    private String price;

    @Schema(name  = "用户每次砍价的次数")
    private Integer bargainNum;

    @Schema(name  = "砍价状态 0(到砍价时间不自动开启)  1(到砍价时间自动开启时间)")
    private String status;

    @Schema(name  = "砍价开启时间")
    private String startTime;

    @Schema(name  = "砍价结束时间")
    private String stopTime;

    @Schema(name  = "销量")
    private Integer sales;

    @Schema(name  = "库存剩余")
    private Integer quotaShow;

    @Schema(name  = "反多少积分")
    private BigDecimal giveIntegral;

    @Schema(name  = "添加时间")
    private String addTime;
}
