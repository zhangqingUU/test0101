package cn.kgc.test.mapper;

import cn.kgc.test.bean.UserBean;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    UserBean login(@Param("name") String name, @Param("password") String password);
}
