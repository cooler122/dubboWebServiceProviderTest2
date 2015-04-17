package com.zs.service;

import com.zs.po.Child;
import java.util.List;

public interface ChildService {
    /**
     * 根据主键删除一个Child
     * @param childId
     * @return
     */
    int deleteByPrimaryKey(Integer childId);

    /**
     * 插入一个Child对象，必须传入所有属性值
     * @param record
     * @return
     */
    int insert(Child record);

    /**
     * 添加一个Child对象，无需传入所有属性值
     * @param record
     * @return
     */
    int insertSelective(Child record);

    /**
     * 根据主键childId查询Child
     * @param childId
     * @return
     */
    Child selectByPrimaryKey(Integer childId);

    /**
     * 加载Child，无需传入所有Child属性值
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Child record);

    /**
     * 加载Child，必须传入所有Child属性值
     * @param record
     * @return
     */
    int updateByPrimaryKey(Child record);
	
}
