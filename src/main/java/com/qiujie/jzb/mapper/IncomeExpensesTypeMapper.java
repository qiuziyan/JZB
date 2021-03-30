package com.qiujie.jzb.mapper;

import com.qiujie.jzb.model.IncomeExpensesType;

public interface IncomeExpensesTypeMapper {
    int deleteByPrimaryKey(String id);

    int insert(IncomeExpensesType record);

    int insertSelective(IncomeExpensesType record);

    IncomeExpensesType selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(IncomeExpensesType record);

    int updateByPrimaryKey(IncomeExpensesType record);
}