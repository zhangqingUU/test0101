package cn.kgc.test.service.impl;

import cn.kgc.test.bean.UserBean;
import cn.kgc.test.mapper.UserMapper;
import cn.kgc.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service//业务处理层
public class UserServiceImpl implements UserService {
    //在service注入dao
    @Autowired
    private UserMapper userMapper;
    @Override
    public UserBean loginIn(String name, String password) {

        return userMapper.getInfo(name,password);
    }
}
