package com.obj.run;

import com.obj.model.vo.ConstructorTest;
import com.obj.model.vo.InitTest;
import com.obj.model.vo.Person;

public class ConstructorMain { //1010-1-3
	
	public static void main(String[] args) { //1010-1-4
		// 생성자 활용하기
		ConstructorTest ct=new ConstructorTest(); // ConstructorTest() 이렇게 작성된 부분은 기본생성자를 호출한 것임! 
		int length=ct.title.length();
		System.out.println(ct.title);
//		System.out.println(ct);
		ConstructorTest ct2=new ConstructorTest("매개변수 있는 생성자");
		System.out.println(ct2.title);
		// [1010-1-2] 를 주석 처리 하더라도 실행에는 error가 발생하지 않음.
		// -> 일반적으로 생성자에서는 필드에 대한 초기값을 설정함.
		ConstructorTest ct3=new ConstructorTest("내가 준 값");
		System.out.println(ct3.title);
		
		// 1010-2-2
		ConstructorTest ct4=new ConstructorTest("첫 번째",100,180.5);
		// 1010-2-4
		Person p=new Person();
		System.out.println(p.name+" "+p.age+" "+p.height);
		
		// 1010-2-8
		ConstructorTest ct5=new ConstructorTest("안녕",-200,90.5);
		System.out.println(ct5.title+" "+ct5.account+" "+ct5.height);
	
		// 1010-5-5
		ConstructorTest ct6=new ConstructorTest('a');
		System.out.println(ct6.data+" "+ct6.numData+" "+ct6.weight);
		
		// 1010-6-5
		InitTest it=new InitTest();
		InitTest it2=new InitTest("매개변수");
		
		// 1010-6-11
		// static 변수에 접근하기
		// 클래스명.변수명
		InitTest.count3=100; // static 변수는 [1010-6-5] 코드가 없어도(InitTest 객체가 만들어지지 않아도) 만들어짐!
//		it.count3=200; // error: The static field InitTest.count3 should be accessed in a static way
		// static 변수를 사용할때는 class 명과 함께 사용하자!
		System.out.println(InitTest.count3);
	}
}








