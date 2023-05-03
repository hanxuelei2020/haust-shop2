package com.zbkj.common.response;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 砍价用户帮助响应体
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
public class StoreBargainUserHelpResponse implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "砍价用户帮助表ID")
    private Integer id;

    @Schema(name  = "帮助的用户id")
    private Integer uid;

    @Schema(name  = "砍价商品ID")
    private Integer bargainId;

    @Schema(name  = "用户参与砍价表id")
    private Integer bargainUserId;

    @Schema(name  = "帮助砍价多少金额")
    private BigDecimal price;

    @Schema(name  = "添加时间")
    private String addTime;

    @Schema(name  = "用户头像")
    private String avatar;

    @Schema(name  = "用户昵称")
    private String nickname;


}
