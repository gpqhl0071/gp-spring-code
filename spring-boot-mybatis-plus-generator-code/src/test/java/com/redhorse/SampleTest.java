package com.redhorse;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateUtil;

import com.gp.QuickstartApplication;
import com.gp.redhorse.entity.TWithdraw;
import com.gp.redhorse.mapper.TUserBalanceMapper;
import com.gp.redhorse.mapper.TWithdrawMapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = QuickstartApplication.class)
public class SampleTest {

  @Autowired
  private TWithdrawMapper tWithdrawMapper;

  @Test
  public void testSelect() {
    System.out.println(("----- selectAll method test ------"));

    Map<String, Object> map = new HashMap<>();
    map.put("state", 6);
    map.put("payTime", DateUtil.format(new Date(), DatePattern.NORM_DATETIME_PATTERN));
    map.put("id", 223594);
    map.put("conditionState", 2);
    map.put("user", 395066);
    tWithdrawMapper.updateWithdrawState(map);
  }

}
