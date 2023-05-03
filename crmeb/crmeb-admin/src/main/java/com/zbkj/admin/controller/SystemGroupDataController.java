package com.zbkj.admin.controller;

import com.zbkj.common.page.CommonPage;
import com.zbkj.common.response.CommonResult;
import com.zbkj.common.request.PageParamRequest;
import com.zbkj.common.model.system.SystemGroupData;
import com.zbkj.common.request.SystemGroupDataRequest;
import com.zbkj.common.request.SystemGroupDataSearchRequest;
import com.zbkj.service.service.SystemGroupDataService;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


/**
 * 组合数据详情表 前端控制器
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
@Slf4j
@RestController
@RequestMapping("api/admin/system/group/data")
@Tag(name ="设置 -- 组合数据 -- 详情")
public class SystemGroupDataController {

    @Autowired
    private SystemGroupDataService systemGroupDataService;

    /**
     * 分页组合数据详情
     * @param request 搜索条件
     * @param pageParamRequest 分页参数
     */
    @PreAuthorize("hasAuthority('admin:system:group:data:list')")
    @Operation(summary = "分页组合数据详情")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public CommonResult<CommonPage<SystemGroupData>>  getList(@Validated SystemGroupDataSearchRequest request, @Validated PageParamRequest pageParamRequest) {
        CommonPage<SystemGroupData> systemGroupDataCommonPage = CommonPage.restPage(systemGroupDataService.getList(request, pageParamRequest));
        return CommonResult.success(systemGroupDataCommonPage);
    }

    /**
     * 新增组合数据详情
     * @param systemGroupDataRequest SystemFormCheckRequest 新增参数
     */
    @PreAuthorize("hasAuthority('admin:system:group:data:save')")
    @Operation(summary = "新增")
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public CommonResult<String> save(@RequestBody @Validated SystemGroupDataRequest systemGroupDataRequest) {
        if (systemGroupDataService.create(systemGroupDataRequest)) {
            return CommonResult.success();
        }
        return CommonResult.failed();
    }

    /**
     * 删除组合数据详情表
     * @param id Integer
     */
    @PreAuthorize("hasAuthority('admin:system:group:data:delete')")
    @Operation(summary = "删除")
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public CommonResult<String> delete(@RequestParam(value = "id") Integer id) {
        if (systemGroupDataService.removeById(id)) {
            return CommonResult.success();
        }
        return CommonResult.failed();
    }

    /**
     * 修改组合数据详情表
     * @param id integer id
     * @param request 修改参数
     */
    @PreAuthorize("hasAuthority('admin:system:group:data:update')")
    @Operation(summary = "修改")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public CommonResult<String> update(@RequestParam Integer id, @RequestBody @Validated SystemGroupDataRequest request) {
        if (systemGroupDataService.update(id, request)) {
            return CommonResult.success();
        }
        return CommonResult.failed();
    }

    /**
     * 组合数据详情信息
     * @param id Integer
     */
    @PreAuthorize("hasAuthority('admin:system:group:data:info')")
    @Operation(summary = "组合数据详情信息")
    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public CommonResult<SystemGroupData> info(@RequestParam(value = "id") Integer id) {
        SystemGroupData systemGroupData = systemGroupDataService.getById(id);
        return CommonResult.success(systemGroupData);
    }
}



