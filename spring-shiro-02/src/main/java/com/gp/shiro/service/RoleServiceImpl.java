package com.gp.shiro.service;

import com.gp.shiro.dao.RoleDAO;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

import javax.annotation.Resource;

@Service
public class RoleServiceImpl implements RoleService{

    @Resource
    private RoleDAO roleDAO;

    @Transactional(propagation = Propagation.SUPPORTS)
    public Set<String> queryAllRolenameByUsername(String username) {
        return roleDAO.queryAllRolenameByUsername(username);
    }
}
