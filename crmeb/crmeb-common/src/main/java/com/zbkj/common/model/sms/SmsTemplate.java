package com.zbkj.common.model.sms;

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
 * 短信模板表
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
@TableName("eb_sms_template")
@Schema(name ="SmsTemplate对象", description="短信模板表")
public class SmsTemplate implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @Schema(name  = "短信模板id")
    private String tempId;

    @Schema(name  = "模板类型")
    private Integer tempType;

    @Schema(name  = "模板说明")
    private String title;

    @Schema(name  = "类型")
    private String type;

    @Schema(name  = "模板编号")
    private String tempKey;

    @Schema(name  = "状态")
    private Integer status;

    @Schema(name  = "短息内容")
    private String content;

    @Schema(name  = "添加时间")
    private Date createTime;


}
