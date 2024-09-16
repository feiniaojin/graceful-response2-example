package com.feiniaojin.gracefuresponse.example.controller.exclude;

import com.feiniaojin.gracefuresponse.example.dto.UserInfoView;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author qinyujie
 */
@RestController
@RequestMapping("/exclude")
@Api(value = "根据Controller包路径放行的案例接口", tags = "一些用来作为示例的基础接口")
public class ExcludeController {

    @GetMapping("/test")
    public Map<String, Object> test() {
        Map<String, Object> result = new HashMap<>();
        result.put("key", "value");
        return result;
    }

    @GetMapping("/test1")
    public UserInfoView test1(){
        return UserInfoView.builder().build();
    }
}
