package com.feiniaojin.gracefuresponse.example.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

/**
 * ResponseDto.
 *
 * @author <a href="mailto:943868899@qq.com">feiniaojin</a>
 * @date 2020/05/14
 */
@Data
@Builder
@ApiModel(description = "用户信息视图对象")
public class UserInfoView {

    @ApiModelProperty(name = "用户id")
    private Long id;

    @ApiModelProperty(name = "用户名")
    private String name;
}
