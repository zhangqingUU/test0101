package cn.kgc.test.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    private int id;
    private int newsId;
    private String content;
    private int createdUserId;
    private Date createdTime;
    /*一对多，一条新闻对应多条评论*/
    private List<User> userList;
}
