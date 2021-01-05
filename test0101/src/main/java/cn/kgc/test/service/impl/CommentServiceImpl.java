package cn.kgc.test.service.impl;

import cn.kgc.test.bean.Comment;
import cn.kgc.test.mapper.CommentMapper;
import cn.kgc.test.service.CommentService;
import com.sun.corba.se.pept.encoding.OutputObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    CommentMapper commentMapper;

    @Override
    public int addComment(Comment comment) {

        return commentMapper.addComment(comment);
    }

    @Override
    public OutputObject selCommentAndUser() {
        List<Comment> list = commentMapper.selCommentAndUser();
       // return new OutputObject(StatusCodeEnum.SUCCESS.getCode(), StatusCodeEnum.SUCCESS.getMessage(), list);
        return null;
    }
}
