package com.example.Controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component//只有这个组件是容器中的组件，才能使用容器提供的@ConfigurationProperties功能
@ConfigurationProperties(prefix = "person")
public class HelloController {
    private String name;
    private Integer age;
    @RequestMapping("/hello")
    public String hello(){

        return "Hello SpringBoot name:"+name+" age:"+age;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
