package com.zbkj.common.response;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/**
 * 首页信息Response
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
@Schema(name ="IndexInfoResponse对象", description="用户登录返回数据")
public class IndexInfoResponse implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "首页banner滚动图")
    private List<HashMap<String, Object>> banner;

    @Schema(name  = "导航模块")
    private List<HashMap<String, Object>> menus;

    @Schema(name  = "新闻简报消息滚动")
    private List<HashMap<String, Object>> roll;

    @Schema(name  = "企业logo")
    private String logoUrl;

    @Schema(name  = "是否关注公众号")
    private boolean subscribe;

    @Schema(name  = "首页超值爆款")
    private List<HashMap<String, Object>> explosiveMoney;

    @Schema(name  = "首页精品推荐图片")
    private List<HashMap<String, Object>> bastBanner;

    @Schema(name  = "云智服H5 url")
    private String yzfUrl;

    @Schema(name  = "商品分类页配置")
    private String categoryPageConfig;

    @Schema(name  = "是否隐藏一级分类")
    private String isShowCategory;

    @Schema(name  = "客服电话")
    private String consumerHotline;

    @Schema(name  = "客服电话服务开关")
    private String telephoneServiceSwitch;

    @Schema(name  = "首页商品列表模板配置")
    private String homePageSaleListStyle;
}
