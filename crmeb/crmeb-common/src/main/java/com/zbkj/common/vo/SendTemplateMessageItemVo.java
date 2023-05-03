package com.zbkj.common.vo;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.HashMap;

/**
 * 微信模板发送数据类
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
@Schema(name ="SendTemplateMessageItemVo对象", description="微信模板发送数据类")
public class SendTemplateMessageItemVo {
    public SendTemplateMessageItemVo() {}
    public SendTemplateMessageItemVo(String value) {
        this.value = value;
    }

    @Schema(name  = "显示的文字内容", required = true)
    private String value;

    @Schema(name  = "颜色")
    private String color = "#173177";
}
