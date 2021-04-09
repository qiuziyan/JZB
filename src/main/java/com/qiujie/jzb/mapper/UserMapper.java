package com.qiujie.jzb.mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.qiujie.jzb.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> selectByUserName(@Param("userName")String userName);

    User selectByAll(User user);








}
