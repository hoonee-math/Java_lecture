package com.obj.model.vo;

public class InitTest { // 1010-6-1
	// 최기화 블록 사용하기
	// 객체를 생성하면 무조건 실행되는 로직을 사용할 때 선언
	//	클래스 내부에 중괄호 {}로 선언
	
	// 1010-6-6
	private int count2=0; // 이 count 라는 변수는 InitTest 가 실행될때마다 몇번 실행되는지 확인하기 위해 선언했지만 정상 작동하지 않음.
	// 1010-6-9
	// 공용으로 사용하는 저장소는 static 예약어를 이용해서 선언한다!
	// 지금까지 배웠던 예약어는? final! 상수 취급용 예약어
	private static int count=0; // static 영역에 InitTest 라는 클래스와 연결된 count2 저장소가 생김.
	// 기울어진 변수, static 변수, class 에 속해있는 변수, class 변수
	// 지금까지 배운 변수 세가지: 지역변수, 필드, static
	// 1010-6-10 외부(main)에서 static 영역에 접근할 수 있다.
	public static int count3=0;
	
	{
		// 6-2 초기화 블록임! -> 인스턴스(=객체) 초기화 블록, new 라고 해서 객체를 생성하면 무조건 실행됨!
		System.out.println("초기화 블록 실행");
		count++;
	}
	public InitTest() { // 1010-6-3
		System.out.println("기본 생성자 호출");
		System.out.println(count); // 1010-6-7
	}
	public InitTest(String title) { // 1010-6-4
		this(); // 이렇게 만들어도, 객체가 실행됐을 때 공통으로 실행되어야 할 코드를 적을 수도 있지만 보통은 초기화 블록을 만든다.
		System.out.println("매개변수가 있는 생성자 호출");
		System.out.println(count); // 1010-6-8 이런식으로 count 가 정상 작동되게 하려면, static 이라는 영역을 활용해야함. stack/heap/static
	}
	
}
