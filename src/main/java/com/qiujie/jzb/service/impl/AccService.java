package com.qiujie.jzb.service.impl;

import com.qiujie.jzb.model.Acc;
public interface AccService{


    int insert(Acc record);

    int insertSelective(Acc record);

    Acc findAccByID(String ID);


}
