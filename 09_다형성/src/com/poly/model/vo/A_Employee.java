package com.poly.model.vo;

//1016-7-7
public class A_Employee extends A_Person {
	private String dept;
	private String job;
	public A_Employee() {
		// TODO Auto-generated constructor stub
	}
	
	
	public A_Employee(String dept, String job) {
		super();
		this.dept = dept;
		this.job = job;
	}


	public A_Employee(String name, int age, char gender, String dept, String job) {
		super(name, age, gender);
		this.dept = dept;
		this.job = job;
	}


	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
}
