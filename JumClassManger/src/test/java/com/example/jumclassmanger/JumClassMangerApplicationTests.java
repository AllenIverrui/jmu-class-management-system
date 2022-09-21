package com.example.jumclassmanger;

import com.example.jumclassmanger.bean.Manger;
import com.example.jumclassmanger.mapper.MangerMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest(classes = JumClassMangerApplication.class)
@RunWith(SpringRunner.class)
class JumClassMangerApplicationTests {

    @Autowired
    MangerMapper mangerMapper;
    @Test
    void contextLoads() {
    }
    @Test
    public void test1(){
        List<Manger> mangers = mangerMapper.selectAll();
        mangers.forEach(manger -> System.out.println(manger));
    }
    @Test
    public void testCheckLogin(){
        Manger manger1 = mangerMapper.checkLogin(new Manger("Allen", "1"));
        if(manger1!=null) {
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }
    }

}
