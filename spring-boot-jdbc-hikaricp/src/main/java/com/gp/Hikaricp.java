package com.gp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.gp.mapper")
public class Hikaricp {
  public static void main(String[] args) {
    SpringApplication.run(Hikaricp.class, args);
  }
}
