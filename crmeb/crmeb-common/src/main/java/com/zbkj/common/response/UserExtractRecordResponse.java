package com.zbkj.common.response;

import com.zbkj.common.model.finance.UserExtract;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * 提现记录响应对象
 * +----------------------------------------------------------------------
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
@Schema(name ="UserExtractRecordResponse对象", description="用户提现记录对象")
public class UserExtractRecordResponse {

    private static final long serialVersionUID=1L;

    public UserExtractRecordResponse() {}
    public UserExtractRecordResponse(String date, List<UserExtract> list) {
        this.date = date;
        this.list = list;
    }

    @Schema(name  = "月份")
    private String date;

    @Schema(name  = "数据")
    private List<UserExtract> list;
}
