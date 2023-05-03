package com.zbkj.common.response;

 
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 提现数据用于分销
 *  +----------------------------------------------------------------------
 *  | CRMEB [ CRMEB赋能开发者，助力企业发展 ]
 *  +----------------------------------------------------------------------
 *  | Copyright (c) 2016~2022 https://www.crmeb.com All rights reserved.
 *  +----------------------------------------------------------------------
 *  | Licensed CRMEB并不是自由软件，未经许可不能去掉CRMEB相关版权
 *  +----------------------------------------------------------------------
 *  | Author: CRMEB Team <admin@crmeb.com>
 *  +----------------------------------------------------------------------
 */
@Data
public class UserExtractResponse {
    // 提现数据总额
    @Schema(name  = "体现数据总额")
    private BigDecimal extractCountPrice;
    // 提现次数
    @Schema(name  = "提现次数")
    private Integer extractCountNum;
    // 提现用户id
//    private Integer euid;
}
