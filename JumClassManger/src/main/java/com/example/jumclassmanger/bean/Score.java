package com.example.jumclassmanger.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("成绩")
public class Score {
    @ApiModelProperty("学号")
    private String sno;
    @ApiModelProperty("课程号")
    private String cno;
    @ApiModelProperty("分数")
    private BigDecimal degree;


}