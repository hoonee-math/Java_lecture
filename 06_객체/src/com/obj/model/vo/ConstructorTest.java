package com.obj.model.vo;

public class ConstructorTest { //1010-1-1
	public String title; //  참조형 자료형 -> nullpointexception
	
	// 생성자를 선언하기
	// 접근제한자 클래스명([매개변수...]){}
	// 생성자의 접근제한자는 필드와 동일
	// 필드의 접근 제한자 : public, protected(상속관계가 있는경우만), default(같은 패키지), private(내부적으로만)
	// 클래스를 생성하고 접근을 제한하기 위해서 접근제한자를 사용.
	// 생성자에 대해서도 사용할 수 있게/없게 
	// 일반적으로 선언한 클래스의 생성자는 public 으로 선언한다! class 도 일반적으로 public
	// 설계상의 특정 제약이 없다면(일반적인 서비스를 만들때) 생성자는 public
	
	public ConstructorTest() { //1010-1-2
		// 기본생성자 -> 클래스를 기본 생성할 때 사용하는 생성자
		System.out.println("기본 생성자 호출");
		title=""; // 기본 생성자에 이렇게 초기값을 선안하면 여러 ㅇㅇ에서 동시에 값을 사용할때! 이용가능
 	}
	
//	public ConstructorTest() { //1010-1-5
//		// Duplicate method ConstructorTest() in type ConstructorTest
//	}
	
	public ConstructorTest(String inputTitle) { //1010-1-5
		// 매개변수 있는 생성자
		// 생성할 시점(new라고 해서 호출 할 때)에 특정 데이터를 받아서 필드를 초기화 할 때 사용.
		title=inputTitle; // title 은 4번째줄 필드에 선언한 변수
	}
	
	// 생성자는 다수 선언할 수 있다.
	//  조건: 매개변수 선언시 순서와 타입이 달라야 함.
//	public ConstructorTest(String test) { // 이러면 1010-1-5 와 같은 타입! 타입이 중요함! 오류 발생
//	}
	public ConstructorTest(String test, int a) {
	}
	public ConstructorTest(int a, String test) {
	}
}
