package com.zbkj.common.vo;

import com.baomidou.mybatisplus.annotation.TableField;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 获取微信用户信息
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
@Schema(name ="WeChatAuthorizeLoginUserInfoVo对象", description="获取微信用户信息")
public class WeChatAuthorizeLoginUserInfoVo implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "用户的唯一标识")
    @TableField(value = "openId")
    private String openId;

    @Schema(name  = "用户昵称")
    @TableField(value = "nickname")
    private String nickName;

    @Schema(name  = "性别")
    private String sex;

    @Schema(name  = "用户个人资料填写的省份")
    private String province;

    @Schema(name  = "普通用户个人资料填写的城市")
    private String city;

    @Schema(name  = "国家，如中国为CN")
    private String country;

    @Schema(name  = "用户头像")
    private String headimgurl;

    @Schema(name  = "用户特权信息，json 数组，如微信沃卡用户为（chinaunicom）")
    private String privilege;

    @Schema(name  = "只有在用户将公众号绑定到微信开放平台帐号后，才会出现该字段。")
    @TableField(value = "unionid")
    private String unionId;

}
