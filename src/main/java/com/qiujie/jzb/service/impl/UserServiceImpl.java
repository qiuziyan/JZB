package com.qiujie.jzb.service.impl;

import com.qiujie.jzb.model.User;
import com.qiujie.jzb.mapper.UserMapper;
import com.qiujie.jzb.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author astupidcoder
 * @since 2021-03-17
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
