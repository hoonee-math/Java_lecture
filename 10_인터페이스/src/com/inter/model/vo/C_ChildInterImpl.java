package com.inter.model.vo;

import com.inter.common.A_BasicInter;
import com.inter.common.B_PrinterInter;
import com.inter.common.C_ChildInter;

public class C_ChildInterImpl 
	implements C_ChildInter //1017-4-10 implements C_ChildInter 		//1017-4-19 코드상에는 childInter 만 구현해 놓았지만 다 가능!
	, B_PrinterInter, A_BasicInter 	//1017-4-21 다중 구현이 가능하다!
	{ 

	//1017-4-11
	@Override
	public void child() { //1017-4-12//implements C_ChildInter 를 해줬지만 여전히 에러. 왜냐하면 parent를 상속받았기 때문에 parent 의 메소드도 구현해줘야함!
		
	}
	//1017-4-13
	@Override
	public void parent() {
		
	}
	//1017-4-17 상속이 추가되면 메소드도 추가해줘야함.
	@Override
	public void parent2() {
		
	}
	

	//1017-4-22 alt + s + v // implements B_PrinterInter, A_BasicInter 한 후에 메소드 자동추가!
	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void test1() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int calc(int su, int su2) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void scanner() {
		// TODO Auto-generated method stub
		
	}
	
	
}
