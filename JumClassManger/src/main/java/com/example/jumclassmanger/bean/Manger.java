package com.example.jumclassmanger.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("管理员")
public class Manger {
    @ApiModelProperty("管理员名")
    private String name;
    @ApiModelProperty("管理员密码")
    private String password;

}