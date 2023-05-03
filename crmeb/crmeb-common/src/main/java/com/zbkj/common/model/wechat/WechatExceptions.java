package com.zbkj.common.model.wechat;

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
 *  微信异常表
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
@TableName("eb_wechat_exceptions")
@Schema(name ="WechatExceptions对象", description="微信异常表")
public class WechatExceptions implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @Schema(name  = "错误码")
    private String errcode;

    @Schema(name  = "错误信息")
    private String errmsg;

    @Schema(name  = "回复数据")
    private String data;

    @Schema(name  = "备注")
    private String remark;

    @Schema(name  = "创建时间")
    private Date createTime;

    @Schema(name  = "更新时间")
    private Date updateTime;


}
