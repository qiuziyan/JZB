package com.qiujie.jzb.service.impl;

import com.qiujie.jzb.model.IncomeExpensesType;
public interface IncomeExpensesTypeService{


    int deleteByPrimaryKey(String id);

    int insert(IncomeExpensesType record);

    int insertSelective(IncomeExpensesType record);

    IncomeExpensesType selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(IncomeExpensesType record);

    int updateByPrimaryKey(IncomeExpensesType record);

}
