package com.example.jumclassmanger.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("学生成绩消息")
public class StudentVo {
    @ApiModelProperty("课程名")
    private String cname;

    @ApiModelProperty("学号")
    private String sno;

    @ApiModelProperty("课程号")
    private String cno;

    @ApiModelProperty("成绩")
    private BigDecimal degree;

    @ApiModelProperty("学生姓名")
    private String sname;

    @ApiModelProperty("学生性别")
    private String ssex;

    @ApiModelProperty("学生出生时间")
    private Date sbirthday;

    @ApiModelProperty("班级id")
    private Integer classid;

}
