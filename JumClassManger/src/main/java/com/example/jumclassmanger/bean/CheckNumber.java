package com.example.jumclassmanger.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Random;

@Data
@Component
@ApiModel("验证码")
public class CheckNumber {
    @ApiModelProperty("验证码数字")
    private String number;
    @ApiModelProperty("验证码长度")
    private Integer length=6;

    public CheckNumber() {
        StringBuffer number = new StringBuffer();
        while (number.length() != this.length) {
            number.append(String.valueOf((int) (new Random().nextInt(10) )));
        }
        this.number= String.valueOf(number);
    }
}
