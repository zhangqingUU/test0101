package cn.kgc.test.service;

import cn.kgc.test.bean.Comment;
import cn.kgc.test.util.PageRequest;
import cn.kgc.test.util.PageResult;

import java.util.Map;

public interface CommentService {
    /**
     * 添加评论
     * @param comment
     * @return
     */
    int addComment(Comment comment);


    /**
     * 评论分页
     * @param newsId
     * @param pageRequest
     * @return
     */
    PageResult selComPage(int newsId,PageRequest pageRequest);
}
