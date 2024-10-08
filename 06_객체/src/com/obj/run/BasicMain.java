package com.obj.run;

import com.obj.model.vo.PublicTestClass; 

//// import 도 안되고 생성도 못하는 이유는 default 이기 때문에!
//// The type com.obj.model.vo.DefaultTestClass is not visible // 타입이 없다면 resolved라고 뜰 텐데, not visible이 뜸
//import com.obj.model.vo.DefaultTestClass;

// BasicMain 이라는 클래스가 생성됨.
public class BasicMain {
	public static void main(String[] args) {
		// 접근제한자가 public 인 클래스는 이용이 가능하다.
		new PublicTestClass(); // 이 설계대로 heap 영역에 생성해라, 패키지가 다르기 때문에 import 해줘야함.
		new com.obj.model.vo.PublicTestClass(); // 이렇게도 사용할 수 있다!
		
//		// 접근제한자가 default 인 클래스는 이용이 불가능하다.
//		new DefaultTestClass(); // import 도 안되고 생성도 못하는 이유는 default 이기 때문에!
	}
}
