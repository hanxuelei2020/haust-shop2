package com.zbkj.common.model.user;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 用户表
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
@TableName("eb_user")
@Schema(name ="User对象", description="用户表")
public class User implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "用户id")
    @TableId(value = "uid", type = IdType.AUTO)
    private Integer uid;

    @Schema(name  = "用户账号")
    private String account;

    @Schema(name  = "用户密码")
    @JsonIgnore
    private String pwd;

    @Schema(name  = "真实姓名")
    private String realName;

    @Schema(name  = "生日")
    private String birthday;

    @Schema(name  = "身份证号码")
    private String cardId;

    @Schema(name  = "用户备注")
    private String mark;

    @Schema(name  = "合伙人id")
    private Integer partnerId;

    @Schema(name  = "用户分组id")
    private String groupId;

    @Schema(name  = "用户标签id")
    private String tagId;

    @Schema(name  = "用户昵称")
    private String nickname;

    @Schema(name  = "用户头像")
    private String avatar;

    @Schema(name  = "手机号码")
    private String phone;

    @Schema(name  = "性别")
    private int sex;

    @Schema(name  = "国家")
    private String country;

    @Schema(name  = "添加ip")
    private String addIp;

    @Schema(name  = "最后一次登录ip")
    private String lastIp;

    @Schema(name  = "用户余额")
    private BigDecimal nowMoney;

    @Schema(name  = "佣金金额")
    private BigDecimal brokeragePrice;

    @Schema(name  = "用户剩余积分")
    private Integer integral;

    @Schema(name  = "用户剩余经验")
    private Integer experience;

    @Schema(name  = "连续签到天数")
    private Integer signNum;

    @Schema(name  = "1为正常，0为禁止")
    private Boolean status;

    @Schema(name  = "等级")
    private Integer level;

    @Schema(name  = "推广人id")
    private Integer spreadUid;

    @Schema(name  = "推广员关联时间")
    private Date spreadTime;

    @Schema(name  = "用户类型")
    private String userType;

    @Schema(name  = "是否为推广员")
    private Boolean isPromoter;

    @Schema(name  = "用户购买次数")
    private Integer payCount;

    @Schema(name  = "下级人数")
    private Integer spreadCount;

    @Schema(name  = "详细地址")
    private String addres;

    @Schema(name  = "管理员编号 ")
    private Integer adminid;

    @Schema(name  = "用户登陆类型，h5,wechat,routine")
    private String loginType;

    @Schema(name  = "创建时间")
    private Date updateTime;

    @Schema(name  = "创建时间")
    private Date createTime;

    @Schema(name  = "最后一次登录时间")
    private Date lastLoginTime;

    @Schema(name  = "最后一次登录时间")
    private Date cleanTime;

    @Schema(name  = "用户推广等级")
    private String path;

    @Schema(name  = "是否关注公众号")
    private Boolean subscribe;

    @Schema(name  = "成为分销员时间")
    private Date promoterTime;
}
