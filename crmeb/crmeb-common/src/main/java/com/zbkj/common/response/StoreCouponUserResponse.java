package com.zbkj.common.response;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 优惠券记录表
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
@Schema(name ="StoreCouponUserResponse对象", description="优惠券记录表")
public class StoreCouponUserResponse implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @Schema(name  = "优惠券发布id")
    private Integer couponId;

    @Schema(name  = "兑换的项目id")
    private Integer cid;

    @Schema(name  = "领取人id")
    private Integer uid;

    @Schema(name  = "优惠券名称")
    private String name;

    @Schema(name  = "优惠券的面值")
    private BigDecimal money;

    @Schema(name  = "最低消费多少金额可用优惠券")
    private BigDecimal minPrice;

    @Schema(name  = "获取方式")
    private String type;

    @Schema(name  = "状态（0：未使用，1：已使用, 2:已失效）")
    private int status;

    @Schema(name  = "创建时间")
    private Date createTime;

    @Schema(name  = "更新时间")
    private Date updateTime;

    @Schema(name  = "开始使用时间")
    private Date startTime;

    @Schema(name  = "过期时间")
    private Date endTime;

    @Schema(name  = "使用时间")
    private Date useTime;

    @Schema(name  = "用户昵称")
    private String nickname;

    @Schema(name  = "用户头像")
    private String avatar;

    @Schema(name  = "用户头像")
    private Boolean isValid;

    @Schema(name  = "使用类型 1 全场通用, 2 商品券, 3 品类券")
    private Integer useType;

    @Schema(name  = "主键id 商品id/分类id", required = true)
    private String primaryKey;

    @Schema(name  = "有效状态：usable-可用，unusable-已用，overdue-过期，notStart-未开始")
    private String validStr;

    @Schema(name  = "开始使用时间字符串")
    private String useStartTimeStr;

    @Schema(name  = "过期时间字符串")
    private String useEndTimeStr;
}
