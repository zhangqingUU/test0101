package cn.kgc.test.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NewsModel {
    private String title;
    private String content;
    private String author;
    private Date createdTime;
}
