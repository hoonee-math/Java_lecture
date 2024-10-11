package com.obj.run;

import com.obj.controller.FieldUseMethod;

public class FieldUseMain {

	public static void main(String[] args) {
		// 1011-2-4 객체 생성	
		FieldUseMethod fum=new FieldUseMethod();
		// 1011-2-5 fum 객체의 num 필드에 10을 저장
//		fum.num(10); // 이렇게 접근할 수 없음
		fum.inputNum(10);
		fum.printNum();
//		fum.inputPersonData("김민호"); // 1011-2-7 [1011-2-8]처럼 filed 를 객체로 넣어서 사용하면 에러 메시지
		fum.inputPersonData("최광훈");
		fum.printPerson();
		
		new FieldUseMethod().inputPersonData("이예진"); 	// 1011-2-13 새로 "이예진"을 저장하며 객체와 필드를 새로 만들어 냄
		new FieldUseMethod().printPerson();				// 1011-2-14 얘도 새로 만들어짐
	}

}
