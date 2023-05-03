package com.zbkj.common.vo;

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
 * 门店自提
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
@TableName("eb_system_store")
@Schema(name ="SystemStoreNearVo对象", description="门店自提")
public class SystemStoreNearVo implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @Schema(name  = "门店名称")
    private String name;

    @Schema(name  = "简介")
    private String introduction;

    @Schema(name  = "手机号码")
    private String phone;

    @Schema(name  = "省市区")
    private String address;

    @Schema(name  = "详细地址")
    private String detailedAddress;

    @Schema(name  = "门店logo")
    private String image;

    @Schema(name  = "纬度")
    private String latitude;

    @Schema(name  = "经度")
    private String longitude;

    @Schema(name  = "核销有效日期")
    private String validTime;

    @Schema(name  = "每日营业开关时间")
    private String dayTime;

    @Schema(name  = "是否显示")
    private Boolean isShow;

    @Schema(name  = "是否删除")
    private Boolean isDel;

    @Schema(name  = "创建时间")
    private Date createTime;

    @Schema(name  = "修改时间")
    private Date updateTime;

    @Schema(name  = "距离，单位米")
    private String distance;

}
