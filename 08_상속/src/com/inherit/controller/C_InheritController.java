package com.inherit.controller;

import com.inherit.model.vo.B_Developer;
import com.inherit.model.vo.C_Dog;
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
		// clone()		: 객체의 사본을 생성 -> 깊은 복사 / 배열을 포함한.. / clone() 을 오버라이딩해서 배열에서도 사용할 수 있게 함!
		// toString()	: 객체를 대표하는 문자열을 반환해주는 메소드 / 참조형 자료형에 대한 변수명을 써줘서 print 해줬는데, 얘는 toString을 호출함.. 
						// 밑에서 d, Developer 에는 toString 이 없음. 기본인 Object 의 toString 을 호출함.
						// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Object.html -> toString -> [getClass().getName() + '@' + Integer.toHexString(hashCode())]
		// 이것들을 재정의(오버라이드) 해서 사용함!
		
		// hashCode() 설명 youtube 15:49
		System.out.println(d); // @ 뒤에 있는 주소는 중복..... 이걸 hash 알고리즘으로 분석, abc가 들어오면 숫자로...? youtube 15:49
		// 동등성 비교를 할 때는 equals 만 가지고 하는게 아니라, hash 코드도 확인해줌.
		System.out.println(d.hashCode());
		
		//1015-4-7
		//메소드 오버라이드 하기
		// 메소드의 구현부(중괄호 내부)를 재정의 하는 것!
		// 선언부는 그대로 둠!
		// 오버라이드 조건
		//  -> 클래스가 상속 관계에 있고, 재정의할 메소드가 부모(super) 클래스에 정의되어 있어야 함.
		// 메소드의 선언부는 그대로 사용. * 접근 제한자는 변경 가능 (더 넓게 가능), public 보다 더 넓은 범위는 없기 때문에 일반적으로 가능하다고 보긴 어려움.
		// override 를 체크하기 위해서 선언부에 @Override 라는 어노테이션을 이용할 수 있다. (단순히 체크하기 위한 용도)
		
		//1015-4-10
		C_ObjectTest ot=new C_ObjectTest();
		ot.move();
		
		//1015-4-18
		C_Dog dog=new C_Dog();
		dog.setName("설기");
		dog.setAge(3);
		dog.setWeight(5);
		dog.move();
		dog.bark();
	}
}








