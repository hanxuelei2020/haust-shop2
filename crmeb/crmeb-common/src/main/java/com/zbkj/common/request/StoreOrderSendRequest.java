package com.zbkj.common.request;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.Min;
import org.hibernate.validator.constraints.NotBlank;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单发货对象
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
@Schema(name ="StoreOrderSendRequest对象", description="订单发货对象")
public class StoreOrderSendRequest {
    private static final long serialVersionUID=1L;

    @Schema(name  = "订单id")
    private Integer id;

    @Schema(name  = "订单编号")
    @NotBlank(message = "订单编号不能为空")
    private String orderNo;

    @Schema(name  = "类型， 1发货，2送货，3虚拟", allowableValues = "range[1,2,3]")
    @NotBlank(message = "请选择类型")
    private String type;

    @Schema(name  = "快递公司名,发货类型必传")
    private String expressName;

    @Schema(name  = "快递公司编码,发货类型必传")
    private String expressCode;

    @Schema(name  = "快递单号,发货类型必传")
    private String expressNumber;

    @Schema(name  = "发货记录类型，1正常、2电子面单,发货类型必传")
    private String expressRecordType;

    @Schema(name  = "电子面单模板,电子面单必传")
    private String expressTempId;

    @Schema(name  = "寄件人姓名,电子面单必传")
    private String toName;

    @Schema(name  = "寄件人电话,电子面单必传")
    private String toTel;

    @Schema(name  = "寄件人地址,电子面单必传")
    private String toAddr;

    @Schema(name  = "送货人姓名,送货类型必传")
    private String deliveryName;

    @Schema(name  = "送货人电话,送货类型必传")
    private String deliveryTel;
}
