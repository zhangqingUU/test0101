package cn.kgc.test.mapper;

import cn.kgc.test.bean.Comment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface CommentMapper {
    /**
     * 新增评论
     * @param comment
     * @return
     */
    int addComment(Comment comment);
}
