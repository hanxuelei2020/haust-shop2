package com.zbkj.common.response;

 
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 用户积分响应对象
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
@Schema(name ="IntegralUserResponse对象", description="用户积分响应对象")
public class IntegralUserResponse implements Serializable {

    private static final long serialVersionUID=1L;

//    @Schema(name  = "用户id")
//    private Integer uid;
//
//    @Schema(name  = "用户昵称")
//    private String nickname;
//
//    @Schema(name  = "用户头像")
//    private String avatar;
//
//    @Schema(name  = "用户余额")
//    private BigDecimal nowMoney;
//
    @Schema(name  = "用户剩余积分")
    private Integer integral;
//
//    @Schema(name  = "连续签到天数")
//    private Integer signNum;
//
//    @Schema(name  = "是否为推广员")
//    private Boolean isPromoter;
//
//    @Schema(name  = "用户购买次数")
//    private Integer payCount;
//
//    @Schema(name  = "下级人数")
//    private Integer spreadCount;
//
//    @Schema(name  = "累计签到次数")
//    private Integer sumSignDay;
//
//    @Schema(name  = "今天是否签到")
//    private Boolean isDaySign;
//
//    @Schema(name  = "昨天是否签到")
//    private Boolean isYesterdaySign;

    @Schema(name  = "累计总积分")
    private Integer sumIntegral;

    @Schema(name  = "累计抵扣积分")
    private Integer deductionIntegral;

//    @Schema(name  = "今日获得累计积分")
//    private Integer nowIntegral;

    @Schema(name  = "冻结的积分")
    private Integer frozenIntegral;

}
