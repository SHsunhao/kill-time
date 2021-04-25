package com.zz.model_two.web;

import com.zz.model_two.config.ApiResult;
import com.zz.model_two.po.TUser;
import com.zz.model_two.service.UserLoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @author sunhao
 * @date 2021/3/2 19:35
 */

@Controller
@RequestMapping("/user")
@Api(tags={"用户"})
public class UserLoginController {

    @Autowired
    private UserLoginService userLoginService;

    @ApiOperation(value = "登陆")
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(){
        return "hello";
    }

    @ApiOperation(value = "新增用户")
    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public ApiResult addUser(@RequestBody TUser tUser){
        Integer integer = userLoginService.addUser(tUser);
        return ApiResult.ok(integer);
    }

    @RequestMapping(value = "/jsp", method = RequestMethod.GET)
    public ModelAndView creat() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message","Controller输出");
        modelAndView.setViewName("hello");
        return modelAndView;
    }

    @ApiOperation("测试")
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(@RequestBody Map body) {
        System.out.println(body);
        return "cccc";
    }

}
