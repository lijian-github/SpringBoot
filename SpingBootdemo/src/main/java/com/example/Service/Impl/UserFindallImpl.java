package com.example.Service.Impl;

import com.example.Service.UserFindallDao;
import com.example.mapper.UserMapper;
import com.example.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserFindallImpl implements UserFindallDao {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> queryUserList() {
        return userMapper.queryUserList();
    }
}
