package cn.kgc.test.controller;

import cn.kgc.test.bean.News;
import cn.kgc.test.bean.NewsModel;
import cn.kgc.test.mapper.NewsMapper;
import cn.kgc.test.service.NewsService;
import cn.kgc.test.util.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/news")
@Controller
public class NewsController {

    //调用service层
    @Autowired
    NewsService newsService;

    @ResponseBody
    @RequestMapping(value = "/newsDetail",method = RequestMethod.POST)
    public NewsModel newsDetail(int id) {
        return newsService.selNewsById(id);
    }


    @RequestMapping(value = "/findPage",method = RequestMethod.POST)
    @ResponseBody
    public Object findPage(PageRequest pageQuery) {
        return newsService.findPage(pageQuery);
    }
}
