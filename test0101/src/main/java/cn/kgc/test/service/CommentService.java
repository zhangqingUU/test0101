package cn.kgc.test.service;

import cn.kgc.test.bean.Comment;

public interface CommentService {
    /**
     * 添加评论
     * @param comment
     * @return
     */
    int addComment(Comment comment);
}
