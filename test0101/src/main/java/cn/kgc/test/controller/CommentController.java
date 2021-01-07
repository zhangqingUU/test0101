package cn.kgc.test.controller;

import cn.kgc.test.bean.Comment;
import cn.kgc.test.service.CommentService;
import cn.kgc.test.util.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    CommentService commentService;

    //增
    @RequestMapping(value = "/addComment",method = RequestMethod.POST)
    @ResponseBody
    public boolean addComment(Comment comment) {
        if (commentService.addComment(comment) > 0) {
           return true;
        } else {
            return false;
        }
    }

    @RequestMapping(value = "/findPage",method = RequestMethod.POST)
    @ResponseBody
    public Object findPage(int newsId,PageRequest pageQuery) {
        System.out.println("进来了！！！");
        return commentService.selComPage(newsId,pageQuery);
    }

}
