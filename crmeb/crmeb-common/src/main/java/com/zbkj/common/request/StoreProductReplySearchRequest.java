package com.zbkj.common.request;

import com.baomidou.mybatisplus.annotation.TableName;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 商品评论查询对象
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
@Schema(name ="StoreProductReplySearchRequest对象", description="商品评论查询对象")
public class StoreProductReplySearchRequest implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "商品名称")
    private String productSearch;

    @Schema(name  = "0未回复1已回复")
    private Boolean isReply;

    @Schema(name  = "用户名称(支持模糊搜索)")
    private String nickname;

    @Schema(name  = "时间区间")
    private String dateLimit;
}
