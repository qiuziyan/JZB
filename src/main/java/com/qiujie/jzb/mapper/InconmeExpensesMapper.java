package com.qiujie.jzb.mapper;

import com.qiujie.jzb.model.InconmeExpenses;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface InconmeExpensesMapper {
    int deleteByPrimaryKey(String id);

    int insert(InconmeExpenses record);

    int insertSelective(InconmeExpenses record);

    InconmeExpenses selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(InconmeExpenses record);

    int updateByPrimaryKey(InconmeExpenses record);
}
