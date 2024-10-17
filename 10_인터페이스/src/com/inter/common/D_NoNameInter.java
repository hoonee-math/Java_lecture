package com.inter.common;

//1017-5-2
public interface D_NoNameInter {
	// 추상 메소드만 선언 가능함.
	boolean check(String str); // 필요할때!
	
	//1017-5-5 하나 더 만들어보자
	int length(String str); //이렇게 선언하자마자 컨트롤러에서 오류남. 구현체가 필요한거니까 컨트롤러에 오버라이드 해주면됨.
}
