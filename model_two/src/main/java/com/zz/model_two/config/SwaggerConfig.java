package com.zz.model_two.config;

import io.swagger.annotations.Api;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author shangdonghai
 * @Description TODO
 * @createTime 2021-03-02 17:05
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Kill Time")
                .description("🐟KILL TIME相关接口的文档🐟")
                .termsOfServiceUrl("http://www.baidu.com")
                .version("1.0")
                .build();
    }

   /* @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)   //主要api配置机制初始化为swagger规范2.0
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.itguang.springbootswaggerdemo1.web"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring Boot中使用Swagger2构建RESTful API")  // 标题
                .description("rest api 文档构建利器")  // 描述信息
                .termsOfServiceUrl("http://blog.csdn.net/itguangit")  //服务网址
                .contact(new Contact("打发时间","www.baidu.com","q540662261@163.com"))  // 联系方式
                .version("1.0") //版本号
                .build();
    }*/
}
