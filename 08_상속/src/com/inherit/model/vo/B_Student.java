package com.inherit.model.vo;

public class B_Student extends B_Person { //1015-2-5 상속 추가
	private int grade;
	private String major;
	private String school;
	public B_Student() {
		// TODO Auto-generated constructor stub
	}
	public B_Student(int grade, String major, String school) {
		super();
		this.grade = grade;
		this.major = major;
		this.school = school;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
}
