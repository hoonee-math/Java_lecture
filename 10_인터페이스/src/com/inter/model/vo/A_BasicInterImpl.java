package com.inter.model.vo;

import com.inter.common.A_BasicInter;

public class A_BasicInterImpl implements A_BasicInter { //1017-1-3 A_BasicInter 여기 있는거 가져다가 현재 클래스(A_BaiscInterImpl)에서 사용하겠다. 추상메소드 구현을 강제시킴. 아직 구현되지 않아 다음 메시지가 출력됨.
	
	//1017-1-8
	// 기본 생성자, setter/getter 생성
	private String myData;
	
	public void name() {
	}
	
	public A_BasicInterImpl() {
		// TODO Auto-generated constructor stub
	}
		
	public A_BasicInterImpl(String myData) {
		super();
		this.myData = myData;
	}

	public String getMyData() {
		return myData;
	}

	public void setMyData(String myData) {
		this.myData = myData;
	}

	
	// Error : The type A_BaiscInterImpl must implement the inherited abstract method A_BasicInter.calc(int, int)
	//1017-1-4
	// 추상클래스는 그냥 클래스인데 추상메소드가 있을 뿐
	// 인터페이스는 아무 내용도 없는것. 추상 메소드에 대한 선언만 있는 것!
	
	//1017-1-5
	// [1016-10-3] 에서 만든 A_BasicInter 이라는 클래스에서 사용된 모든 기능이 정의되어 있어야 함
	@Override
	public int calc(int num, int num2) {
		return num+num2;
	}
	
	public void test() {
		System.out.println("나 구현체!");

	}

	//1017-1-6 나머지 기능도 전부 정의해 보자
//	public abstract void test() {}; 
	public void test1() {
		System.out.println("나 구현체!");
	}
	
	
	
}
