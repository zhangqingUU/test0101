package cn.kgc.test.service;

import cn.kgc.test.bean.User;
import org.apache.ibatis.annotations.Param;

public interface UserService {
    User selByPhone(String phone);
}
