package cn.kgc.test.mapper;

import cn.kgc.test.bean.UserBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper {
    UserBean getInfo(@Param("name") String name, @Param("password") String password);
}
