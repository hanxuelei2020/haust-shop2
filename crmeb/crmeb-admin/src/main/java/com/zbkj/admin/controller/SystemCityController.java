package com.zbkj.admin.controller;

import com.zbkj.common.model.system.SystemCity;
import com.zbkj.common.request.SystemCityRequest;
import com.zbkj.common.request.SystemCitySearchRequest;
import com.zbkj.common.response.CommonResult;
import com.zbkj.common.vo.SystemCityTreeVo;
import com.zbkj.service.service.SystemCityService;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * 城市表 前端控制器
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
@RequestMapping("api/admin/system/city")
@Tag(name ="城市管理")
public class SystemCityController {

    @Autowired
    private SystemCityService systemCityService;

    /**
     * 分页城市列表
     * @param request 搜索条件
     */
    @PreAuthorize("hasAuthority('admin:system:city:list')")
    @Operation(summary = "分页城市列表")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public CommonResult<Object> getList(@Validated SystemCitySearchRequest request) {
        return CommonResult.success(systemCityService.getList(request));
    }

    /**
     * 修改城市
     * @param id 城市id
     * @param request 修改参数
     */
    @PreAuthorize("hasAuthority('admin:system:city:update')")
    @Operation(summary = "修改")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public CommonResult<String> update(@RequestParam Integer id, @Validated SystemCityRequest request) {
        if (systemCityService.update(id, request)) {
            return CommonResult.success();
        }
        return CommonResult.failed();
    }

    /**
     * 修改状态
     * @param id 城市id
     * @param status 状态
     */
    @PreAuthorize("hasAuthority('admin:system:city:update:status')")
    @Operation(summary = "修改状态")
    @RequestMapping(value = "/update/status", method = RequestMethod.POST)
    public CommonResult<String> updateStatus(@RequestParam Integer id, @RequestParam Boolean status) {
        if (systemCityService.updateStatus(id, status)) {
            return CommonResult.success();
        }
        return CommonResult.failed();
    }

    /**
     * 城市详情
     * @param id 城市id
     */
    @PreAuthorize("hasAuthority('admin:system:city:info')")
    @Operation(summary = "城市详情")
    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public CommonResult<SystemCity> info(@RequestParam(value = "id") Integer id) {
        return CommonResult.success(systemCityService.getById(id));
    }

    /**
     * 获取tree结构的列表
     */
    @PreAuthorize("hasAuthority('admin:system:city:list:tree')")
    @Operation(summary = "获取tree结构的列表")
    @RequestMapping(value = "/list/tree", method = RequestMethod.GET)
    public CommonResult<List<SystemCityTreeVo>> getListTree() {
        return CommonResult.success(systemCityService.getListTree());
    }
}



