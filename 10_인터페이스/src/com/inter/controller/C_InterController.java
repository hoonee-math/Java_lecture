package com.inter.controller;

import com.inter.common.A_BasicInter;
import com.inter.common.C_ChildInter;
import com.inter.common.C_Parent2Inter;
import com.inter.common.C_ParentInter;
import com.inter.model.vo.A_BasicInterImpl;
import com.inter.model.vo.C_ChildInterImpl;

//1017-4-1
public class C_InterController {
	public void extraContent() {
		
		//1017-4-2
		A_BasicInter inter;
		inter = new A_BasicInterImpl();
//		inter.NAME // static 인 상수에 접근하려고 하면 경고가 뜸. static final 이기 때문에 -> A_BasicInter
		System.out.println(A_BasicInter.NAME); // 이렇게 접근해야함. 
		
		//1017-4-3
		((A_BasicInterImpl)inter).setMyData("오호!"); // 형변환이 가능은 하다!
		System.out.println(((A_BasicInterImpl)inter).getMyData()); // 필요한 시점에 형변환해서 쓸 수는 있다!
		
		//1017-4-4
		System.out.println(inter instanceof A_BasicInterImpl); // 형변환을 하기전에 객체 타입을 체크할 때!
		
		//1017-4-6
		//인터페이스도 상속이 가능하다.
		//인터페이스끼리의 상속, 다중상속도 가능
		//1017-4-18
		C_ParentInter parentInter;
		C_Parent2Inter parent2Inter;
		C_ChildInter childInter;
		// 상속관계가 존재하면, object 는 다 가질 수 있었음.
		parentInter = new C_ChildInterImpl();
		// parentInter 에 new ChildInetrImpl() 를 생성해서 넣으면 import해서 넣으면 들어가짐! 이 객체는 결국 C_ParentInter 에 대한 구현체임!
		parent2Inter = new C_ChildInterImpl();
		
		//1017-4-20
		// 인터페이스는 다중구현이 가능하다.
		
	}
}
