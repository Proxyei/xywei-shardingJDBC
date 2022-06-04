package com.xywei.springboot.config;

import com.xywei.springboot.Man;
import com.xywei.springboot.practise.employee.domain.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(Man.class)
public class PersonConfig {

    @Bean(name = "emp2", initMethod = "init")
    public Employee employee() {
        System.out.println("----bean emp---");
        return new Employee(2022, 2022, "2022Name");
    }

}
