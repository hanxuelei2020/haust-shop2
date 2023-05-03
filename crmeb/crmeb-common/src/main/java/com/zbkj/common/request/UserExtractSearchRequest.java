package com.zbkj.common.request;

import com.baomidou.mybatisplus.annotation.TableName;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 用户提现表
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
@TableName("eb_user_extract")
@Schema(name ="UserExtract对象", description="用户提现表")
public class UserExtractSearchRequest implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "搜索关键字")
    private String keywords;

    @Schema(name  = "bank = 银行卡 alipay = 支付宝 weixin = 微信")
    private String extractType;

    @Schema(name  = "-1 未通过 0 审核中 1 已提现")
    private Integer status;

    @Schema(name  = "today,yesterday,lately7,lately30,month,year,/yyyy-MM-dd hh:mm:ss,yyyy-MM-dd hh:mm:ss/")
    private String dateLimit;

}
