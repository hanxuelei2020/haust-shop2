package com.zbkj.common.response;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zbkj.common.model.system.SystemStore;
import com.zbkj.common.model.user.User;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * 门店店员表
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
@TableName("eb_system_store_staff")
@Schema(name ="SystemStoreStaffResponse对象", description="门店店员表")
public class SystemStoreStaffResponse implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @Schema(name  = "微信用户id")
    private Integer uid;

    @Schema(name  = "店员头像")
    private String avatar;

    @Schema(name  = "用户信息")
    private User user;

    @Schema(name  = "门店id")
    private Integer storeId;

    @Schema(name  = "门店")
    private SystemStore systemStore;

    @Schema(name  = "店员名称")
    private String staffName;

    @Schema(name  = "手机号码")
    private String phone;

    @Schema(name  = "核销开关")
    private Integer verifyStatus;

    @Schema(name  = "状态")
    private Integer status;

    @Schema(name  = "创建时间")
    private Date createTime;

    @Schema(name  = "更新时间")
    private Date updateTime;
}
