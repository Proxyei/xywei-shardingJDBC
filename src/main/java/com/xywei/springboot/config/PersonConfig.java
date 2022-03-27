package com.xywei.springboot.config;

import com.xywei.springboot.practise.employee.domain.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfig {

    @Bean(name = "emp2")
    public Employee employee() {
        System.out.println("----bean emp---");
        return new Employee();
    }

}
