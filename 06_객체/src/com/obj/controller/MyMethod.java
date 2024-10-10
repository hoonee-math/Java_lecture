package com.obj.controller;

import java.util.Scanner;

public class MyMethod { // 1010-7-1
	// 필드랑 생성자랑 메소드는 접근제한자 종류가 같다.
	// 메소드는 일반적으로 public 으로 사용한다!
	
	// 1010-7-2
	// 메소드 선언하기
	// 접근제한자(public) 반환형(기본자료형, 참조형자료형-class or 배열, void) 메소드명([매개변수])
	// 유형에 따라서 메소드 선언해보기

	// 1010-7-3
	// 1. 반환형이 없고, 매개변수가 없는 메소드 선언하기
	public void printMsg() { // class 내부에 바로 메소드를 선언 했음. 이런 경우를 "멤버 메소드", "인스턴스 메소드"라고 부름
		// 1010-7-4
		// MyMethod를 객체화 한다음에 printMsg로 접근할 수 있음.
		System.out.println("민호님 힘내세요!\n당신은 할 수 있어요!");		
	}
	
	// 1010-7-6
	// 2. 반환형 없고 매개변수 있는 메소드 선언하기
	// 특정한 값을 받아서 출력하는 기능
	public void printMsg2(String msg) {
		System.out.println(msg);
	}
	
	// 1010-7-8
	// 3. 반환형이 있고 매개변수 없는 메소드 선언하기
	// 사용자에게 입력값을 받고 
	// 반환형이 있으면 반드시 메소드 내부에 'return' 예약어가 있어야 한다.
	// return 리터럴||변수명;
	public int inputNum() {
		Scanner sc=new Scanner(System.in);
		System.out.print("수 입력:");
		int inputNum=sc.nextInt();
		return inputNum+inputNum;
	}
	
	// 1010-7-11
	// 4. 반환형이 있고 매개변수 있는 메소드 선언하기
	public long calc(int su1,int su2) {
		long total=su1*su2;
		return total;
	}
	
	// 클래스를 크게 두 가지로 분류하자
	// 기능 제공용 클래서, 자료 데이터 저장용 데이터  
	// MVC 패턴
	//	M: Model 		: 데이터, 정보 (이름, 전화번호, 주소, 이메일)
	//  V: View  		: 보여지는 화면
	//  C: Controller 	: 데이터와 화면 사이의 기능을 수행 (등록, 수정, 삭제, 조회)
	
	// 화면(V)한테 부탁(C) 그러면 사용자한테 입력받은걸 저장하라고 매개변수로 데이터를 넘겨줌(M)
	// M은 저장 다 하고 나면 C한테 저장 다 했다고 알려줌.
	// C는 사용자에게 저장 완료 했다고 보여줘야함 (V)
}










