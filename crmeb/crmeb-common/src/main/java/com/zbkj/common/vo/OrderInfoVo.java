package com.zbkj.common.vo;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.List;

/**
 * 预下单Vo对象
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
@Schema(name ="OrderInfoVo对象", description="预下单Vo对象")
public class OrderInfoVo {

    @Schema(name  = "运费金额")
    private BigDecimal freightFee;

    @Schema(name  = "优惠券编号（选择优惠券时有值")
    private Integer userCouponId;

    @Schema(name  = "优惠金额")
    private BigDecimal couponFee;

    @Schema(name  = "商品总计金额")
    private BigDecimal proTotalFee;

    @Schema(name  = "订单商品数量")
    private Integer orderProNum;

    @Schema(name  = "实际支付金额")
    private BigDecimal payFee;

    @Schema(name  = "地址id")
    private Integer addressId;

    @Schema(name  = "收货人姓名(前端用)")
    private String realName;

    @Schema(name  = "收货人电话(前端用)")
    private String phone;

    @Schema(name  = "收货人所在省(前端用)")
    private String province;

    @Schema(name  = "收货人所在市(前端用)")
    private String city;

    @Schema(name  = "收货人所在区(前端用)")
    private String district;

    @Schema(name  = "收货人详细地址(前端用)")
    private String detail;

    @Schema(name  = "用户剩余积分")
    private Integer userIntegral;

    @Schema(name  = "用户可用余额")
    private BigDecimal userBalance;

    @Schema(name  = "订单备注")
    private String remark;

    @Schema(name  = "订单详情数组")
    private List<OrderInfoDetailVo> orderDetailList;

    @Schema(name  = "秒杀商品Id")
    private Integer seckillId = 0;

    @Schema(name  = "砍价商品Id")
    private Integer bargainId = 0;

    @Schema(name  = "用户砍价活动id")
    private Integer bargainUserId;

    @Schema(name  = "拼团商品Id")
    private Integer combinationId = 0;

    @Schema(name  = "拼团团长Id")
    private Integer pinkId = 0;

    @Schema(name  = "购物车编号列表")
    private List<Long> cartIdList;

    @Schema(name  = "是否视频号订单")
    private Boolean isVideo = false;
}
