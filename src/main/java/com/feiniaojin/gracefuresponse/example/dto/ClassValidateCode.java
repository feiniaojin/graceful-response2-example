package com.feiniaojin.gracefuresponse.example.dto;

import com.feiniaojin.gracefulresponse.api.ValidationStatusCode;
import lombok.Data;

import javax.validation.constraints.NotNull;

@ValidationStatusCode(code = "1500")
@Data
public class ClassValidateCode {
    @NotNull
    private Long id;
}
