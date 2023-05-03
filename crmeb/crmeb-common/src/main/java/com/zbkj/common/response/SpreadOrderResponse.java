package com.zbkj.common.response;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 推广订单响应体
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
@Schema(name ="SpreadOrderResponse对象", description="推广订单响应体")
public class SpreadOrderResponse {

    @Schema(name  = "订单ID")
    private Integer id;

    @Schema(name  = "订单号")
    private String orderId;

    @Schema(name  = "用户姓名")
    private String realName;

    @Schema(name  = "用户电话")
    private String userPhone;

    @Schema(name  = "佣金金额")
    private BigDecimal price;

    @Schema(name  = "更新时间")
    private Date updateTime;
}
