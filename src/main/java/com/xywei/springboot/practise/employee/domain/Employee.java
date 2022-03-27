package com.xywei.springboot.practise.employee.domain;

public class Employee {
	private Integer id;
	private Integer leaderId;
	private String employeeName;

	public Employee() {

	}

	public Employee(Integer id, Integer leaderId, String employeeName) {
		super();
		this.id = id;
		this.leaderId = leaderId;
		this.employeeName = employeeName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getLeaderId() {
		return leaderId;
	}

	public void setLeaderId(Integer leaderId) {
		this.leaderId = leaderId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", leaderId=" + leaderId + ", employeeName=" + employeeName + "]";
	}

}
