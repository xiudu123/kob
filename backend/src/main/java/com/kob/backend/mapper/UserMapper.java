package com.kob.backend.mapper;
//将 pojo 层的 class 中的操作，映射成 sql 语句;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kob.backend.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> { // 继承 Mapper 实现的 mysql 语句;

}
