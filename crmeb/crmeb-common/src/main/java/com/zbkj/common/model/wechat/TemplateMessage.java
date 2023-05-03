package com.zbkj.common.model.wechat;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 微信模板
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
@TableName("eb_template_message")
@Schema(name ="TemplateMessage对象", description="微信模板")
public class TemplateMessage implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "模板id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @Schema(name  = "0=订阅消息,1=微信模板消息")
    private Boolean type;

    @Schema(name  = "模板编号")
    private String tempKey;

    @Schema(name  = "模板名")
    @JsonProperty
    private String name;

    @Schema(name  = "回复内容")
    private String content;

    @Schema(name  = "模板ID")
    private String tempId;

    @Schema(name  = "状态")
    private Integer status;

    @Schema(name  = "添加时间")
    private Date createTime;

    @Schema(name  = "更新时间")
    private Date updateTime;
}
