package com.zbkj.common.model.seckill;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 商品秒杀管理表
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
@TableName("eb_store_seckill_manger")
@Schema(name ="StoreSeckillManger对象", description="商品秒杀管理表")
public class StoreSeckillManger implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @Schema(name  = "秒杀名称")
    private String name;

    @Schema(name  = "秒杀开始时间段")
    private Integer startTime;

    @Schema(name  = "秒杀结束时间段")
    private Integer endTime;

    @Schema(name  = "主图")
    private String img;

    @Schema(name  = "轮播图")
    private String silderImgs;

    @Schema(name  = "排序")
    private Integer sort;

    @Schema(name  = "状态 0=关闭 1=开启")
    private Integer status;

    @Schema(name  = "创建时间")
    private Date createTime;

    @Schema(name  = "更新时间")
    private Date updateTime;

    @Schema(name  = "0未删除1已删除")
    private Boolean isDel;


}
