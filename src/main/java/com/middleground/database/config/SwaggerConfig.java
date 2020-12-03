package com.middleground.database.config;

import com.google.common.base.Predicate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;

/**
 * Swagger配置类
 *
 * @author WuJunyi
 * @create 2020-07-14 14:53
 **/
@Configuration
@EnableSwagger2
public class SwaggerConfig extends WebMvcConfigurerAdapter {
    @Value("")
    private String pathMapping;
//    @Value("${swagger.enable}")
//    private Boolean enable;

    @Bean
    public Docket SearchBEdcApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("api")
                .genericModelSubstitutes(ResponseEntity.class)
                .useDefaultResponseMessages(true)
                .forCodeGeneration(false)
                .pathMapping(pathMapping) // base，最终调用接口后会和paths拼接在一起
                .select()
                .paths(doFilteringRules())//过滤的接口
                .build()
                .apiInfo(initApiInfo());
//                .enable(enable);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/**").addResourceLocations("/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

    private ApiInfo initApiInfo() {
        return new ApiInfoBuilder()
                .title("API")//大标题
                .description(" REST API")//详细描述
                .version("1.0")//版本
                .termsOfServiceUrl("NO terms of service")
                .contact("zhiyuan.jin@tigermedgrp.com")//作者
                .license("")
                .licenseUrl("")
                .build();
    }

    /**
     * 设置过滤规则
     * 这里的过滤规则支持正则匹配
     */
    private Predicate<String> doFilteringRules() {
        return or(regex("/databaseDo.*"),
                regex("/databaseConfig.*"),
                regex("/doctorHomePage.*")
                );
    }
}
