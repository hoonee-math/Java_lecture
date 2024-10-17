package com.inter.controller;

import com.inter.common.A_BasicInter;
import com.inter.common.C_ChildInter;
import com.inter.common.C_Parent2Inter;
import com.inter.common.C_ParentInter;
import com.inter.common.D_NoNameInter;
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
		
		//1017-5-1
		// 굳이 model 에 클래스를 만들지 않고도 사용할 수 있게 하는 클래스... 익명클래스 활용하기 // 이전 학습 요약 : 1307 youtube
		// 익명클래스 : 코드 안에서 한번만 구현?
		//1017-5-3
		D_NoNameInter noname = new D_NoNameInter() { // 변수 하나 생기고, 얘를 구현한 클래스의 객체가 들어감. 생성 안된다고했는데? 괄호를 부여해주면 된다고?
			//1017-5-4
			// 인터페이스를 new 해서 생성해준다음에 구현체를 바로 작성해줌.
			@Override
			public boolean check(String str) {
//				return true; //1017-5-9 주석
				return str.length()>10;
			}
			//1017-5-6
			@Override
			public int length(String str){ //1017-5-7 클래스 파일 안에서 클래스 파일을 만들어두지 않고도 이렇게 구현해서 사용할 수 있음.
				return str.length();
			}
		};
		//1017-5-8
		boolean flag = noname.check("adafg"); // 이렇게 호출할 수 있는거는 noname 에 str을 저장했음. 추상 메소드로 구현된 메소드가 없는게 아니라 바로 위에 있음. 원래는 클래스 하나 만든 다음에 implements 한 다음에 구현해서 사용해야하는데, 지금은 이 로직안에서만 사용하고 끝내기 위해 이 안에 구현함.
		//1017-5-10 다시 구현할 수도 있음.
		noname = new D_NoNameInter() {
			@Override
			public boolean check(String str) {
				for(int i =0; i<str.length();i++) {
					if('a'<=str.charAt(i)&&'z'>=str.charAt(i))
						return true;
				}
				return false;
			}
			//1017-5-11 아직 에러남. int를 반환하는 렝스도 구현해줘야함.
			@Override
			public int length(String str) {
				return 200;
			}
		};
		//1017-5-12
		flag=noname.check("가나다라마");
		
	}
}
