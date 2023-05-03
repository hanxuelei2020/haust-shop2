package com.zbkj.common.request;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * 资金监控
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
@Schema(name ="FundsMonitorSearchRequest对象", description="资金监控")
public class FundsMonitorSearchRequest implements Serializable {

    @Schema(name  = "搜索关键字")
    private String keywords;

    @Schema(name  = "类型")
    private String category;

    @Schema(name  = "类型")
    private String type;

    @Schema(name  = "添加时间")
    private String dateLimit;

    @Schema(name  = "最大佣金")
    private BigDecimal max;

    @Schema(name  = "最小佣金")
    private BigDecimal min;

    @Schema(name  = "排序 asc/desc")
    private String sort;

    @JsonIgnore
    @Schema(name  = "关联id")
    private String linkId;

    @JsonIgnore
    @Schema(name  = "操作类型")
    private Integer pm;

    @Schema(name  = "用户id list")
    private List<Integer> userIdList;

    @Schema(name  = "用户id list")
    private Integer uid;
}
