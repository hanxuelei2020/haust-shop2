package com.zbkj.service.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zbkj.common.model.user.User;
import com.zbkj.common.response.UserSpreadPeopleItemResponse;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;
import java.util.Map;

/**
 * 用户表 Mapper 接口
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
@Mapper
public interface UserDao extends BaseMapper<User> {

    List<UserSpreadPeopleItemResponse> getSpreadPeopleList(Map<String, Object> map);

    List<User> findAdminList(Map<String, Object> map);
}
