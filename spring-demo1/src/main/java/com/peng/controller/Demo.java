package com.peng.controller;

import cn.hutool.http.HttpUtil;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class Demo {

  @RequestMapping(value = "demo", method = RequestMethod.GET)
  public String getStr(HttpServletRequest request, HttpServletResponse response) {
    Map<String, Object> paramMap = new HashMap<String, Object>();
    paramMap.put("scur", "USD"); // 原币种编号
    paramMap.put("tcur", "CNY"); // 目标币种编号
    paramMap.put("appkey", "52180");// 使用API的唯一凭证
    paramMap.put("sign", "1606da3e6d31ff494f07fcf8a9557ca3"); // md5后的32位密文,登陆用
    paramMap.put("format", "json"); // 返回数据格式
    paramMap.put("jsoncallback", ""); // js跨域使用jsonp时可使用此参数
    String message = HttpUtil.post("https://sapi.k780.com?app=finance.rate", paramMap);

    return message;
  }
}
