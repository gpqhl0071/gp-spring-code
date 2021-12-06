package com.example.jdbctemplate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class JdbctemplateApplicationTests {
  @Autowired
  private JdbcTemplate jdbcTemplate;

  @Test
  public void test() throws Exception {
    String sql = "select * from t_user where phone = 15600000002";

    Map<String, Object> map = jdbcTemplate.queryForMap(sql);

    System.out.println(map.toString());
  }

}
