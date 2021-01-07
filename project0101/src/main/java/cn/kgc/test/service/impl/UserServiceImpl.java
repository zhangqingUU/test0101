package cn.kgc.test.service.impl;

import cn.kgc.test.bean.UserBean;
import cn.kgc.test.mapper.UserMapper;
import cn.kgc.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    //在service层调用dao层
    @Autowired
    UserMapper userMapper;

    @Override
    public UserBean loginIn(String name, String password) {
        return userMapper.getInfo(name,password);
    }
}
