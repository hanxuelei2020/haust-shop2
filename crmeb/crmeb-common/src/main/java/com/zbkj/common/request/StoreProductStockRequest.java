package com.zbkj.common.request;



import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.Min;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import java.io.Serializable;
import java.util.List;

/**
 * 商品库存
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
@Schema(name ="StoreProductStockRequest对象", description="库存修改")
public class StoreProductStockRequest implements Serializable {

    private static final long serialVersionUID=1L;

    @Schema(name  = "商品ID", required = true)
    @NotEmpty(message = "请选择商品")
    private Integer productId;

    private Integer seckillId;

    private Integer bargainId;

    private Integer combinationId;

    @Schema(name  = "商品属性ID集合", required = true)
    @NotEmpty(message = "请选择商品属性id集合")
    private Integer attrId;

    @Schema(name  = "类型， 增加 add | 减少 diff", required = true)
    @NotBlank(message = "请选择类型")
    private String operationType;

    @Schema(name  = "数量", required = true)
    @Min(value = 0, message = "请填写数量")
    private Integer num;

    @Schema(name  = "商品类型 0=普通 1=秒杀", required = false)
    private Integer type;

    @Schema(name  = "商品SKU信息")
    private String suk;
}
