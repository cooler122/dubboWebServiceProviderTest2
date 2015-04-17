package com.zs.dao;

import com.zs.po.Child;

public interface ChildMapper {
    int deleteByPrimaryKey(Integer childId);

    int insert(Child record);

    int insertSelective(Child record);

    Child selectByPrimaryKey(Integer childId);

    int updateByPrimaryKeySelective(Child record);

    int updateByPrimaryKey(Child record);
}