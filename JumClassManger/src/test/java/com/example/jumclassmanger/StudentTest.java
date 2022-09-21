package com.example.jumclassmanger;
import com.example.jumclassmanger.bean.Student;
import com.example.jumclassmanger.bean.StudentVo;
import com.example.jumclassmanger.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest(classes = JumClassMangerApplication.class)
//@RunWith(SpringRunner.class)
public class StudentTest {

    @Autowired
    StudentService studentService;
    @Test
    public void testAllStudent(){
        List<StudentVo> studentScoreCourseTeachers = studentService.selectAllStudent();
        studentScoreCourseTeachers.forEach(studentScoreCourseTeacher -> System.out.println(studentScoreCourseTeacher));
    }
    @Test
    public void testsearchStudentByName(){
        String sname="陈文文";
        Student student = studentService.searchStudentByName(sname);
        System.out.println(student);
    }
    @Test
    public void testupdateStudent(){
        studentService.updateByPrimaryKey(new Student("101","李军帅","男","1996-03-20",1));
    }
}
