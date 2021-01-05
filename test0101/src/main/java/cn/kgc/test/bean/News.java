package cn.kgc.test.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class News {
    private int id;
    private String title;
    private String content;
    private String author;
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    private Date createdTime;
    private int createdUserId;
}
