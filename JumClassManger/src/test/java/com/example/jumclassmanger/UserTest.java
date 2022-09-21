package com.example.jumclassmanger;

import com.example.jumclassmanger.bean.User;
import com.example.jumclassmanger.service.UserService;
import lombok.extern.log4j.Log4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserTest {
    @Autowired
    UserService userService;

    @Test
    public void  testInsert(){

        int flag=userService.insert(new User(null,"shi","23","123.@qq.com",1));
        if(flag==1) {
            System.out.println("注册成功");
        }else{
            System.out.println("注册失败");
        }
    }
    @Test
    public void testLetAllow(User user){
        userService.letAllow(user);
    }

}
