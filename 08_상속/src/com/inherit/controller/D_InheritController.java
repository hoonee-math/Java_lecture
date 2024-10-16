package com.inherit.controller;

import com.inherit.model.vo.D_ObjectOverride;

//1016-1-2
public class D_InheritController {

	//1016-1-3
	public void objectOverride() {
		//object 가 제공하는 메소드 오버라이드하기
		// equals
		// hashcode
		// clone
		// toString
		D_ObjectOverride obj = new D_ObjectOverride();
		obj.setNo(1);
		obj.setData("통통");
		D_ObjectOverride obj2 = new D_ObjectOverride();
		obj2.setNo(1);
		obj2.setData("통통");
		D_ObjectOverride obj3 = new D_ObjectOverride();
		obj3.setNo(1);
		obj3.setData("감자");
		
		//1016-1-4
		System.out.println("obj==obj2 결과: "+(obj==obj2)); // 주소는 같을 수가 없음! 
		System.out.println("obj==obj3 결과: "+(obj==obj3)); // 우리는 값들이 같으면 같은 값인지 확인하고 싶은 것임. 이걸 동등성 비교라고 한다!
		// 객체 동등성 비교를 하기 위해서는 equals 라는 메소드를 사용한다!
		// 클래스마다 필드가 다를텐데, 객체 비교를 하기 위해서는 equals 를 이용해서 override 해서 사용하겠다!
		
		//1016-1-7	[1016-1-5] 를 주석해서 사용하면 다시 Object 클래스의 equals 를 호출하게 됨! 위랑 똑같아짐!
		System.out.println("obj.equals(obj2) 결과: "+obj.equals(obj2));
		System.out.println("obj.equals(obj3) 결과: "+obj.equals(obj3));
		
		//1016-2-1
		System.out.println(obj.hashCode()); //1016-2-2 해시코드 메소드도 재정의 해서 사용할 수 있다!
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
	}
}
