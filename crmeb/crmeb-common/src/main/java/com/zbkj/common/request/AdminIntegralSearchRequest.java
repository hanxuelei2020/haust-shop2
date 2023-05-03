package com.zbkj.common.request;

import com.baomidou.mybatisplus.annotation.TableName;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 后台积分查询请求对象
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
@Schema(name="AdminIntegralSearchRequest对象", description="后台积分查询请求对象")
public class AdminIntegralSearchRequest implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "添加时间")
    private String dateLimit;

    @Schema(name  = "搜索关键字")
    private String keywords;

    @Schema(name  = "用户id")
    private Integer uid;
}
