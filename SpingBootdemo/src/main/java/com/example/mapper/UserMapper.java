package com.example.mapper;

import com.example.po.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {
    public List<User> queryUserList();
}
