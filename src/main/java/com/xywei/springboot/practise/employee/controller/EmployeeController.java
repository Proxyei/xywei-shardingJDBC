package com.xywei.springboot.practise.employee.controller;

import com.github.pagehelper.PageHelper;
import com.xywei.springboot.practise.employee.domain.Employee;
import com.xywei.springboot.practise.employee.service.EmployeeService;
import com.xywei.springboot.practise.vo.BaseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

	private final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/employee/getAllEmployee")
	public ResponseEntity<BaseResult<List<Employee>>> getAllEmployee() {
		PageHelper.startPage(1, 2);
		List<Employee> employees = new ArrayList<>();
		try {
			employees = employeeService.getAllEmployee();
		} catch (Exception e) {
			logger.error("error: {}", e);
		}
		BaseResult<List<Employee>> result = new BaseResult<List<Employee>>();
		result.setCode(HttpStatus.OK.value());
		result.setMessage(HttpStatus.OK.getReasonPhrase());
		result.setData(employees);
		return new ResponseEntity<BaseResult<List<Employee>>>(result, HttpStatus.OK);
	}

	@PostMapping("/employee/getAllEmployee2")
	public ResponseEntity<BaseResult<List<Employee>>> getAllEmployee2() {
		
		List<Employee> employees = employeeService.getEmployees();
		BaseResult<List<Employee>> result = new BaseResult<List<Employee>>();
		result.setCode(HttpStatus.OK.value());
		result.setMessage(HttpStatus.OK.getReasonPhrase());
		result.setData(employees);
		return new ResponseEntity<BaseResult<List<Employee>>>(result, HttpStatus.OK);
	}

}
