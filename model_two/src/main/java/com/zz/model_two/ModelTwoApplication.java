package com.zz.model_two;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class ModelTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModelTwoApplication.class, args);
    }

//    @RequestMapping(value = {"","/index"})
//    public String index(Model model){
//        model.addAttribute("msg","谢谢");
//        return "index";
//    }
}
