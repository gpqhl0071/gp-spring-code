package com.gp.controller;

import cn.hutool.json.JSONUtil;

import com.gp.mapper.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
  @Autowired
  private UserMapper userMapper;

  @RequestMapping(value = "/", method = RequestMethod.GET)
  @ResponseBody
  public String test(){
    return JSONUtil.toJsonStr(userMapper.selectList(null));
  }

}
