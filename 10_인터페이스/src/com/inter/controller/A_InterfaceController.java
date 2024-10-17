package com.inter.controller;

import com.inter.common.A_BasicInter;
import com.inter.model.vo.A_BasicInterImpl;

//1016-10-2
public class A_InterfaceController {
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
		
		//1017-1-1
		//인터페이스 이용하기
		// 생성안됨
		// 하나의 자료형으로 사용이 가능 -> 참조형 자료형
		A_BasicInter inter;// = new A_BasicInter(); // 얘는 생성이 되지 않는다!
		// 공통으로 사용할 메소드에 대한 선언부를 정의
		// 메소드의 구현을 강제시킴 -> 선언한 메소드가 있다는 것을 보장
		
		//1017-1-2
		//구현체 클래스를 선언해서 이용을 한다.
		// 클래스 선언부 implements(구현) 인터페이스명 // 이렇게 인터페이스를 구현했을때 클래스 선언부로 들어간다~
		//1017-1-7
		// 인터페이스타입에는 구현체클래스만 저장이 가능 -> 다형성
		inter = new A_BasicInterImpl();
		System.out.println(inter);
	}
}
