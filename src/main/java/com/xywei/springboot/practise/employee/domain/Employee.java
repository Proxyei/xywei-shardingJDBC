package com.xywei.springboot.practise.employee.domain;

public class Employee {
	private Long id;
	private Long leaderId;
	private String employeeName;

	public Employee() {
		System.out.println("emp 空构造方法");
	}

	public Employee(Long id, Long leaderId, String employeeName) {
		super();
		System.out.println("emp 有参构造方法");
		this.id = id;
		this.leaderId = leaderId;
		this.employeeName = employeeName;
	}

	public void init() {
		System.out.println("emp init方法");
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getLeaderId() {
		return leaderId;
	}

	public void setLeaderId(Long leaderId) {
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
