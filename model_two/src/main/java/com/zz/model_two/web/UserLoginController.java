package com.zz.model_two.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sunhao
 * @date 2021/3/2 19:35
 */

@RestController
@RequestMapping("/user")
@Api(tags={"用户"})
public class UserLoginController {

    @ApiOperation(value = "登陆")
    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String hello(){
        return "hello";
    }
}
