package com.zbkj.common.response;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 推广佣金明细
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
@Schema(name ="UserCommissionResponse对象", description="推广佣金明细")
public class UserCommissionResponse implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "昨天的佣金")
    private BigDecimal lastDayCount = BigDecimal.ZERO;

    @Schema(name  = "累计提现金额")
    private BigDecimal extractCount = BigDecimal.ZERO;

    @Schema(name  = "当前佣金")
    private BigDecimal commissionCount = BigDecimal.ZERO;
}
