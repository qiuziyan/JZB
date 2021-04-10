package com.qiujie.jzb.service.impl;

import com.qiujie.jzb.model.InconmeExpenses;
public interface IncomeExpensesService {


    int deleteByPrimaryKey(String id);

    int insert(InconmeExpenses record);

    int insertSelective(InconmeExpenses record);

    InconmeExpenses selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(InconmeExpenses record);

    int updateByPrimaryKey(InconmeExpenses record);

    double getSpendingByDate(String date,String userId);

}
