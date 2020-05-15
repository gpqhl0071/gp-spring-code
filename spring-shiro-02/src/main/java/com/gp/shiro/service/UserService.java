package com.gp.shiro.service;

import com.gp.shiro.pojo.User;

import org.apache.ibatis.annotations.Param;

public interface UserService {
    public User queryUserByUsername(@Param("username") String username);
}
