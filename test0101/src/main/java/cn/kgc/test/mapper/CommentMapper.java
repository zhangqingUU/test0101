package cn.kgc.test.mapper;

import cn.kgc.test.bean.Comment;
import cn.kgc.test.bean.News;
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
    int addComment(Comment comment);



    /**
     * 查询所有的新闻和评论，（分页）查看评论功能，包括：评论时间、评论人昵称、评论内容，按照时间倒序分页展示
     * @return
     */
    List<Comment> selCommentAndUser();

}
