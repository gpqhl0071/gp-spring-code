package com.gp.redhorse.mapper;

import com.gp.redhorse.entity.TWithdraw;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.Map;

/**
 * <p>
 * 取款表 Mapper 接口
 * </p>
 *
 * @author peng
 * @since 2020-04-22
 */
public interface TWithdrawMapper extends BaseMapper<TWithdraw> {

  public void updateWithdrawState(Map<String, Object> map);
}
