package com.zbkj.common.request;

import com.zbkj.common.constants.RegularConstants;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.Length;

import org.hibernate.validator.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

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
@Schema(name ="SystemStoreRequest对象", description="提货点")
public class SystemStoreRequest implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "门店名称")
    @NotBlank(message = "请填写门店名称")
    @Length(max = 100, message = "门店名称不能超过100个字符")
    private String name;

    @Schema(name  = "简介")
    private String introduction;

    @Schema(name  = "手机号码")
    @Pattern(regexp = RegularConstants.PHONE_TWO, message = "手机号码格式错误")
    private String phone;

    @Schema(name  = "提货点地址省市区")
    @NotBlank(message = "提货点地址")
    @Length(max = 255, message = "提货点地址不能超过255个字符")
    private String address;

    @Schema(name  = "详细地址")
    @NotBlank(message = "请填写详细地址")
    @Length(max = 255, message = "详细地址不能超过255个字符")
    private String detailedAddress;

    @Schema(name  = "每日营业开关时间")
    private String dayTime;

    @Schema(name  = "门店logo")
    @NotBlank(message = "请上传门店logo")
    @Length(max = 255, message = "门店logo不能超过255个字符")
    private String image;

    @Schema(name  = "纬度")
    @NotBlank(message = "请选择经纬度")
    private String latitude;

    @Schema(name  = "经度", example = "1,2")
    private String longitude;

    @Schema(name  = "核销有效日期")
    private String validTime;
}
