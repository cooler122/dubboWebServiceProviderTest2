package com.zs.service.impl;

import com.zs.dao.PositionMapper;
import com.zs.po.Position;
import com.zs.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "positionServiceImpl")
public class PositionServiceImpl implements PositionService {

    @Autowired
	private PositionMapper positionDAO;

    @Override
    public int deleteByPrimaryKey(Integer positionId) {
        return positionDAO.deleteByPrimaryKey(positionId);  
    }

    @Override
    public int insert(Position record) {
        return positionDAO.insert(record);  
    }

    @Override
    public int insertSelective(Position record) {
        return positionDAO.insertSelective(record);  
    }

    @Override
    public Position selectByPrimaryKey(Integer positionId) {
        return positionDAO.selectByPrimaryKey(positionId);  
    }

    @Override
    public int updateByPrimaryKeySelective(Position record) {
        return positionDAO.updateByPrimaryKeySelective(record);  
    }

    @Override
    public int updateByPrimaryKey(Position record) {
        return positionDAO.updateByPrimaryKey(record);  
    }
}
