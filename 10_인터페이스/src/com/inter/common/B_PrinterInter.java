package com.inter.common;

//1017-2-8
public interface B_PrinterInter {
	void print();
	//1017-2-12
	// 이 인터페이스 구현해주세요~ 그러면 쓸 수 있어
	
	//1017-3-1
	void scanner(); // 이렇게 만들고 저장하자마자 오류. 이 인터페이스를 구현한 클래스들에 대해서 강제성을 부여함. 메소드를 구현해줘야함! api 구현해줄때...생각해줘야함.
	//1017-3-2 default 메소드의 필요성! 강제성을 부여하지 않는 필요할때만 사용하는 메소드도 만들자
	//1017-3-3
	// 각각 가서 Alt+s+v  맥북 command + option + shift + v + 방향키 아래 네번
	
	//1017-3-4
	//default 메소드 추가하기
	//구현체가 있는 메소드
	default void basicCopy() { // 예약어를 default 로 하면, 접근제한자는 public 으로 됨. default 가 없으면 추상 클래스로 인식을 함!
		System.out.println("기본기능");
	}
}
