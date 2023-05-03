package com.zbkj.admin.vo;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 数据存储回复消息内容对象
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
@Schema(name ="MessageReplyDataVo对象", description="数据存储回复消息内容对象")
public class MessageReplyDataVo{

    @Schema(name  = "文本消息内容")
    private String Content;

    @Schema(name  = "图片/音频链接")
    private String src;

    @Schema(name  = "图片/音频媒体ID")
    private String mediaId;

    @Schema(name  = "文本消息内容")
    private Integer articleId;
}
