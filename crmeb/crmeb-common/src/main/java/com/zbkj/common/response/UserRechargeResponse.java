package com.zbkj.common.response;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 用户充值 response
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
public class UserRechargeResponse {

    @Schema(name  = "充值记录ID")
    private Integer id;

    @Schema(name  = "充值用户UID")
    private Integer uid;

    @Schema(name  = "订单号")
    private String orderId;

    @Schema(name  = "充值金额")
    private BigDecimal price;

    @Schema(name  = "购买赠送金额")
    private BigDecimal givePrice;

    @Schema(name  = "充值类型")
    private String rechargeType;

    @Schema(name  = "是否充值")
    private Boolean paid;

    @Schema(name  = "充值支付时间")
    private Date payTime;

    @Schema(name  = "充值时间")
    private Date createTime;

    @Schema(name  = "退款金额")
    private BigDecimal refundPrice;

    @Schema(name  = "头像")
    private String avatar;

    @Schema(name  = "昵称")
    private String nickname;
}
