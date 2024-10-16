package com.poly.model.vo;

public class A_Child extends A_Parent { //1016-6-4 [ extends A_Parent ] 추가
	private String childData;
	public A_Child() {
		// TODO Auto-generated constructor stub
	}
	//1016-6-6
	public A_Child(String childData) {
		super();
		this.childData = childData;
	}
	public String getChildData() {
		return childData;
	}
	public void setChildData(String childData) {
		this.childData = childData;
	}
	
}
