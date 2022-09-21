package com.example.jumclassmanger.controller;

import com.example.jumclassmanger.bean.Classes;
import com.example.jumclassmanger.bean.Course;
import com.example.jumclassmanger.service.ClassesService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.configurationprocessor.json.JSONException;
import org.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@Api(tags = "班级管理")
public class ClassesController {
    @Autowired
    ClassesService classesService;

    @ApiOperation("更新班级")
    @PutMapping("/updateClass")
    public String updateClass(Classes classes) throws JSONException {
        org.json.JSONObject check = new org.json.JSONObject();
        int flag =  classesService.updateByPrimaryKey(classes);
        if (flag == 1) {
            check.put("check", "课程修改成功");
        } else {
            check.put("check", "课程修改失败");
        }
        return check.toString();
    }

    @ApiOperation("添加班级")
    @PostMapping("/addClass")
    public String addClass(Classes classes) throws JSONException {
        org.json.JSONObject check = new org.json.JSONObject();
        if (classesService.insert(classes) == 1) {
            check.put("check", "添加班级成功");

        } else {
            check.put("check", "添加班级失败");
        }
        return check.toString();
    }

    @ApiOperation("获取所有班级")
    @PostMapping("/getAllClasses")
    public List<Classes> getAllClasses() {
        List<Classes> classes = classesService.selectAll();
        return classes;
    }

    @ApiOperation("通过班级号删除班级")
    @DeleteMapping("/deleteClassById")
    public String deleteClassById(Integer id) throws JSONException {
        org.json.JSONObject check = new org.json.JSONObject();
        if( classesService.deleteByPrimaryKey(id)==1) {
            check.put("check","班级删除成功");
        }else {
            check.put("check","班级删除失败");
        };
        return check.toString();
    }

    @ApiOperation("通过班级号查询班级")
    @GetMapping("/selectClassById")
    public List<Classes> selectClassById(Integer id) {
        List<Classes> classes = new ArrayList<Classes>();

        classes.add(classesService.selectByPrimaryKey(id));

        return classes;

    }

    @ApiOperation("通过班级名查询班级")
    @PostMapping("/searchClassByName")
    public Classes searchClassByName(String name) {
        return classesService.searchClassesByName(name);
    }
}
