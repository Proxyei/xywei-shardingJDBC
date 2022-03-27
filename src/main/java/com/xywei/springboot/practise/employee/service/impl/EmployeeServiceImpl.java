package com.xywei.springboot.practise.employee.service.impl;

import com.xywei.springboot.practise.employee.dao.EmployeeDao;
import com.xywei.springboot.practise.employee.domain.Employee;
import com.xywei.springboot.practise.employee.service.EmployeeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Resource
	private EmployeeDao employeeDao;

	@Override
	public List<Employee> getAllEmployee() throws Exception {
		return employeeDao.getAllEmployee();
	}

	@Override
	public List<Employee> getEmployees() {
		return employeeDao.getEmployees();
	}

}
