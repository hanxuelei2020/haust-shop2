package com.zbkj.common.vo;

 
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * 一号通物流查询结果对象
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
@Schema(name ="OnePassLogisticsQueryVo对象", description = "一号通物流查询结果对象")
public class OnePassLogisticsQueryVo {

    private static final long serialVersionUID=1L;

    @Schema(name  = "是否签收")
    private String ischeck;

    @Schema(name  = "物流状态：0：快递收件(揽件)1.在途中 2.正在派件 3.已签收 4.派送失败 5.疑难件 6.退件签收 ")
    private String status;

    @Schema(name  = "物流公司")
    private String com;

    @Schema(name  = "快递单号")
    private String num;

    @Schema(name  = "物流详情")
    private List<OnePassLogisticsTrackVo> content;

}
