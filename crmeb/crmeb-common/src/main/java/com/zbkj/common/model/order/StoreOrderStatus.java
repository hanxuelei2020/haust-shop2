package com.zbkj.common.model.order;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 订单操作记录表
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
@TableName("eb_store_order_status")
@Schema(name ="StoreOrderStatus对象", description="订单操作记录表")
public class StoreOrderStatus implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "订单id")
    private Integer oid;

    @Schema(name  = "操作类型")
    private String changeType;

    @Schema(name  = "操作备注")
    private String changeMessage;

    @Schema(name  = "操作时间")
    private Date createTime;


}
