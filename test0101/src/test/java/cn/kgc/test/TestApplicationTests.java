package cn.kgc.test;

import cn.kgc.test.bean.Comment;
import cn.kgc.test.service.CommentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestApplicationTests {

    //调用service层
    @Autowired
    CommentService commentService;

    @Test
    public void contextLoads() {
        Comment comment=new Comment(-1,1,"哈哈哈",2,new Date());
        System.out.println("结果："+ commentService.addComment(comment));
    }

}
