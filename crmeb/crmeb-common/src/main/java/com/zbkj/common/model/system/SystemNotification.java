package com.zbkj.common.model.system;

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
 * 通知设置表
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
@TableName("eb_system_notification")
@Schema(name ="SystemNotification对象", description="通知设置表")
public class SystemNotification implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @Schema(name  = "标识")
    private String mark;

    @Schema(name  = "通知类型")
    private String type;

    @Schema(name  = "通知场景说明")
    private String description;

    @Schema(name  = "公众号模板消息（0：不存在，1：开启，2：关闭）")
    private Integer isWechat;

    @Schema(name  = "模板消息id")
    private Integer wechatId;

    @Schema(name  = "小程序订阅消息（0：不存在，1：开启，2：关闭）")
    private Integer isRoutine;

    @Schema(name  = "订阅消息id")
    private Integer routineId;

    @Schema(name  = "发送短信（0：不存在，1：开启，2：关闭）")
    private Integer isSms;

    @Schema(name  = "短信id")
    private Integer smsId;

    @Schema(name  = "发送类型（1：用户，2：管理员）")
    private Integer sendType;

    @Schema(name  = "创建时间")
    private Date createTime;


}
