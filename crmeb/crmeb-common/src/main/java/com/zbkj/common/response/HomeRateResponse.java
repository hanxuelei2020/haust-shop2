package com.zbkj.common.response;

 
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 主页统计数据对象
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
@Schema(name ="HomeRateResponse对象", description="主页统计数据对象")
public class HomeRateResponse implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "今日销售额")
    private Object sales;

    @Schema(name  = "昨日销售额")
    private Object yesterdaySales;

    @Schema(name  = "今日访问量")
    private Object pageviews;

    @Schema(name  = "昨日访问量")
    private Object yesterdayPageviews;

    @Schema(name  = "今日订单量")
    private Object orderNum;

    @Schema(name  = "昨日订单量")
    private Object yesterdayOrderNum;

    @Schema(name  = "今日新增用户")
    private Object newUserNum;

    @Schema(name  = "昨日新增用户")
    private Object yesterdayNewUserNum;


}
