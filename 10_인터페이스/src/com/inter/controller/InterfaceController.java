package com.inter.controller;

//1016-10-2
public class InterfaceController {
	public void basicInterface() {
		//1016-10-4
		//기본 인터페이스 선언
		//추상 메소드와 static final 변수를 갖는 독특한 객체
		// 자체 생성이 불가능하고, 다른 일반 클래스에서 구현해서 사용 (why? 추상 메소드를 포함하는 클래스는 무조건 추상 클래스. 자체 생성 불가능)
		
		//인터페이스 선언 방법
		// public interface 인터페이스명{ 추상메소드, static final 변수 }
		
		//다른 클래스에 구현(이용)하는 방법
		// public class 클래스명 [extends 클래스명] [implements 인터페이스명] {  }
		
		//인터페이스는 다중 구현(이용)이 가능함.
		// public class 클래스명 [extends 클래스명, 클래스명2 ... X-불가능] // extends 상속은 여러개를 상속받을 수 없지만
		//					   [implements 인터페이스명, 인터페이스명2, 인터페이스명3] {  } // 인터페이스는 이렇게 사용 가능!
		
		
	}
}
