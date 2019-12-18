package com.example.Controller;

import com.example.Service.UserFindallDao;
import com.example.mapper.UserMapper;
import com.example.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MapperController {
    @Autowired
    private UserFindallDao userq;
    @RequestMapping("/queryUser")
    @ResponseBody
    public List<User> queryUser(){
        List<User> users = userq.queryUserList();
        return users;
    }
}
