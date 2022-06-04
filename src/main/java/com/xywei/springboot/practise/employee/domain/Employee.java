package com.xywei.springboot.practise.employee.domain;

public class Employee {
	private Integer id;
	private Integer leaderId;
	private String employeeName;

	public Employee() {
		System.out.println("emp 空构造方法");
	}

	public Employee(Integer id, Integer leaderId, String employeeName) {
		super();
		System.out.println("emp 有参构造方法");
		this.id = id;
		this.leaderId = leaderId;
		this.employeeName = employeeName;
	}

	public void init() {
		System.out.println("emp init方法");
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
