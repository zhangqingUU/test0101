package cn.kgc.test.service;

import cn.kgc.test.bean.Comment;
import com.sun.corba.se.pept.encoding.OutputObject;

public interface CommentService {
    /**
     * 添加评论
     * @param comment
     * @return
     */
    int addComment(Comment comment);

    /**
     * 查询评论和作者
     * @param
     * @return
     */
    OutputObject selCommentAndUser();

}
