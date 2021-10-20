package com.peng.config;

import com.peng.filter.demoFilter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 初始化过滤器
 */
@Configuration
public class FilterConfig {

  /**
   * 拦截所有请求
   * @return
   */
//  @Bean
  public FilterRegistrationBean jwtFilter() {
    final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
    registrationBean.setFilter(new demoFilter());
    registrationBean.addUrlPatterns("/*");
    return registrationBean;
  }

}
