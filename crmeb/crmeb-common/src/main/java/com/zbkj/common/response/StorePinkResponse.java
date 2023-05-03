package com.zbkj.common.response;

 
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 拼团响应体
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
public class StorePinkResponse {

    private static final long serialVersionUID=1L;

    @Schema(name  = "拼团ID")
    private Integer id;

    @Schema(name  = "用户id")
    private Integer uid;

    @Schema(name  = "订单id 生成")
    private String orderId;

    @Schema(name  = "订单id  数据库")
    private Integer orderIdKey;

    @Schema(name  = "购买商品个数")
    private Integer totalNum;

    @Schema(name  = "购买总金额")
    private BigDecimal totalPrice;

    @Schema(name  = "拼团商品id")
    private Integer cid;

    @Schema(name  = "商品id")
    private Integer pid;

    @Schema(name  = "拼图总人数")
    private Integer people;

    @Schema(name  = "拼团商品单价")
    private BigDecimal price;

    @Schema(name  = "开始时间")
    private Long addTime;

    @Schema(name  = "结束时间")
    private Long stopTime;

    @Schema(name  = "团长id 0为团长")
    private Integer kId;

    @Schema(name  = "是否发送模板消息0未发送1已发送")
    private Boolean isTpl;

    @Schema(name  = "是否退款 0未退款 1已退款")
    private Boolean isRefund;

    @Schema(name  = "状态1进行中2已完成3未完成")
    private Integer status;

    @Schema(name  = "用户昵称")
    private String nickname;

    @Schema(name  = "用户头像")
    private String avatar;

    @Schema(name  = "是否虚拟拼团")
    private Boolean is_virtual;

    @Schema(name  = "几人参团")
    private Integer countPeople;

    @Schema(name  = "还剩几人成团")
    private Integer count;
}
