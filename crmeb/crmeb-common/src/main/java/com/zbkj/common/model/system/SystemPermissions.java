package com.zbkj.common.model.system;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 系统权限表
 * </p>
 *
 * @author HZW
 * @since 2021-11-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
//@TableName("eb_system_permissions")
@Schema(name ="SystemPermissions对象", description="系统权限表")
public class SystemPermissions implements Serializable {

    private static final long serialVersionUID=1L;

//    @TableId(value = "id", type = IdType.AUTO)
    @Schema(name  = "id")
    private Integer id;

    @Schema(name  = "父级ID")
    private Integer pid;

    @Schema(name  = "权限名称")
    private String name;

    @Schema(name  = "权限地址")
    private String path;

    @Schema(name  = "排序")
    private Integer sort;

    @Schema(name  = "是否删除")
    private Boolean isDelte;


}
