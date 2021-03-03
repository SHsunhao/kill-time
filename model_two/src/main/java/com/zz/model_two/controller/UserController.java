package com.zz.model_two.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shangdonghai
 * @Description TODO
 * @createTime 2021-03-02 17:08
 */
@RestController
@Api(tags = {"controller接口"})
public class UserController {

    @ApiOperation("con方法")
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
