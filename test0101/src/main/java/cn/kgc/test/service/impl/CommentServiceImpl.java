package cn.kgc.test.service.impl;

import cn.kgc.test.bean.Comment;
import cn.kgc.test.bean.News;
import cn.kgc.test.mapper.CommentMapper;
import cn.kgc.test.service.CommentService;
import cn.kgc.test.util.PageRequest;
import cn.kgc.test.util.PageResult;
import cn.kgc.test.util.PageUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    CommentMapper commentMapper;

    @Override
    public int addComment(Comment comment) {
        return commentMapper.addComment(comment);
    }

    @Override
    public PageResult selComPage(int newsId, PageRequest pageRequest) {
        return PageUtils.getPageResult(pageRequest, getPageInfo(newsId,pageRequest));
    }


    /**
     * 用分页插件完成分页
     * @param newsId
     * @param pageRequest
     * @return
     */
    private PageInfo<Comment> getPageInfo(int newsId, PageRequest pageRequest) {
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        List<Comment> commentList = commentMapper.selCommentAndUser(newsId);
        return new PageInfo<Comment>(commentList);
    }
}
