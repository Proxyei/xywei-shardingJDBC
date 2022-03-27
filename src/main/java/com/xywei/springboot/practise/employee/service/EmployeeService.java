package com.xywei.springboot.practise.employee.service;

import com.xywei.springboot.practise.employee.domain.Employee;

import java.util.List;

public interface EmployeeService {
	List<Employee> getAllEmployee() throws Exception;
	List<Employee> getEmployees();
}
