package com.xywei.springboot.practise.employee.dao;

import com.xywei.springboot.practise.employee.domain.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeDao {

	List<Employee> getAllEmployee();
	List<Employee> getEmployees();
	int insertEmployee( @Param("entity") Employee employee);
}
