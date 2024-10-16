package com.poly.controller;

import com.poly.model.vo.A_Child;
import com.poly.model.vo.A_Parent;

public class PolyTestController {
	//1
	//1016-6-1
	public void basicTest() {
		//다형성 활용하기
		//부모타입의 변수가 자식객체를 저장할 수 있게 하는 기술
		// 두 클래스가 상속관계로 설정되어야한다.
		//1016-6-2
		A_Parent p;
		p=new A_Parent();
		p=new A_Child(); //1016-6-3 p는 A_Parent 객체임! [1016-6-4] 상속관계를 추가하지 않으면 error
		System.out.println(p);
		
		//1016-6-7
		//부모클래스에 저장된 자식객체 이용하기
		// 부모타입으로 형변환(업캐스팅) 해서 대입되기 때문에
		// 대입되는 순간 부모에 선언된 내용만 사용이 가능하다!
		//사용시 자식 내용을 사용하려면 다운캐스팅(강제형변환)을 해야한다.
		p=new A_Child("안녕 child"); // 업캐스팅? 해서 들어감?
		((A_Child)p).setChildData("오호! 점 찍기 전에 괄호를 쳐야하는구나!"); // 점 접근연산자는 최우선 연산자, 형변환은 나중 연산
		((A_Child)p).setParentData("부모! 점 찍고도 부모 데이터 접근 가능");
	}
}
