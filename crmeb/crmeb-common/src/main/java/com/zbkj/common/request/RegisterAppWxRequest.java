package com.zbkj.common.request;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * App微信注册/登录请求对象
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
@Schema(name ="RegisterAppWxRequest对象", description="App微信注册/登录请求对象")
public class RegisterAppWxRequest implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "用户openId")
    private String openId;

    @Schema(name  = "用户unionId")
    private String unionId;

    @Schema(name  = "用户昵称", required = true)
    private String nickName;

    @Schema(name  = "性别:0未知，1-男，2-女", required = true)
    private String gender;

    @Schema(name  = "用户个人资料填写的省份")
    private String province;

    @Schema(name  = "普通用户个人资料填写的城市")
    private String city;

    @Schema(name  = "国家，如中国为CN")
    private String country;

    @Schema(name  = "微信App用户头像", required = true)
    private String avatarUrl;

    @Schema(name  = "微信App类型：iosWx-苹果微信，androidWx-安卓微信", required = true)
    private String type;

}
