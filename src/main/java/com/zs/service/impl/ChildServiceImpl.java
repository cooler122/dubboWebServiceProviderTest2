package com.zs.service.impl;

import com.zs.dao.ChildMapper;
import com.zs.po.Child;
import com.zs.service.ChildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "childServiceImpl")
public class ChildServiceImpl implements ChildService {

	@Autowired
	private ChildMapper childDAO;

    @Override
    public int deleteByPrimaryKey(Integer childId) {
        return childDAO.deleteByPrimaryKey(childId);  
    }

    @Override
    public int insert(Child record) {
        return childDAO.insert(record);  
    }

    @Override
    public int insertSelective(Child record) {
        return childDAO.insertSelective(record);  
    }

    @Override
    public Child selectByPrimaryKey(Integer childId) {
        return childDAO.selectByPrimaryKey(childId);  
    }

    @Override
    public int updateByPrimaryKeySelective(Child record) {
        return childDAO.updateByPrimaryKeySelective(record);  
    }

    @Override
    public int updateByPrimaryKey(Child record) {
        return childDAO.updateByPrimaryKey(record);  
    }
}
