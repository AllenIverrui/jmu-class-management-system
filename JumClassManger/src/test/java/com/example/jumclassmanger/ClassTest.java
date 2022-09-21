package com.example.jumclassmanger;

import com.example.jumclassmanger.bean.Classes;
import com.example.jumclassmanger.service.ClassesService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sound.midi.Soundbank;
import java.util.List;

@SpringBootTest
public class ClassTest {
    @Autowired
    ClassesService classesService;
    @Test
    public void testInsertClass(){
        Classes classes = new Classes(null,"三班",1);
        int insert = classesService.insert(classes);
        if(insert==1) System.out.println("插入班级成功");
        else System.out.println("插入班级失败");
    }
    @Test
    public void testSelectAllClasser(){
        List<Classes> classes = classesService.selectAll();
        classes.forEach(classes1 -> System.out.println(classes1));
    }
    @Test
    public void testSearchByName(){
        String name ="三班";
        Classes classes = classesService.searchClassesByName(name);
        System.out.println(classes);
    }
}
