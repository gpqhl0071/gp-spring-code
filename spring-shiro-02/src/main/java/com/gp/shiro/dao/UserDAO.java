package com.gp.shiro.dao;

import com.gp.shiro.pojo.User;

import org.apache.ibatis.annotations.Param;

public interface UserDAO {
    public User queryUserByUsername(@Param("username") String username);
}
