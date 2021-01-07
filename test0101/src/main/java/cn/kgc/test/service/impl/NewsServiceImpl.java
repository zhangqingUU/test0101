package cn.kgc.test.service.impl;

import cn.kgc.test.bean.News;
import cn.kgc.test.mapper.NewsMapper;
import cn.kgc.test.mapper.UserMapper;
import cn.kgc.test.service.NewsService;
import cn.kgc.test.util.PageRequest;
import cn.kgc.test.util.PageResult;
import cn.kgc.test.util.PageUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {

    //调用dao层
    @Autowired
    NewsMapper newsMapper;

    @Override
    public News selNewById(int id) {
        return newsMapper.selNewById(id);
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return  PageUtils.getPageResult(pageRequest, getPageInfo(pageRequest));
    }


    /**
     * 调用分页插件完成分页
     * @param
     * @return
     */
    private PageInfo<News> getPageInfo(PageRequest pageRequest) {
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        List<News> sysMenus = newsMapper.selNewsList();
        return new PageInfo<News>(sysMenus);
    }

}
