package com.zbkj.common.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 用户地址表
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
@Schema(name ="RegisterThirdUserRequest对象", description="三方用户注册对象")
public class RegisterThirdUserRequest implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "用户昵称", required = true)
    private String nickName;

    @Schema(name  = "性别", required = true)
    private String sex;

    @Schema(name  = "用户个人资料填写的省份")
    private String province;

    @Schema(name  = "普通用户个人资料填写的城市")
    private String city;

    @Schema(name  = "国家，如中国为CN")
    private String country;

    @Schema(name  = "微信小程序用户头像", required = true)
    private String avatar;

    @Schema(name  = "推广人id")
    @JsonProperty(value = "spread_spid", defaultValue = "0")
    private Integer spreadPid;

    @Schema(name  = "微信公众号用户头像", required = true)
    private String headimgurl;

    @Schema(name  = "用户类型:wechat-公众号，routine-小程序，h5-H5,iosWx-苹果微信，androidWx-安卓微信")
    private String type;

    @Schema(name  = "用户openId")
    private String openId;
}
