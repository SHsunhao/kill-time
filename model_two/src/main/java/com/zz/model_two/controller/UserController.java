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
public class UserController {

    @RequestMapping("/hello")
    public String hello(){
        return "index";
    }
}
