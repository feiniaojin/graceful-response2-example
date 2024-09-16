package com.feiniaojin.gracefuresponse.example.dto;

import com.feiniaojin.gracefulresponse.api.ValidationStatusCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;

/**
 * 请求的DTO.
 *
 * @author qinyujie
 */
@Data
@ApiModel(description = "用户信息Query查询对象")
public class UserInfoQuery {

    @NotNull(message = "userId is null !")
    @ApiModelProperty(name = "用户Id")
    private Long userId;

    @NotNull(message = "userName is null !")
    @Length(min = 6, max = 12)
    @ValidationStatusCode(code = "520")
    @ApiModelProperty(name = "用户名")
    private String userName;

    @NotNull(message = "age is null !")
    @Range(min = 18, max = 50, message = "年龄必须在18～50之间")
    private Integer age;

    @NotNull
    private Integer gender;
}
