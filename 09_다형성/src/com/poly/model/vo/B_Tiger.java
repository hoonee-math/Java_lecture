package com.poly.model.vo;

//1016-9-21
public class B_Tiger extends B_Animal {
	
	//1016-9-22
	public B_Tiger(String name, String type, int age, double weight) {
		super(name, type, age, weight);
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		//1016-9-23
		System.out.println(getName()+"가(이) 어슬렁어슬렁 움직입니다.");
	}

}
