package cn.kgc.test.mapper;

import cn.kgc.test.bean.News;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface NewsMapper {
    /**
     * 根据id查询新闻详情
     * @param id
     * @return
     */
    News selNewsById(@Param("id") int id);

    /**
     * 分页查询新闻
     * @return
     */
    List<News> selNewsList();

}
