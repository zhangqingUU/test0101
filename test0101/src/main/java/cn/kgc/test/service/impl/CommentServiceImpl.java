package cn.kgc.test.service.impl;

import cn.kgc.test.bean.Comment;
import cn.kgc.test.mapper.CommentMapper;
import cn.kgc.test.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    CommentMapper commentMapper;

    @Override
    public int addComment(Comment comment) {

        return commentMapper.addComment(comment);
    }
}
