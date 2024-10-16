package com.inter.common;

//1016-10-3
public interface A_BasicInter {
	//1016-10-5
	//기본 인터페이스 만들기
	//메소드 선언하기 -> 추상 메소드만 가능! // 이게 기본...? 말을 바꿀 예정임?????
//	public void test() { 
//		System.out.println("test");
//	};
	public abstract void test(); // 이렇게 선언할 수도 있지만,
	//접근 제한자와 abstract 예약어는 생략이 가능.
	public void test1();
	int calc(int su, int su2);
	
	//필드 선언하기
//	private String nameIllegal; // final 두꺼워지고, static 기울어짐.
	//Illegal modifier for the interface field A_BasicInter.name; only public, static & final are permitted
	//잘못된 접급제한자, 인터페이스에서는!
	public static final String NAME="";// final 이고 static 일때는 대문자로 사용! 이 인터페이스 이용했을 때 코드, 에러 메시지 등을 묶어서 사용
	int AGE=19; // 앞서 얘기했듯이 접근 제한자와 abstract 예약어는 생략이 가능.
	
}
