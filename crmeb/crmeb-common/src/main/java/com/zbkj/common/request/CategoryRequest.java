package com.zbkj.common.request;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 分类表 Request
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
@TableName("eb_category")
@Schema(name ="Category对象", description="分类表")
public class CategoryRequest implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "父级ID")
    @NotNull(message = "请选择父级分类")
    @Min(value = 0, message = "请选择父级分类")
    private Integer pid;

    @Schema(name  = "分类名称")
    @NotBlank(message = "分类名称必须填写")
    @Length(max = 50, message = "分类名称不能超过50个字符")
    private String name;

    @Schema(name  = "类型，类型，1 产品分类，2 附件分类，3 文章分类， 4 设置分类， 5 菜单分类， 6 配置分类， 7 秒杀配置")
    @NotNull(message = "类型必须选择")
    @Range(min = 1, max = 6, message = "类型，1 产品分类，2 附件分类，3 文章分类， 4 设置分类， 5 菜单分类， 6 配置分类， 7 秒杀配置之间") //取值范围
    private Integer type;

    @Schema(name  = "地址")
//    @NotBlank(message = "地址名称必须填写")
    private String url;

    @Schema(name  = "扩展字段")
    private String extra;

    @Schema(name  = "状态, 0正常，1失效")
    @NotNull(message = "状态必须选择")
    private Boolean status;

    @Schema(name  = "排序")
    @NotNull(message = "排序数字为空")  //不可为空
    @Min(value = 0, message = "排序数字必须大于等于0") //数字最小值为0
    private Integer sort;

}
