package com.inter.common;

public interface C_ChildInter extends C_ParentInter,C_Parent2Inter{//1017-4-9 상속 추가 extends C_ParentInter //1017-4-16 C_Parent2Inter 추가, 
	//1017-4-8
	void child(); // parent() 라는 추상 메소드가 자동 추가됨. extends 한 메소드를 날로 먹을 수 있음.
}
