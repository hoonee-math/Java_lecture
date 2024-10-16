package com.poly.model.vo;

//1016-7-5
public class A_Teacher extends A_Person{
	private String subject;
	private int salary;
	public A_Teacher() {
		// TODO Auto-generated constructor stub
	}
	public A_Teacher(String name, int age, char gender, String subject, int salary) {
		super(name, age, gender);
		this.subject = subject;
		this.salary = salary;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
