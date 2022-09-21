package com.example.jumclassmanger.controller;

import com.example.jumclassmanger.bean.Score;
import com.example.jumclassmanger.service.ScoreService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.configurationprocessor.json.JSONException;
//import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ScoreController {
    @Autowired
    ScoreService scoreService;

    @ApiOperation("添加学生成绩")
    @PutMapping("/addScore")
    public String addScore(Score score) throws JSONException {
        System.out.println(score);
        int flag = scoreService.insert(score);
        JSONObject check = new JSONObject();
        if (flag == 1) {
            check.put("check", "成绩添加成功");
        } else {
            check.put("check", "成绩添加失败");
        }
        return check.toString();
    }

    @ApiOperation("更新学生成绩")
    @PutMapping("/updateScore")
    public String updateTeacher(Score score) throws JSONException {
        int flag = scoreService.updateByPrimaryKey(score);
        JSONObject check = new JSONObject();
        if (flag == 1) {
            check.put("check", "成绩修改成功");
        } else {
            check.put("check", "成绩修改失败");
        }
        return check.toString();

    }

    @ApiOperation("删除学生成绩")
    @DeleteMapping("/deleteScoreByKey")
    public String deleteCourseByKey(String sno ,String cno) throws JSONException {
        int flag = scoreService.deleteByPrimaryKey(sno,cno);
        JSONObject check = new JSONObject();
        if (flag == 1) {
            check.put("check", "成绩删除成功");
        } else {
            check.put("check", "成绩删除失败");
        }
        return check.toString();
    }

    @ApiOperation("获取学生成绩")
    @GetMapping("/getScoreByKey")
    public List<Score> getCourseByKey(String sno ,String cno) {
        List<Score> scores = new ArrayList<Score>();

        scores.add(scoreService.selectByPrimaryKey(sno,cno));
        return scores;
    }

    }
