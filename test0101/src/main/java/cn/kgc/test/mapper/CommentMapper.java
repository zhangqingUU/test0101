package cn.kgc.test.mapper;

import cn.kgc.test.bean.Comment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CommentMapper {
    /**
     * 新增评论
     * @param comment
     * @return
     */
    int addComment(@Param("comment") Comment comment);

    List<Comment> selCommentAndUser(@Param("newsId")int newsId);

}
