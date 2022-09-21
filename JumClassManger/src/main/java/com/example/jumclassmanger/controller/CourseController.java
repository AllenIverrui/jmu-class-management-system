package com.example.jumclassmanger.controller;

import com.example.jumclassmanger.bean.Course;
import com.example.jumclassmanger.bean.Student;
import com.example.jumclassmanger.bean.Teacher;
import com.example.jumclassmanger.service.CourseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.configurationprocessor.json.JSONException;
//import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.CheckedOutputStream;

@RestController
@CrossOrigin(origins = "*")
@Api(tags = "课程管理部分")
public class CourseController {
    @Autowired
    CourseService courseService;

    @ApiOperation("获取所有课程")
    @GetMapping("/getAllCourse")
    public List<Course> getAllCourse() {
        return courseService.selectAll();
    }

    @ApiOperation("通过课程号获取课程")
    @GetMapping("/getCourseByCno")
    public List<Course> getCourseByCno(String cno) {

        List<Course> courses = new ArrayList<Course>();

        courses.add(courseService.selectByPrimaryKey(cno));

        return courses;


    }

    @ApiOperation("添加课程")
    @PutMapping("/addCourse")
    public String addStudent(Course course) throws JSONException {
        int flag = courseService.insert(course);
        org.json.JSONObject check = new org.json.JSONObject();
        if (flag == 1) {
            check.put("check", "课程添加成功");
        } else {
            check.put("check", "课程添加失败");
        }
        return check.toString();
    }

    @ApiOperation("更新课程")
    @PutMapping("/updateCourse")
    public String updateCourse(Course course) throws JSONException {
        int flag =  courseService.updateByPrimaryKey(course);
        org.json.JSONObject check = new org.json.JSONObject();
        if (flag == 1) {
            check.put("check", "课程修改成功");
        } else {
            check.put("check", "课程修改失败");
        }
        return check.toString();
    }
    @ApiOperation("删除课程")
    @DeleteMapping("/deleteCourseByCno")
    public String deleteCourseBySno(String cno) throws JSONException {

        int flag = courseService.deleteByPrimaryKey(cno);
        JSONObject check = new JSONObject();
        if (flag == 1) {
            check.put("check", "课程删除成功");
        } else {
            check.put("check", "课程删除失败");
        }
        return check.toString();
    }
}
