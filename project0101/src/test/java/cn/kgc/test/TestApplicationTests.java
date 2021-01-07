package cn.kgc.test;


import cn.kgc.test.bean.UserBean;
import cn.kgc.test.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestApplicationTests {

    //调用service层
    @Autowired
    UserService userService;

    @Test
    public void contextLoads() {
        UserBean userBean = userService.loginIn("李四", "678678");
        System.out.println("用户ID为："+userBean.getId());
    }

}
