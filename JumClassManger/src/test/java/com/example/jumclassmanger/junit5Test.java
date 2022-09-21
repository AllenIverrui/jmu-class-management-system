package com.example.jumclassmanger;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sound.midi.Soundbank;

@SpringBootTest
@Log4j2
public class junit5Test {
    @BeforeEach
    public void testBeforeTest(){
        System.out.println("测试就要开始了");
    }
    @Test
    public void test1(){
        System.out.println("第一个测试");
    }
    @AfterEach
    public void testAfterEach(){
        System.out.println("测试就要结束了");
    }
}
