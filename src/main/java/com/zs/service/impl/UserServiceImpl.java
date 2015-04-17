package com.zs.service.impl;

import com.zs.dao.UserMapper;
import com.zs.po.User;
import com.zs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "userServiceImpl")
public class UserServiceImpl implements UserService {

    @Autowired
	private UserMapper userDAO;

    @Override
    public int deleteByPrimaryKey(Integer userId) {
        return userDAO.deleteByPrimaryKey(userId);  
    }

    @Override
    public int insert(User record) {
        return userDAO.insert(record);  
    }

    @Override
    public int insertSelective(User record) {
        return userDAO.insertSelective(record);  
    }

    @Override
    public User selectByPrimaryKey(Integer userId) {
        return userDAO.selectByPrimaryKey(userId);  
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return userDAO.updateByPrimaryKeySelective(record);  
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(User record) {
        return userDAO.updateByPrimaryKeyWithBLOBs(record);  
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return userDAO.updateByPrimaryKey(record);  
    }
}
