package com.example.jumclassmanger.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("教师")
public class Teacher {
    @ApiModelProperty("教师号")
    private String tno;

    @ApiModelProperty("教师姓名")
    private String tname;

    @ApiModelProperty("教师性别")
    private String tsex;

    @ApiModelProperty("出生年月")
    private String tbirthday;

    @ApiModelProperty("职位")
    private String prof;

    @ApiModelProperty("所在学院")
    private String depart;

}