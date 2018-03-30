package com.dream.config;

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
 * Description:
 * User: caoxiaolin
 * Date: 2018-03-16
 * Time: 16:30
 */
@Configuration
@EnableSwagger2
public class Swagger2Configuration {

    public Docket accessToken(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())// 配置说明
                .groupName("api")// 定义组
                .select() // 选择那些路径和 api 会生成 document
                .apis(RequestHandlerSelectors.basePackage("com.dream.controller")) // 拦截的包路径
                .paths(PathSelectors.regex("/*/.*"))// 拦截的接口路径
                .build() // 创建
                ;
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()//
                .title("Spring Boot 之 Web 篇")// 标题
                .description("spring boot Web 相关内容")// 描述
                .termsOfServiceUrl("http://www.baidu.com")//
                .contact(new Contact("百度", "http://www.baidu.com", "347571938@qq.com"))// 联系
                .version("1.0")// 版本
                .build();
    }
}
