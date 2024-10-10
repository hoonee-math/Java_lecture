package com.obj.model.vo;

public class Person { // 1010-2-3
	public String name;
	public int age;
	public double height;
	
	// 1010-2-6 그래서 기본 생성자를 만든다
	public Person() {}
//	private Person() {} // single tone 패턴을 사용하거나 할때 주어진 방식으로만 생성자를 만들게 하고 싶을때 객체 생성을 막아버릴 수 있음.
	// 접근자를 이용해서 생성ㅈ자 이용을 차단할 수 있다!
	
	// 1010-2-5 이렇게 만들어 놓으면 [1010-2-4] 에서 처럼 Person p=new Person(); 매개변수 없이 사용할 수는 없다!
	public Person(String inputName) { 
		name=inputName;
	}
	
}
