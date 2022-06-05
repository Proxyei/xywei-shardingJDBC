package com.xywei.springboot.dao;

import com.xywei.springboot.config.SnowflakeService;
import com.xywei.springboot.practise.employee.dao.EmployeeDao;
import com.xywei.springboot.practise.employee.domain.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import javax.annotation.Resource;

@SpringBootTest
public class TestEmployeeDao {

    @Resource
    private EmployeeDao employeeDao;

    @Resource
    private SnowflakeService snowflakeService;

    @Test
    public void testInsert() {

        for (long i = 0; i < 10000; i++) {
            Employee employee = new Employee();
            employee.setEmployeeName("test998");
            employee.setId(snowflakeService.snowflakeId());
            System.out.println(employee);
            int count = employeeDao.insertEmployee(employee);
            Assert.isTrue(count>0, "count should not equals 0");
        }
    }

}
