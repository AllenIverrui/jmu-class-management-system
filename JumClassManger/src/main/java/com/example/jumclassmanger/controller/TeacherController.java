package com.example.jumclassmanger.controller;

import com.example.jumclassmanger.bean.Teacher;
import com.example.jumclassmanger.service.TeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.configurationprocessor.json.JSONException;
//import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@Api(tags = "教师管理部分")
@CrossOrigin(origins = "*")
public class TeacherController {
    @Autowired
    TeacherService teacherService;

    @ApiOperation("获取所有教师")
    @GetMapping("/getAllTeacher")
    public List<Teacher> getAllTeacher() {
        return teacherService.selectAll();
    }

    @ApiOperation("添加教师")
    @PutMapping("/addTeacher")
    public String addTeacher(Teacher teacher) throws JSONException {
        System.out.println(teacher.getTbirthday());
        int flag = teacherService.insert(teacher);
        JSONObject check = new JSONObject();
        if (flag == 1) {
            check.put("check", "教师添加成功");
        } else {
            check.put("check", "教师添加失败");
        }
        return check.toString();
    }

    @ApiOperation("更新教师消息")
    @PutMapping("/updateTeacher")
    public String updateTeacher(Teacher teacher) throws JSONException {
        int flag = teacherService.updateByPrimaryKey(teacher);
        JSONObject check = new JSONObject();
        if (flag == 1) {
            check.put("check", "教师修改成功");
        } else {
            check.put("check", "教师修改失败");
        }
        return check.toString();

    }

    @ApiOperation("通过教师id删除教师")
    @DeleteMapping("/deleteTeacherByTno")
    public String deleteTeacher(String tno) throws JSONException {
        int flag = teacherService.deleteByPrimaryKey(tno);
        JSONObject check = new JSONObject();
        if (flag == 1) {
            check.put("check", "教师删除成功");
        } else {
            check.put("check", "教师删除失败");
        }
        return check.toString();
    }

    @ApiOperation("通过教师id查询教师")
    @GetMapping("/getTeacherById")
    public List<Teacher> getTeacherById(String tno) {
        List<Teacher> teachers = new ArrayList<Teacher>();

        teachers.add(teacherService.selectByPrimaryKey(tno));
        return teachers;
    }
}
