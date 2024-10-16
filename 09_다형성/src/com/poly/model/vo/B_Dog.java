package com.poly.model.vo;

//1016-9-3
public class B_Dog extends B_Animal { //1016-9-19 error : The type B_Dog must implement the inherited abstract method B_Animal.move()

	public B_Dog(String name, String type, int age, double weight) {
		super(name, type, age, weight);
	}
	
	//1016-9-20
	@Override
	public void move() {
		System.out.println(getName()+"가(이) 성큼성큼 갑니다.");
	}
}
