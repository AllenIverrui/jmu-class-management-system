package com.example.jumclassmanger.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("学生")
public class Student {
    @ApiModelProperty("学号")
    private String sno;
    @ApiModelProperty("学生姓名")
    private String sname;
    @ApiModelProperty("学生性别")
    private String ssex;
    @ApiModelProperty("出生日期")
    private String sbirthday;
    @ApiModelProperty("班级id")
    private Integer classid;

//    public Student(String sno, String sname, String ssex, String sbirthday, Integer classid) {
//        this.sno = sno;
//        this.sname = sname;
//        this.ssex = ssex;
//        this.sbirthday = new Date(sbirthday);
//        this.classid = classid;
//    }
}