package cn.kgc.test.controller;

import cn.kgc.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    //调用service
    @Autowired
    UserService userService;

    @RequestMapping(value = "/loginIn",method = RequestMethod.POST)
    @ResponseBody
    public boolean loginIn(String phone) {
        if (userService.selByPhone(phone) != null) {
            return true;//登录成功！
        }
        return false;//登录失败！
    }
}
