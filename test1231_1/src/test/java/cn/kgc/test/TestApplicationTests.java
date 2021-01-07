package cn.kgc.test;

import cn.kgc.test.bean.UserBean;
import cn.kgc.test.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestApplicationTests {

    @Autowired
    UserService userService;

    @Test
    public void contextLoads() {
        UserBean userBean=userService.loginIn("张三","123123");
        System.out.println("id是："+userBean.getId());
    }

}
