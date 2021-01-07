package cn.kgc.test.service.impl;

import cn.kgc.test.bean.UserBean;
import cn.kgc.test.mapper.UserMapper;
import cn.kgc.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    //将dao注入service
    @Autowired
    private UserMapper userMapper;
    @Override
    public UserBean loginIn(String name, String password) {
        return userMapper.getInfo(name,password);
    }
}
