package com.obj.controller;

import com.obj.model.vo.Person;

public class FieldUseMethod {
	// 1011-2-1
	private int num;
//	private Person p; // 1011-2-8 주소값을 갖는 변수, 객체가 안들어온 상태에서, 참조형이니까 default값인 null 이들어가있음. 그래서 nullpointExecption이 뜸
	private Person p=new Person(); // 1011-2-9 이렇게 사용하거나(1)
//	{
//		p=new Person(); // 1011-2-10 이렇게 사용하거나(2)
//	}
//	public FieldUseMethod() { // 1011-2-11 이렇게 사용하거나(3)
//		p=new Person();
//	}
	
	// 1011-2-2
	// 매개변수로 받은 name 값을 person 에 저장하겠다는 메소드
	public void inputPersonData(String name) {
		this.p.name=name; 	// 필드에 접근 (this 를 안써도 접근 가능하지만 공부하는 동안 쓰자!)
	}
	
	// 1011-2-3
	public void inputNum(int num) {
		this.num=num;		// 필드에 접근
	}

	// 1011-2-6
	public void printNum() {
		System.out.println(this.num);
	}
	
	
	// 1011-2-12
	public void printAll() {
		System.out.println(this.p.name+" "+this.p.age+" "+this.p.height);
	}
	
	
	
	
}
