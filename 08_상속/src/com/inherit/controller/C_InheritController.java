package com.inherit.controller;

import com.inherit.model.vo.B_Developer;
import com.inherit.model.vo.C_ObjectTest;

//1015-4-1
public class C_InheritController {
	//1015-4-2
	public void objectClassTest() {
		//Object 클래스!
		// java 에서 기본으로 제공하는 최상위 클래스! (상속 관계의 최상위 클래스)
		// java 에서 사용하는 모든 클래스는 Object 클래스의 후손이다.
		//  -> Object 클래스에 선언된 내용은 모든 클래스가 사용이 가능하다!
		
		//1015-4-4
		C_ObjectTest test=new C_ObjectTest();
		//1015-4-5 점찍으면 이클립스 assistance 가 실행할 수 있는 메소드를 알려줌.
		// 객체라면, ㅇㅇ이라면 youtube 15:20 모든 클래스를 하나로 묶어주는 하나의 역할./
		// 동등성비교, ㅇㅇㅇ,ㅇㅇㅇ // wait, notify - 스레드 처리할 때
//		test.
		B_Developer d=new B_Developer();
//		d.
		// JDK 17 Documentation // https://docs.oracle.com/en/java/javase/17/docs/api/index.html
		
		//1015-4-6
		//Object 에 있는 메소드는 각 클래스에 필요한 공통의 기능을 하는 메소드
		// equals()		: 객체의 동등성을 비교하기 위한 메소드, 객체==객체 ? 비교 불가능 주소는 서로 다를 수 밖에 없음. 비교할때는 equals 에서 하지만 클래스마다 무엇을 같다고 할지 결정하기 위해서 재정의해줘야함.
		// hashCode()	: 객체에 부여되어 있는 숫자로된 id 값을 반환 - 동등성 비교를 할 때 equals 와 같이 재정의 한다.
		// clone()
		// toString()
		
		// hashCode() 설명 youtube 15:49
		System.out.println(d); // @ 뒤에 있는 주소는 중복..... 이걸 hash 알고리즘으로 분석, abc가 들어오면 숫자로...? youtube 15:49
		// 동등성 비교를 할 때는 equals 만 가지고 하는게 아니라, hash 코드도 확인해줌.
		System.out.println(d.hashCode());
	}
}
