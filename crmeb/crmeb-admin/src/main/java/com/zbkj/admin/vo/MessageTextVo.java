package com.zbkj.admin.vo;

 
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 微信消息文本模板
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
@Schema(name ="MessageTextVo对象", description="微信消息文本模板")
public class MessageTextVo extends BaseMessageVo {
    public MessageTextVo() {}
    public MessageTextVo(String toUserName, String fromUserName, String content) {
        super();
        ToUserName = toUserName;
        FromUserName = fromUserName;
        Content = content;
    }

    @Schema(name  = "文本消息内容")
    private String Content;
}
