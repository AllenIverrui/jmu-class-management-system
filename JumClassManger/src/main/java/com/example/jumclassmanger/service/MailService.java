package com.example.jumclassmanger.service;

import com.example.jumclassmanger.bean.CheckNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {
    @Autowired
    private JavaMailSender javaMailSender;


    public String sendCheckNumber(String useremail){
        System.out.println("测试这里得到的邮箱"+useremail);
        CheckNumber checkNumber=new CheckNumber();
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("3037256239@qq.com");
        message.setTo(useremail);
        message.setSubject("JMU 学生管理系统");
        message.setText("你当前正在注册JMU 学生管理系统账号,验证码为:" + checkNumber.getNumber());
        javaMailSender.send(message);
        return checkNumber.getNumber();
    }

    public void sendSuccess(String usermail){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("3037256239@qq.com");
        message.setTo(usermail);
        message.setSubject("JMU 学生管理系统");
        message.setText("你的JMU学生管理系统账号注册成功,开始使用吧");
        javaMailSender.send(message);
    }

    /**
     * @param path 下载后的文件路径和名称
     * @param netAddress 文件所在网络地址
     * @功能描述 网络文件下载到服务器本地
     */


}
