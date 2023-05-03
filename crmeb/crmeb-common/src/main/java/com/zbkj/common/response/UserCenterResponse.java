package com.zbkj.common.response;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 个人中心响应对象
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
@Schema(name ="UserCenterResponse对象", description="个人中心响应对象")
public class UserCenterResponse implements Serializable {

    private static final long serialVersionUID=1L;

//    @Schema(name  = "合伙人id")
//    private Integer partnerId;

    @Schema(name  = "用户昵称")
    private String nickname;

    @Schema(name  = "用户头像")
    private String avatar;

    @Schema(name  = "手机号码")
    private String phone;

    @Schema(name  = "用户余额")
    private BigDecimal nowMoney;

    @Schema(name  = "用户剩余积分")
    private Integer integral;

    @Schema(name  = "用户剩余经验")
    private Integer experience;

    @Schema(name  = "佣金金额")
    private BigDecimal brokeragePrice;

//    @Schema(name  = "连续签到天数")
//    private Integer signNum;

    @Schema(name  = "等级")
    private Integer level;

//    @Schema(name  = "推广元id")
//    private Integer spreadUid;

    @Schema(name  = "是否为推广员")
    private Boolean isPromoter;

    @Schema(name  = "用户优惠券数量")
    private Integer couponCount;

    @Schema(name  = "是否会员")
    private boolean vip;

    @Schema(name  = "会员图标")
    private String vipIcon;

    @Schema(name  = "会员名称")
    private String vipName;

    @Schema(name  = "小程序充值开关")
    private Boolean rechargeSwitch;

    @Schema(name  = "用户收藏数量")
    private Integer collectCount;
}
