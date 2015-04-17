package com.zs.service.impl;

import com.zs.dao.CompanyMapper;
import com.zs.po.Company;
import com.zs.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "companyServiceImpl")
public class CompanyServiceImpl implements CompanyService {

    @Autowired
	private CompanyMapper companyDAO;

    @Override
    public int deleteByPrimaryKey(Integer companyId) {
        return companyDAO.deleteByPrimaryKey(companyId);  
    }

    @Override
    public int insert(Company record) {
        return companyDAO.insert(record);  
    }

    @Override
    public int insertSelective(Company record) {
        return companyDAO.insertSelective(record);  
    }

    @Override
    public Company selectByPrimaryKey(Integer companyId) {
        return companyDAO.selectByPrimaryKey(companyId);  
    }

    @Override
    public int updateByPrimaryKeySelective(Company record) {
        return companyDAO.updateByPrimaryKeySelective(record);  
    }

    @Override
    public int updateByPrimaryKey(Company record) {
        return companyDAO.updateByPrimaryKey(record);  
    }
}
