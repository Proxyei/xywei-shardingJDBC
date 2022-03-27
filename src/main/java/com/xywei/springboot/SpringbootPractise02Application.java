package com.xywei.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.**.dao")
public class SpringbootPractise02Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootPractise02Application.class, args);
    }

}
