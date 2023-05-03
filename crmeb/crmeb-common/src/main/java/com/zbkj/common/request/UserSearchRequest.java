package com.zbkj.common.request;

import com.baomidou.mybatisplus.annotation.TableName;
import com.zbkj.common.annotation.StringContains;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import org.hibernate.validator.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

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
public class UserSearchRequest implements Serializable {

    private static final long serialVersionUID=1L;


    @Schema(name  = "关键字")
    private String keywords;

    @Schema(name  = "时间")
    private String dateLimit;

    @Schema(name  = "用户分组")
    private String groupId;

    @Schema(name  = "用户标签")
    private String labelId;

    @Schema(name  = "用户登陆类型，h5 = h5， wechat = wechat，routine = routine", allowableValues = "range[h5,wechat,routine]")
    @StringContains(limitValues = {"h5","wechat","routine"}, message = "请选择正确的用户登录类型")
    private String userType;

    @Schema(name  = "状态是否正常， 0 = 禁止， 1 = 正常")
    private Boolean status = null;

    @Schema(name  = "是否为推广员， 0 = 禁止， 1 = 正常")
    private Boolean isPromoter = null;

    @Schema(name  = "消费情况")
    private String payCount;

    @Schema(name  = "等级")
    private String level;

    //时间类型
    @Schema(name  = "访问情况， 0 = 全部， 1 = 首次， 2 = 访问过， 3 = 未访问", allowableValues = "range[0,1,2,3]")
    @NotNull(message = "访问情况不能为空")
    private Integer accessType = 0;

    @Schema(name  = "国家，中国CN，其他OTHER")
    private String country;

    @Schema(name  = "省份")
    private String province;

    @Schema(name  = "城市")
    private String city;

    @Schema(name  = "性别，0未知，1男，2女，3保密")
    private String sex;
}
