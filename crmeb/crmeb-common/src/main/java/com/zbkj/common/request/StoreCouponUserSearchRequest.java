package com.zbkj.common.request;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 优惠卷领取搜索
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
@TableName("eb_store_coupon_user")
@Schema(name ="StoreCouponUser对象", description="优惠券领取搜索")
public class StoreCouponUserSearchRequest implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "优惠券所属用户")
    private Integer uid;

    @Schema(name  = "优惠券id")
    private Integer couponId;

    @Schema(name  = "优惠券名称")
    private String name;

    @Schema(name  = "状态（0：未使用，1：已使用, 2:已过期）")
    private Integer status;

    @Schema(name  = "最低消费多少金额可用优惠券")
    private BigDecimal minPrice;


}
