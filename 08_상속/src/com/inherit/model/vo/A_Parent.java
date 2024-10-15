package com.inherit.model.vo;

public class A_Parent {
	//1015-1-2
	private String data;
	int number;
	protected double weight;
	
	public A_Parent(String data) {
		this.data=data;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	public void test() {
		System.out.println("Parent의 test메소드");
	}
	
	//1015-1-10
	protected void test2() {
		System.out.println("Parent의 test메소드");
	}
	
}
