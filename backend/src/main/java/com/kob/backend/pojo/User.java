package com.kob.backend.pojo;
// 将数据库中的表对应成 Java 中的 Class;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // 自动实现一些常用的函数;
@NoArgsConstructor // 无参构造;
@AllArgsConstructor // 有参构造;
public class User {
    private Integer id;
    private String username;
    private String password;
}
