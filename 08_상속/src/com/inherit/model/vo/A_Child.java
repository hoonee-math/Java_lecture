package com.inherit.model.vo;

//1015-1-4 (추가) extends A_Parent 
public class A_Child extends A_Parent {
	// 생성자가 없으면 jvm 이 기본생성자를 만드는데
	// Implicit super constructor Parent() is undefined for default constructor. Must define an explicit constructor
	public A_Child() {
		// 부모생성자를 매개변수 있는 생성자로 호출
		super("");
	}
	
	//자식에서 부모필드에 접근하기
	// 부모필드도 접근제한자의 영향을 받는다.
	// 부모필드가 private 로 선언이 되어있으면 getter/setter 를 이용해서 필드를 사용한다.
	//protected 접근제한자를 사용하면 상속받은 클래스에서 직접접근이 가능!
	public void accessParentField() {
//		this.data="나 자식"; // this 가 붙더라도 부모까지 탐색을 하긴 함. 하지만 접근 제한자에 의해서 차단이 됨!
		setData("나 자식");
		System.out.println(getData());
		number=100;
		
	}
}
