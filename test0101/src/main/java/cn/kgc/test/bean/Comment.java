package cn.kgc.test.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    private int id;
    private int newsId;
    private String content;
    private int createdUserId;
    private Date createdTime;
    //用户类
    private User user;
    //新闻类
    private News news;
}
