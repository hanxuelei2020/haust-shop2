package com.zbkj.service.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zbkj.common.model.wechat.WechatCallback;
import org.apache.ibatis.annotations.Mapper;


/**
 * <p>
 * 微信回调表 Mapper 接口
 * </p>
 *
 * @author HZW
 * @since 2021-05-19
 */
@Mapper
public interface WechatCallbackDao extends BaseMapper<WechatCallback> {

}
