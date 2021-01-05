package cn.kgc.test.mapper;

import cn.kgc.test.bean.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * 用户持久层接口
 */
@Component
public interface UserMapper {
    User selByPhone(@Param("phone") String phone);
}
