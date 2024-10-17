package com.inter.common;

//1017-6-6 //1017-7-3 어노테이션을 선언하면, 추상메소드가 하나만 있는지 체킹을 해줌,
@FunctionalInterface
public interface D_MyFunctionalInter {
	//1017-6-7
	boolean test(String str); // 이 인터페이스 안에는 현재 추상메소드 이거 하나만 선언되어있음
	
//	//1017-7-1
//	void test2(); // 이렇게 저장하면, 람다 표현식을 더이상 사용할 수 없다! 람다표현식은 추상메소드가 하나일때만 사용할 수 있기 때문에!!
	
	//1017-7-2
	default void test2() { // 이렇게 되면, 추상메소드는 여전히 하나임! 왜냐하면, 얘는 default 이기때문에!
	}
	
//	//1017-7-4
//	void test3(); // 7-3 에서 어노테이션이 추상메소드가 하나인지 체크해줌!
}
