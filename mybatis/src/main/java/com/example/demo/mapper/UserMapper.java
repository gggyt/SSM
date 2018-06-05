package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import com.example.demo.entity.*;

/**
 * Created by ggg on 2018/6/5.
 */
@Mapper
public interface UserMapper {

    @Select("select * from user where u_name=#{name}")
    User all(String name);
}
