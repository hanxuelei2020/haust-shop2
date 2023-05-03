package com.zbkj.common.request;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import org.hibernate.validator.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * 秒杀商品管理Request对象
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
@Schema(name ="StoreSeckillMangerRequest对象", description="")
public class StoreSeckillMangerRequest {

    @Schema(name  = "秒杀配置id")
    private Integer id;

    @Schema(name  = "秒杀时段名称")
    @NotBlank(message = "秒杀时段名称不能为空")
    @Length(max = 255, message = "秒杀时段名称不能超过255个字符")
    private String name;

//    @Schema(name  = "秒杀开始时间段")
//    private Integer startTime;
//
//    @Schema(name  = "秒杀结束时间段")
//    private Integer endTime;

    @Schema(name  = "秒杀结束时间段")
    @NotBlank(message = "秒杀时间段不能为空")
    private String time; // 接收参数一个字段，入库时分割为startTime/endTime

    @Schema(name  = "主图")
    private String img;

    @Schema(name  = "轮播图")
    @NotBlank(message = "轮播图不能为空")
    private String silderImgs;

    @Schema(name  = "排序")
    private Integer sort;

    @Schema(name  = "状态 0=关闭 1=开启")
    @NotNull(message = "状态不能为空")
    @Range(min = 0, max = 1, message = "未知的状态")
    private Integer status;

    @Schema(name  = "0未删除1已删除")
    private Boolean isDel;
}
