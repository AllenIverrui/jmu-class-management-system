package com.example.jumclassmanger.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("班级")
public class Classes {
    @ApiModelProperty("班级号")
    private Integer id;
    @ApiModelProperty("班级名")
    private String name;
    @ApiModelProperty("创建者id")
    private Integer userid;

}