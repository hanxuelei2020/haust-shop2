package com.zbkj.common.response;

 
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 充值套餐响应对象
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
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Schema(name ="UserRechargeItemResponse对象", description="充值套餐响应对象")
public class UserRechargeItemResponse implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "充值模板id")
    private Integer id;

    @Schema(name  = "充值金额")
    private String price;

    @Schema(name  = "赠送金额")
    private String giveMoney;

}
