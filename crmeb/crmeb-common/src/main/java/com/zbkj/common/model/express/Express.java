package com.zbkj.common.model.express;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 快递公司表
 *  +----------------------------------------------------------------------
 *  | CRMEB [ CRMEB赋能开发者，助力企业发展 ]
 *  +----------------------------------------------------------------------
 *  | Copyright (c) 2016~2022 https://www.crmeb.com All rights reserved.
 *  +----------------------------------------------------------------------
 *  | Licensed CRMEB并不是自由软件，未经许可不能去掉CRMEB相关版权
 *  +----------------------------------------------------------------------
 *  | Author: CRMEB Team <admin@crmeb.com>
 *  +----------------------------------------------------------------------
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("eb_express")
@Schema(name ="Express对象", description="快递公司表")
public class Express implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "快递公司id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @Schema(name  = "快递公司简称")
    private String code;

    @Schema(name  = "快递公司全称")
    private String name;

    @Schema(name  = "是否需要月结账号")
    private Boolean partnerId;

    @Schema(name  = "是否需要月结密码")
    private Boolean partnerKey;

    @Schema(name  = "是否需要取件网店")
    private Boolean net;

    @Schema(name  = "账号")
    private String account;

    @Schema(name  = "密码")
    private String password;

    @Schema(name  = "网点名称")
    private String netName;

    @Schema(name  = "排序")
    private Integer sort;

    @Schema(name  = "是否显示")
    private Boolean isShow;

    @Schema(name  = "是否可用")
    private Boolean status;
}
