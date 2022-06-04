package com.xywei.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan(basePackages = "com.**.dao")
@ServletComponentScan(basePackages = {"com.xywei.springboot.practise.filter"})
public class SpringbootPractise02Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootPractise02Application.class, args);
    }

}
