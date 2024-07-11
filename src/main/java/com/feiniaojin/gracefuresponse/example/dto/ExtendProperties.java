package com.feiniaojin.gracefuresponse.example.dto;

import com.feiniaojin.gracefulresponse.api.ValidationStatusCode;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@ValidationStatusCode(code = "456")
public class ExtendProperties {
    @NotNull(message = "扩展属性property1不能为空")
//    @ValidationStatusCode(code = "123")
    private String property1;
}
