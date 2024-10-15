package com.inherit.controller;

import com.inherit.model.vo.A_Child;
import com.inherit.model.vo.A_Parent;


public class A_InheritController extends A_Child { //1015-1-12  [extends A_Child] 추가

	public void basicInherit() {
		//1015-1-1
		//기본 상속에 대해 알아보자.
		// 이전에 선언되어 있는 클래스의 내용을 가져다 사용 (만들어져있는 것을 가져다 사용해서 재사용이라고 부름)
		// 클래스(부모,super)와 클래스(자식,sub) 사이의 관계를 설정 -> 상속 
		
		//개발자가 필요에 의해서.. 클래스의 관계에 따라서, 설계 대로 설정
		// 상속관계를 설정하는 방법
		// 클래스 선언부에 extends 예약어를 사용해서 선언을 함.
		
		//예) public class 클래스명(sub) extends 클래스명(super) { 필드, 메소드 }
		// 상속 : sub 에서 super 를 가져다 쓰겠다!
		
		//1015-1-3
		A_Parent p=new A_Parent("");
		System.out.println(p.getData());
		p.test();
//		p.test2(); //1015-1-11 // 여기서는 상속받지 못받은 protected 인 경우
		test2(); //1015-1-13 // 상속된 객체 안에서는 사용할 수 있음.
		A_Child c=new A_Child();
		
		//1015-1-5 child 에는 getData 나 test 가 없지만
		// [public class Child ] 를 [public class Child extends Parent ] 로 상속받으면 사용 가능해진다!
		System.out.println(c.getData());
		c.test();
//		c.test2(); //1015-1-11 // 여기서는 상속받지 못받은 protected 인 경우
		
		
		//1015-2-1
		//직업별 사람을 관리하는 프로그램
		// 개발자, 강사, 회사원, 학생
		// 개발자	: 이름, 나이, 성별, 경력, 주언어
		// 강사	: 이름, 나이, 성별, 경력, 주과목, 연봉
		// 회사원	: 이름, 나이, 성별, 연차, 직급, 부서
		// 학생	: 이름, 나이, 성별, 학년, 학과, 학교
	}
}
