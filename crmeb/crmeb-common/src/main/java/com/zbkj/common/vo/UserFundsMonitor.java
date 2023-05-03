package com.zbkj.common.vo;

 
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 用户充值对象类
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
@Schema(name ="UserFundsMonitor对象", description="佣金")
public class UserFundsMonitor implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "充值用户UID")
    private Integer uid;

    @Schema(name  = "昵称")
    private String nickname;

    @Schema(name  = "账户余额")
    private BigDecimal nowMoney;

    @Schema(name  = "账户佣金")
    private BigDecimal brokerage;

    @Schema(name  = "账户总佣金")
    private BigDecimal totalBrokerage;

    @Schema(name  = "提现总金额")
    private BigDecimal totalExtract;

    @Schema(name  = "创建时间")
    private Date createTime;

    @Schema(name  = "推广员UID")
    private Integer spreadUid;

    @Schema(name  = "推广员昵称")
    private String spreadName;
}
