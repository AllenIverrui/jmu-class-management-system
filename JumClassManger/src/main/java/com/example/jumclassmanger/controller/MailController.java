package com.example.jumclassmanger.controller;

import com.example.jumclassmanger.service.MailService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@RestController
@CrossOrigin(origins = "*")
@Api(tags = "其余接口")
public class MailController {

    @Autowired
    MailService mailService;

    @ApiOperation("邮件发送")
    @GetMapping("/send")
    private String send(String reciver) {
//        reciver="1373716338@qq.com";
        String checkNumber = mailService.sendCheckNumber(reciver);
//        return checkNumber;
        return "{\"CheckNumber\":"+checkNumber+"}";
    }

    @ApiOperation("安卓app下载")
    @GetMapping("/DownloadAppforAndroid")
    public void getFile(HttpServletResponse response) throws Exception{
        File readFile = new File("C:/Users/Administrator/Desktop/Jmu/jum班级管理系统.apk");
        //字节流-用于读文件  这里只是demo用的非缓冲流。实际项目可以用BufferedInputStream。 此功能是读取图片，所以用的字节流。如果是文本的话可以用字符流效率高，具体类看下面注释
        //        BufferedReader bufferedReader = new BufferedReader(new FileReader(readFile));//字符流
        FileInputStream fileInputStream = new FileInputStream(readFile);//字节流
        //设置文件下载方式
        response.setHeader("content-disposition","attachment;filename="+ URLEncoder.encode("jum班级管理系统.apk","utf-8"));
        //获取servlet响应输出字节流
        //        PrintWriter writer = response.getWriter();//字符流
        ServletOutputStream outputStream = response.getOutputStream(); //字节流

        //流数据交换，每次交换10k数据大小 （1024k = 1m）
        byte[] bytes = new byte[1024*10];
        int read;
        do {
            read = fileInputStream.read(bytes);
            outputStream.write(bytes,0,read);
        }while (-1 != read);

        //关闭资源
        IOUtils.closeQuietly(fileInputStream);
        IOUtils.closeQuietly(outputStream);
    }

}