package com.zbkj.common.request;

 
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.Date;

/**
 * 系统附件类
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
public class SystemAttachmentRequest {
    private static final long serialVersionUID=1L;

    private Integer attId;

    @Schema(name  = "附件名称")
    private String name;

    @Schema(name  = "附件路径")
    private String attDir;

    @Schema(name  = "压缩图片路径")
    private String sattDir;

    @Schema(name  = "服务器上存储的绝对地址")
    private String rootDir;

    @Schema(name  = "附件大小")
    private String attSize;

    @Schema(name  = "附件类型")
    private String attType;

    @Schema(name  = "模块，store")
    private String model;

    @Schema(name  = "图片上传类型 1本地 2七牛云 3OSS 4COS ")
    private Integer imageType;

    @Schema(name  = "图片上传模块类型 1 后台上传 2 用户生成")
    private Integer moduleType;

    @Schema(name  = "创建时间")
    private Date createTime;
}
