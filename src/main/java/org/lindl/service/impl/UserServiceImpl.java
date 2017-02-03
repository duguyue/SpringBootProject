package org.lindl.service.impl;

import com.alibaba.druid.pool.DruidDataSource;
import org.lindl.entity.User;
import org.lindl.mapper.UserMapper;
import org.lindl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by lin on 2017/2/1.
 */
@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;

    @Override
    public User getUserById(int id) {
        return userMapper.findById(id);
    }
}
