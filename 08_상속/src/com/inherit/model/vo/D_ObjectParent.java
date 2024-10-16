package com.inherit.model.vo;

//public final class D_ObjectParent { //1016-5-2 final 추가, ex) String 클래스는 final 클래스임!
public class D_ObjectParent { //1016-5-3 우선은 상속가능하게 final 제거
	
	//1016-5-4 final 메소드를 정의
	public final void test() {
		System.out.println("이건 아무도 건들지마!");
	}

}
