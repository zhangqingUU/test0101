package cn.kgc.test.service;

import cn.kgc.test.bean.UserBean;

public interface UserService {
    UserBean loginIn(String name,String password);
}
