package com.gp.redhorse.mapper;

import com.gp.redhorse.entity.TUserBalance;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.Map;

/**
 * <p>
 * 用户余额表 Mapper 接口
 * </p>
 *
 * @author peng
 * @since 2020-04-22
 */
public interface TUserBalanceMapper extends BaseMapper<TUserBalance> {

  public void updateTollAndFree(Map<String, Object> map);
}
