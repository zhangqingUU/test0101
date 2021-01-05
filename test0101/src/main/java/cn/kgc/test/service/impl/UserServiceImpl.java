package cn.kgc.test.service.impl;

import cn.kgc.test.bean.User;
import cn.kgc.test.mapper.UserMapper;
import cn.kgc.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    //调用DAO层
    @Autowired
    UserMapper userMapper;

    @Override
    public User selByPhone(String phone) {
        return userMapper.selByPhone(phone);
    }
}
