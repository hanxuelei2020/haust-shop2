package com.zbkj.common.model.user;

import com.baomidou.mybatisplus.annotation.TableLogic;
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
@TableName("eb_user_address")
@Schema(name ="UserAddress对象", description="用户地址表")
public class UserAddress implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "用户地址id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @Schema(name  = "用户id")
    private Integer uid;

    @Schema(name  = "收货人姓名")
    private String realName;

    @Schema(name  = "收货人电话")
    private String phone;

    @Schema(name  = "收货人所在省")
    private String province;

    @Schema(name  = "收货人所在市")
    private String city;

    @Schema(name  = "城市id")
    private Integer cityId;

    @Schema(name  = "收货人所在区")
    private String district;

    @Schema(name  = "收货人详细地址")
    private String detail;

    @Schema(name  = "邮编")
    private Integer postCode;

    @Schema(name  = "经度")
    private String longitude;

    @Schema(name  = "纬度")
    private String latitude;

    @Schema(name  = "是否默认")
    private Boolean isDefault;

    @TableLogic
    @Schema(name  = "是否删除")
    private Boolean isDel;

    @Schema(name  = "创建时间")
    private Date updateTime;

    @Schema(name  = "创建时间")
    private Date createTime;


}
