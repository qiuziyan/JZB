package com.qiujie.jzb.mapper;
import org.apache.ibatis.annotations.Param;

import com.qiujie.jzb.model.Acc;

public interface AccMapper {
    int insert(Acc record);

    int insertSelective(Acc record);

    Acc findAllById(@Param("id")String id);

}