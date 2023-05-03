package com.zbkj.common.vo;

import com.baomidou.mybatisplus.annotation.TableField;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 订单购物详情表
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
@Schema(name ="StoreOrderInfoVo对象", description="订单购物详情表")
public class StoreOrderInfoOldVo implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "id")
    private Integer id;

    @Schema(name  = "订单id")
    private Integer orderId;

    @Schema(name  = "商品ID")
    private Integer productId;

    @Schema(name  = "购买东西的详细信息")
    private OrderInfoDetailVo info;

    @Schema(name  = "唯一id")
    @TableField(value = "`unique`")
    private String unique;



}
