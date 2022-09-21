package com.example.jumclassmanger.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("课程类")
public class Course {
    @ApiModelProperty("课程号")
    private String cno;
    @ApiModelProperty("课程名")
    private String cname;
    @ApiModelProperty("教师号")
    private String tno;
}