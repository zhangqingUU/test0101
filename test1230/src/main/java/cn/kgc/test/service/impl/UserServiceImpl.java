package cn.kgc.test.service.impl;

import cn.kgc.test.bean.UserBean;
import cn.kgc.test.mapper.UserMapper;
import cn.kgc.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service    //用在类上面，标记当前类是一个service类，加上该注解会将当前类自动注入到spring容器中，不需要再在applicationContext.xml文件定义bean了。
public class UserServiceImpl implements UserService {
    //将DAO注入service
    @Autowired
    private UserMapper userMapper;
    @Override
    public UserBean loginIn(String name, String password) {
        return userMapper.login(name,password);
    }
}
