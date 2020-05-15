package com.gp.shiro.service;

import com.gp.shiro.dao.UserDAO;
import com.gp.shiro.pojo.User;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService{

    //@Resource(name="userDAO2")
    @Resource
    private UserDAO userDAO;
    @Transactional(propagation = Propagation.SUPPORTS)
    public User queryUserByUsername(String username) {
        return userDAO.queryUserByUsername(username);
    }
}
