package com.qiujie.jzb.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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

   Double  getTotalAmountByDateAndUserId(@Param("date")String date,@Param("userId")String userId);









}
