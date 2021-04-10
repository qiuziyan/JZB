package com.qiujie.jzb.service.impl;

import com.qiujie.jzb.model.User;
public interface UserService{


    int deleteByPrimaryKey(String id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User FindByUserName(String usreName);




}
