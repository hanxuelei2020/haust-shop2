package com.zbkj.common.response;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 用户签到信息响应对象
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
@Schema(name ="UserSignInfoResponse对象", description="用户签到信息响应对象")
public class UserSignInfoResponse implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "连续签到天数")
    private Integer signNum;

    @Schema(name  = "累计签到次数")
    private Integer sumSignDay;

    @Schema(name  = "今天是否签到")
    private Boolean isDaySign;

    @Schema(name  = "昨天是否签到")
    private Boolean isYesterdaySign;

    @Schema(name  = "用户积分")
    private Integer integral;

}
