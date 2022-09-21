package com.example.jumclassmanger.controller;

import com.example.jumclassmanger.bean.Manger;
import com.example.jumclassmanger.bean.User;
import com.example.jumclassmanger.mapper.UserMapper;
import com.example.jumclassmanger.service.MailService;
import com.example.jumclassmanger.service.MangerService;
import com.example.jumclassmanger.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.configurationprocessor.json.JSONException;
//import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "用户管理模块")
@RestController
@CrossOrigin(origins = "*")
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    MangerService mangerService;
    @Autowired
    MailService mailService;
    @ApiOperation("获取所有用户")
    @GetMapping("/getAllUser")
    public List<User> getAllUser(){
        return userService.selectAll();
    }
    @ApiOperation("允许用户注册")
    @PutMapping("/letAllow")
    public String letAllow(User user) throws JSONException {

        mailService.sendSuccess(user.getEmail());
        int flag = userService.letAllow(user);
        JSONObject check = new JSONObject();
        if (flag == 1) {
            check.put("check", "用户允许成功");
        } else {
            check.put("check", "用户允许失败");
        }
        return check.toString();
    }
    @ApiOperation("删除用户")
    @DeleteMapping("/deleteUser")
    public String deleteUser(Integer id) throws JSONException {

        int flag = userService.deleteByPrimaryKey(id);
        JSONObject check = new JSONObject();
        if (flag == 1) {
            check.put("check", "用户添加成功");
        } else {
            check.put("check", "用户添加失败");
        }
        return check.toString();
    }
    @ApiOperation("通过id搜索用户")
    @GetMapping("/searchUser")
    public List<User> searchUser(User user){
        return userService.selectByPrimaryKey(user.getId());
    }
    @ApiOperation("更改管理员密码")
    @PutMapping("/updateAdminPassword")
        public String updatePassword(Manger manger) throws JSONException {
            JSONObject jsonObject = new JSONObject();
            int flag=mangerService.updateByPrimaryKey(manger);
            if(flag==1){
                jsonObject.put("check","修改成功");
            }else {
                jsonObject.put("check","修改失败");
            }
            return jsonObject.toString();
        }

}
