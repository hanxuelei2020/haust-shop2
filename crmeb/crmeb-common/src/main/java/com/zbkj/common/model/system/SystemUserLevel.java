package com.zbkj.common.model.system;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.util.Date;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 用户等级表
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
@TableName("eb_system_user_level")
@Schema(name ="SystemUserLevel对象", description="用户等级表")
public class SystemUserLevel implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @Schema(name  = "会员名称")
    private String name;

    @Schema(name  = "购买金额|经验达到")
    private Integer experience;

    @Schema(name  = "是否显示 1=显示,0=隐藏")
    private Boolean isShow;

    @Schema(name  = "会员等级")
    private Integer grade;

    @Schema(name  = "享受折扣")
    private Integer discount;

    @Schema(name  = "会员图标")
    private String icon;

    @Schema(name  = "是否删除.1=删除,0=未删除")
    private Boolean isDel;

    @Schema(name  = "创建时间")
    private Date updateTime;

    @Schema(name  = "创建时间")
    private Date createTime;
}
