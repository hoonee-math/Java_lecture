package com.inherit.model.vo;

public class My_Animal {
	
	private String name;
	private char gender;
	
	public My_Animal() {}
	
	public My_Animal(String name, char gender) {
		this.name = name;
		this.gender = gender;
	}
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public char getGender() {return gender;}
	public void setGender(char gender) {this.gender = gender;}
	
	public void move() {
		System.out.println(name+"는 움직이지 않는다."); // 재정의를 하지 않은 경우에는 기본값으로 이렇게 사용할 수 있음.
	}
	public void bark() {
		System.out.println(name+"는 소리를 내지 않는다."); // 재정의를 하지 않은 경우에는 기본값으로 이렇게 사용할 수 있음.
	}
}
