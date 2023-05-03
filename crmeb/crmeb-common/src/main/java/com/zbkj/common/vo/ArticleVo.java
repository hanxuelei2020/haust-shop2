package com.zbkj.common.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * 文章管理 Vo
 *  +----------------------------------------------------------------------
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
@Schema(name ="ArticleVo对象", description="文章管理表")
public class ArticleVo implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "文章管理ID")
    private Integer id;

    @Schema(name  = "分类id")
    private String cid;

    @Schema(name  = "文章标题")
    private String title;

    @Schema(name  = "文章作者")
    private String author;

    @Schema(name  = "文章图片")
    private String imageInput;

    @Schema(name  = "文章简介")
    private String synopsis;

    @Schema(name  = "浏览次数")
    private String visit;

    @Schema(name  = "更新时间")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone="GMT+8")
    private Date updateTime;
}
