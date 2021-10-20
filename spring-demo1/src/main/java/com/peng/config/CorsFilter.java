package com.peng.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

/**
 * CORS问题spring配置的解决方案
 */
@Configuration
public class CorsFilter {

//  @Bean
  public org.springframework.web.filter.CorsFilter corsFilter1() {
    CorsConfiguration config = new CorsConfiguration();
    //允许所有域名进行跨域调用
    config.addAllowedOrigin("*");
    //允许跨越发送cookie
    config.setAllowCredentials(true);
    //放行全部原始头信息
    config.addAllowedHeader("*");
    //允许所有请求方法跨域调用
    config.addAllowedMethod("*");

    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
    source.registerCorsConfiguration("/**", config);
    return new org.springframework.web.filter.CorsFilter(source);
  }
}
