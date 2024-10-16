package com.poly.model.vo;

//1016-7-2
public class A_Student extends A_Person { //1016-7-3
	private int grade;
	private int classNumber;
	public A_Student() {
		
	}
	//1016-7-4 alt+s+a 에서 g 누르기 전에 select Super constructor 에서 아래거 선택하면 상속 관계에 있는것 포함해서 생성함
	public A_Student(String name, int age, char gender, int grade, int classNumber) {
		super(name, age, gender);
		this.grade = grade;
		this.classNumber = classNumber;
	}
	
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassNumber() {
		return classNumber;
	}
	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}
	
	
	
}
