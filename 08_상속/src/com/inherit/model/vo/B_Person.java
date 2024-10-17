package com.inherit.model.vo;

public class B_Person extends B_Test { //1015-3-2 상속 추가
	//1015-2-4
	// 공통 부분을 추상화하자!
	private String name;
	private int age;
	private char gender;
	private double height;
	private double weight;
	
	public B_Person() {
		// TODO Auto-generated constructor stub
	}
	
	public B_Person(String name, int age, char gender, double height, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
	}

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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String infoPerson() {
		return name+", "+age+", "+gender+", "+height+", "+weight;
	}
	protected String infoPersonProtected() {
		return name+", "+age+", "+gender+", "+height+", "+weight;
	}
}
