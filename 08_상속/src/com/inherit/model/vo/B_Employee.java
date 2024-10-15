package com.inherit.model.vo;

public class B_Employee extends B_Person { //1015-2-5 상속 추가
	//1015-2-3
	private int dayOf;
	private String job;
	private String dept;
	
	public B_Employee() {
	}
	
	public B_Employee(int dayOf, String job, String dept) {
		super();
		this.dayOf = dayOf;
		this.job = job;
		this.dept = dept;
	}

	public int getDayOf() {
		return dayOf;
	}
	public void setDayOf(int dayOf) {
		this.dayOf = dayOf;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String infoEmployee() {
		return infoPerson()+", "+dayOf+", "+dept+", "+job;
	}
}
