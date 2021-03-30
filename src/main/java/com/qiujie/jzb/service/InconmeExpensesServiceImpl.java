package com.qiujie.jzb.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.qiujie.jzb.mapper.InconmeExpensesMapper;
import com.qiujie.jzb.model.InconmeExpenses;
import com.qiujie.jzb.service.impl.InconmeExpensesService;
@Service
public class InconmeExpensesServiceImpl implements InconmeExpensesService{

    @Resource
    private InconmeExpensesMapper inconmeExpensesMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return inconmeExpensesMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(InconmeExpenses record) {
        return inconmeExpensesMapper.insert(record);
    }

    @Override
    public int insertSelective(InconmeExpenses record) {
        return inconmeExpensesMapper.insertSelective(record);
    }

    @Override
    public InconmeExpenses selectByPrimaryKey(String id) {
        return inconmeExpensesMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(InconmeExpenses record) {
        return inconmeExpensesMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(InconmeExpenses record) {
        return inconmeExpensesMapper.updateByPrimaryKey(record);
    }

}
