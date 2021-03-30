package com.qiujie.jzb.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.qiujie.jzb.mapper.IncomeExpensesTypeMapper;
import com.qiujie.jzb.model.IncomeExpensesType;
import com.qiujie.jzb.service.impl.IncomeExpensesTypeService;
@Service
public class IncomeExpensesTypeServiceImpl implements IncomeExpensesTypeService{

    @Resource
    private IncomeExpensesTypeMapper incomeExpensesTypeMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return incomeExpensesTypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(IncomeExpensesType record) {
        return incomeExpensesTypeMapper.insert(record);
    }

    @Override
    public int insertSelective(IncomeExpensesType record) {
        return incomeExpensesTypeMapper.insertSelective(record);
    }

    @Override
    public IncomeExpensesType selectByPrimaryKey(String id) {
        return incomeExpensesTypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(IncomeExpensesType record) {
        return incomeExpensesTypeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(IncomeExpensesType record) {
        return incomeExpensesTypeMapper.updateByPrimaryKey(record);
    }

}
