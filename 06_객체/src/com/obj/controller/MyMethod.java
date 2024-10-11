package com.obj.controller;

import java.util.Scanner;

import com.obj.model.vo.Person;

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
	
	// 1011-1-1
	// 매개변수는 하나의 메소드의 지역변수가 됨.
	// 매개변수의 이름과 지역변수의 이름이 중복되면 안됨.
//	public void test1(su) {
//		String su="십"; // 불가능!
//		int su=0;
//	}
	
	// 1011-1-2
	// 반환형을 선언하면 return 반드시 써야함.
	// return 값 -> 반환하는 값은 한개만 가능!
//	public int test2() {
//		int su=100;
//		int su2=200;
//		return su,su2; // 불가능!
//	}
	public int[] test2() {
		int su=100;
		int su2=200;
		return new int[] {su,su2}; // 배열로 받기!
	}
	
	// 1011-1-3
	// return 은 반환의 의미 -> 호출한 곳으로 되돌아간다!
	// 메소드 내부에서 return 을 만나면 로직이 끝나지 않아도 중단된다!
	// 호출한 곳으로 되돌아감!
	// return 예약어는 반환형이 없어도 사용이 가능 -> void 일때 사용가능
	public void test3() {
		for(int j=0;j<10;j++) {
			for(int i=0;i<100;i++) {
				if(i>10) return;
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	
	// 1011-1-4
	// 참조형 자료형 반환, 매개변수의 인수로 전달하기
	// 기본자료형과 다른 특징이 있다.
	// 	기본 자료형: 데이터를 저장
	// 	참조형 자료형: 주소를 저장
	public void test4(String name) {
		name += "아~ 점심 뭐먹지?";
	}
	public String test40(String name) {
		name += "아~ 점심 뭐먹지?";
		return name;
	}
	
	// 1011-1-6
	public void test5(String[] names) {
		names[0]="유병승";
		names[1]="우민혁";
		names[2]="양성준";
	}
	
	// 1011-1-8
	public void personData(Person p) {
		p.name="이민영";
		p.age=25;
		p.height=163.2;
	}
	
	// 1011-1-10
	// 메소드 static 예약어
	// 지금까지는 인스턴스 메소드(멤버 메소드)들은 new를 이용해서 새롭게 객체를 생성해서 사용함
	// 얘 같은 경우에는 클래스명.메소드명() 으로 호출해서 사용 가능 // 1011-1-11
	public static void test6() {
		System.out.println("static 메소드 호출");
	}
	// 1011-1-12
	public static String errorMessage(int errorCode) {
		String message="";
		switch(errorCode) {
			case 404: message="페이지를 찾을 수 없습니다."; 			break;
			case 403: message="이영권한이 없습니다."; 				break;
			case 500: message="서버상 에러입니다. 관리자에게 문의하세요."; 	break;
			default : message="나도 모르는 에러"; 					break;
		}
		return message;
	}
	
	// 1011-1-14
	// 멤버 메소드, static 메소드에서 필드 조작하기
	// FieldUseMethod로 추가!
}



















