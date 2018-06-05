package com.example.demo;

import com.example.demo.entity.*;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ggg on 2018/6/5.
 */
@RestController
public class test {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/")
    public void xx() {
        User users = userMapper.all("ergou");
      //  for (User u: users) {
            System.out.println("u_name:"+users.getU_name());
       // }
       // return "xx";
    }
}
