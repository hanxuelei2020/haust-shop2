package com.zbkj.common.response;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 推广用户响应体
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
public class SpreadUserResponse {

    @Schema(name  = "用户id")
    private Integer uid;

    @Schema(name  = "真实姓名")
    private String realName;

    @Schema(name  = "用户昵称")
    private String nickname;

    @Schema(name  = "用户头像")
    private String avatar;

    @Schema(name  = "手机号码")
    private String phone;

    @Schema(name  = "佣金金额,未提现金额")
    private BigDecimal brokeragePrice;

    @Schema(name  = "推广人id")
    private Integer spreadUid;

    @Schema(name  = "上级推广员名称")
    private String spreadNickname;

    @Schema(name  = "用户购买次数")
    private Integer payCount;

    @Schema(name  = "推广用户数")
    private Integer spreadCount;

    @Schema(name  = "推广订单数")
    private Integer spreadOrderNum;

    @Schema(name  = "推广订单额")
    private BigDecimal spreadOrderTotalPrice;

    @Schema(name  = "佣金总金额")
    private BigDecimal totalBrokeragePrice;

    @Schema(name  = "推广用户数量")
    private int spreadPeopleCount;

    @Schema(name  = "已提现金额")
    private BigDecimal extractCountPrice;

    @Schema(name  = "已提现次数")
    private Integer extractCountNum;

    @Schema(name  = "冻结佣金")
    private BigDecimal freezeBrokeragePrice;

    @Schema(name  = "成为分销员时间")
    private Date promoterTime;
}
