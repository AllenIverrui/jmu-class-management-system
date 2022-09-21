package com.example.jumclassmanger.controller;

import com.example.jumclassmanger.bean.Manger;
import com.example.jumclassmanger.bean.User;
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

@RestController
@CrossOrigin(origins = "*")
@Api(tags = "登录管理部分")
public class LoginController {
    @Autowired
    MangerService mangerService;
    @Autowired
    UserService userService;

    @ApiOperation("管理员登录检查")
    @PostMapping("/loginCheckForadmin")
    public String loginCheckAdmin(Manger manger) throws JSONException {
        System.out.println(manger);
        JSONObject check = new JSONObject();
        if(mangerService.checkLogin(manger)==null){
           check.put("check","登录失败");
        }else{
            check.put("check","登录成功");
        }
        return check.toString();
    }

    @ApiOperation("普通用户登录检查")
    @GetMapping("/loginCheck")
    public String loginCheck(User user) throws JSONException {
        JSONObject check = new JSONObject();
        if(userService.checkLogin(user)==null){
            check.put("check","登录失败");
        }else{
            check.put("check","登录成功");
            check.put("userid",userService.checkLogin(user).getId());
            System.out.println(user.getId());
        }
        return check.toString();
    }

    @ApiOperation("用户注册")
    @PostMapping("/register")
    public String register(User user) throws JSONException {
        JSONObject jsonObject = new JSONObject();
        int flag=userService.insert(user);
        if(flag==1){
            jsonObject.put("check","注册成功");
        }else {
            jsonObject.put("check","注册失败");
        }
        return jsonObject.toString();
    }

    @ApiOperation("更新密码")
    @PutMapping("/updatePassword")
    public String updatePassword(User user) throws JSONException {
        JSONObject jsonObject = new JSONObject();
        int flag=userService.updatePassword(user);
        if(flag==1){
            jsonObject.put("check","修改成功");
        }else {
            jsonObject.put("check","修改失败");
        }
        return jsonObject.toString();
    }
}
