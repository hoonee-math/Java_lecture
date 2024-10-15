package com.inherit.model.vo;

//1015-4-16
public class C_Dog extends C_Animal { //1015-4-17

	//1015-4-19
	@Override
	public void move() {
		System.out.println(getName()+"는 신이 나서 꼬리를 살랑살랑");
	}
	@Override
	public void bark() {
		System.out.println(getName()+"는 멍멍멍!");
	}
}
