package cn.kgc.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.kgc.test.mapper")//项目启动类要添加注解@MapperScan项目启动时扫描mapper接口，否则会报错找不到mapper文件：
public class TestApplication {

    public static void main(String[] args) {

        SpringApplication.run(TestApplication.class, args);
    }

}
