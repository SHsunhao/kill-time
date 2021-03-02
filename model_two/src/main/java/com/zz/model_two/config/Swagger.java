package com.zz.model_two.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author shangdonghai
 * @Description TODO
 * @createTime 2021-03-02 16:01
 */
@Configuration
@EnableSwagger2
@ConditionalOnProperty(prefix = "msg-config", name = "swagger-open", havingValue = "true")
public class Swagger {

    @Bean
    public Docket webApiConfig(){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("webApi")
                .apiInfo(webApiInfo())
                .select()
                .build();
    }

    private ApiInfo webApiInfo(){
        return new ApiInfoBuilder()
                .title("打发时间")                       //标题
                .description("本文档主要是为了打发时间")                  //描述
                .termsOfServiceUrl("http://www.baidu.com")           //条款地址（不可见）
                .contact(new Contact("kill-time","www.baidu.com","q540662261@163.com"))                                    //作者信息
                .version("1.0")                                         //版本号
                .build();
    }

}
