package com.inherit.model.vo;

public class My_Cat extends My_Animal {
	
	@Override
	public void move() {
		System.out.println(getName()+"가 꽁꽁 얼어붙은 한강 위를...");
	}
	@Override
	public void bark() {
		System.out.println(getName()+"는 미야오!");
	}
	
}
