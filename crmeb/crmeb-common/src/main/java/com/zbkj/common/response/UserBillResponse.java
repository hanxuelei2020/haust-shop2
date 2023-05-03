package com.zbkj.common.response;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 用户账单表
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
@TableName("eb_user_bill")
@Schema(name ="UserBill对象", description="用户账单表")
public class UserBillResponse implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "用户账单id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @Schema(name  = "用户uid")
    private Integer uid;

    @Schema(name  = "关联id")
    private String linkId;

    @Schema(name  = "0 = 支出 1 = 获得")
    private int pm;

    @Schema(name  = "账单标题")
    private String title;

    @Schema(name  = "明细种类")
    private String category;

    @Schema(name  = "明细类型")
    private String type;

    @Schema(name  = "明细数字")
    private BigDecimal number;

    @Schema(name  = "剩余")
    private BigDecimal balance;

    @Schema(name  = "备注")
    private String mark;

    @Schema(name  = "0 = 带确定 1 = 有效 -1 = 无效")
    private int status;

    @Schema(name  = "更新时间")
    private Date updateTime;

    @JsonProperty(value = "createTime")
    @Schema(name  = "创建时间")
    private Date createTime;

    @Schema(name  = "用户昵称")
    private String nickName;

}
