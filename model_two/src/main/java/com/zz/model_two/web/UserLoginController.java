package com.zz.model_two.web;

import com.zz.model_two.config.ApiResult;
import com.zz.model_two.po.TUser;
import com.zz.model_two.service.UserLoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
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

    @Autowired
    private UserLoginService userLoginService;

    @ApiOperation(value = "登陆")
    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String hello(){
        return "hello";
    }

    @ApiOperation(value = "新增用户")
    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public ApiResult addUser(@RequestBody TUser tUser){
        Integer integer = userLoginService.addUser(tUser);
        return ApiResult.ok(integer);
    }

}
