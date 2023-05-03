package com.zbkj.common.response;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户积分记录响应对象
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
@Schema(name ="UserIntegralRecordResponse对象", description="用户积分记录响应对象")
public class UserIntegralRecordResponse implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "记录id")
    private Integer id;

    @Schema(name  = "用户uid")
    private Integer uid;

    @Schema(name  = "关联id-orderNo,(sign,system默认为0）")
    private String linkId;

    @Schema(name  = "关联类型（order,sign,system）")
    private String linkType;

    @Schema(name  = "类型：1-增加，2-扣减")
    private Integer type;

    @Schema(name  = "标题")
    private String title;

    @Schema(name  = "积分")
    private Integer integral;

    @Schema(name  = "剩余")
    private Integer balance;

    @Schema(name  = "备注")
    private String mark;

    @Schema(name  = "状态：1-订单创建，2-冻结期，3-完成，4-失效（订单退款）")
    private Integer status;

    @Schema(name  = "冻结期时间（天）")
    private Integer frozenTime;

    @Schema(name  = "解冻时间")
    private Long thawTime;

    @Schema(name  = "添加时间")
    private Date createTime;

    @Schema(name  = "更新时间")
    private Date updateTime;

    @Schema(name  = "用户昵称")
    private String nickName;
}
