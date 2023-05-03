package com.zbkj.common.model.wechat;

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
 * 微信二维码管理表
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
@TableName("eb_wechat_qrcode")
@Schema(name ="WechatQrcode对象", description="微信二维码管理表")
public class WechatQrcode implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "微信二维码ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @Schema(name  = "二维码类型")
    private String thirdType;

    @Schema(name  = "用户id")
    private Integer thirdId;

    @Schema(name  = "二维码参数")
    private String ticket;

    @Schema(name  = "二维码有效时间")
    private Integer expireSeconds;

    @Schema(name  = "状态")
    private Boolean status;

    @Schema(name  = "微信访问url")
    private String url;

    @Schema(name  = "微信二维码url")
    private String qrcodeUrl;

    @Schema(name  = "被扫的次数")
    private Integer scan;

    @Schema(name  = "创建时间")
    private Date createTime;

    @Schema(name  = "修改时间")
    private Date updateTime;


}
