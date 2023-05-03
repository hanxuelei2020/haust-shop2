package com.zbkj.common.response;

 
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 拼团列表响应体
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
public class StorePinkAdminListResponse {

    private static final long serialVersionUID=1L;

    @Schema(name  = "拼团ID")
    private Integer id;

    @Schema(name  = "用户id")
    private Integer uid;

    @Schema(name  = "拼团总人数")
    private Integer people;

    @Schema(name  = "开始时间")
    private String addTime;

    @Schema(name  = "结束时间")
    private String stopTime;

    @Schema(name  = "团长id 0为团长")
    private Integer kId;

    @Schema(name  = "状态1进行中2已完成3未完成")
    private Integer status;

    @Schema(name  = "用户昵称")
    private String nickname;

    @Schema(name  = "用户头像")
    private String avatar;

    @Schema(name  = "几人参团")
    private Integer countPeople;

    @Schema(name  = "拼团商品")
    private String title;
}
