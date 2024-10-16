package com.student.model.vo;

public class Student {
	private static int studentCount;
	private int studentNo;
	private String name;
	private int age;
	private int grade;
	private int classNumber;
	private String phone;
	private String address;
	private double height;
	private char gender;
	
	{
		studentNo=++studentCount;		
	}
	
	//기본생성자 ctrl+space+enter
	public Student() {}
	//매개변수있는 생성자 alt+s+a+g
	public Student(String name, int age, int grade, int classNumber, String phone, String address,
			double height, char gender) {
//		this.studentNo = studentNo;
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.classNumber = classNumber;
		this.phone = phone;
		this.address = address;
		this.height = height;
		this.gender = gender;
	}
	//setter/getter만들기 alt+s+r+a+r
	public static int getStudentCount() {
		return studentCount;
	}
	
	public int getStudentNo() {
		return studentNo;
	}
//	public void setStudentNo(int studentNo) {
//		this.studentNo = studentNo;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String infoStudent() {
		return this.studentNo+" "+this.name
				+" "+this.age+" "+this.grade
				+" "+this.classNumber+" "+this.phone
				+" "+this.address+" "+this.height+" "
				+this.gender;
	}
	
}
