package com.inherit.controller;

import com.inherit.model.vo.A_Parent;

public class A_Child2 extends A_Parent{
//	public void A_InheritController() {
//		super("");
//	}
	
//	A_Parent 생성자 없으면 A_Child2 에 에러메시지 (Implicit super constructor A_Parent() is undefined for default constructor. Must define an explicit constructor)
	public A_Child2() {
		super("");
	}
	//다른 패키지에 있는 자식클래스에서 필드접근하기
	public void accessField() {
//		data = "test";
//		number = 200;
		weight = 75.5;
	}
}
