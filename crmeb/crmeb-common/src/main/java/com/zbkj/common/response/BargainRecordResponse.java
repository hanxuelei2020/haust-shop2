package com.zbkj.common.response;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

/**
 * 砍价记录响应对象
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
@Schema(name ="BargainRecordResponse对象", description="砍价记录响应对象")
public class BargainRecordResponse {

    @Schema(name  = "砍价商品ID")
    private Integer id;

    @Schema(name  = "关联商品ID")
    private Integer productId;

    @Schema(name  = "砍价活动名称")
    private String title;

    @Schema(name  = "砍价活动图片")
    private String image;

    @Schema(name  = "砍价结束时间")
    private Long stopTime;

    @Schema(name  = "用户砍价活动id")
    private Integer bargainUserId;

    @Schema(name  = "剩余金额")
    private BigDecimal surplusPrice;

    @Schema(name  = "状态 1参与中 2 活动结束参与失败 3活动结束参与成功")
    private Integer status;

    @Schema(name  = "是否取消")
    private Boolean isDel;

    @Schema(name  = "是否生成订单")
    private Boolean isOrder;

    @Schema(name  = "是否支付")
    private Boolean isPay;

    @Schema(name  = "订单号")
    private String orderNo;
}
