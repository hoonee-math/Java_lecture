package com.poly.model.vo;

//1016-9-4
public class B_Cat extends B_Animal {

	public B_Cat(String name, String type, int age, double weight) {
		super(name, type, age, weight);
	}
	
	//1016-9-16
	@Override
	public void move() {
		System.out.println(getName()+"가(이) 살금살금");
	}
}
