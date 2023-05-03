package com.zbkj.common.vo;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 支付附加对象
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
@Schema(name ="AttachVo对象", description="支付附加对象")
public class AttachVo {

    public AttachVo() {
    }

    public AttachVo(String type, Integer userId) {
        this.type = type;
        this.userId = userId;
    }

    @Schema(name  = "业务类型， 订单 = order， 充值 = recharge", required = true)
    private String type = "order";

    @Schema(name  = "用户id", required = true)
    private Integer userId;

}
