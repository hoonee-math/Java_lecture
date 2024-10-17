package com.inter.controller;

import java.util.List;

import com.inter.common.A_BasicInter;
import com.inter.common.C_ChildInter;
import com.inter.common.C_Parent2Inter;
import com.inter.common.C_ParentInter;
import com.inter.common.D_MyFunctionalInter;
import com.inter.common.D_NoNameInter;
import com.inter.model.vo.A_BasicInterImpl;
import com.inter.model.vo.C_ChildInterImpl;
import com.inter.model.vo.D_ReferenceMethod;

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
		
		//1017-6-2 [1017-6-1] 에서 만든걸 1회용으로 호출해서 사용할 수 있음. testCheck 라는 곳에 전달되면 거기서 .... 13:25 youtube
		testCheck(new D_NoNameInter() {
			@Override
			public boolean check(String str) {
				return false;
			}
			@Override
			public int length(String str) {
				return str.length();
			}
		});
		
		//1017-6-3
		testCheck(new D_NoNameInter() { // 똑같은 메소드를 실행했지만, 밑에 실제 코드에서 실행하는건 ... 13:27 youtube
			@Override
			public boolean check(String str) {
				return str.equals("test");
			}
			@Override
			public int length(String str) {
				return str.length();
			}
		}); //1017-6-4 메소드가 많은건 어쩔수 없지만(인터페이스 타입에서 check를 호출할지 length 를 호출할지 몰라. 어떤걸 쓸지 명시하고 사용해야함. 인터페이스를 만들때 한나의 추상메소드만 갖고있는 걸 만들 수 잇음. 컴파일 시점에는 메소드를 알 수 있으니까 다음과 같이 사용
		
		//1017-6-5
		//인터페이스내에 추상메소드를 한개만(디폴트 메소드는 여러개 있어도 상관없음. 스태틱 필드에 여러개있어도 상관없음) 선언하면
		// FunctionalInterace 라고 하고, 이때 FunctionalIntercae 는 람다라는 표현식을 이용해서 처리할 수 있음! 13:32 youtube
		//사용방법 : (매개변수명)->{로직 작성 [return 반환값]}
		//(매개변수명)->{로직 작성}
		// 그 매개변수명으로 실행되는 것을 표현하기 위해 매개변수 명을 선언
		// 만약 void 반환 없는 형태이면 이대로 작성가능!
		//(매개변수명)->{로직 작성 return 반환값}
		// 반환형이 있는 경우 중괄호 안에 return 반환값을 써줘야함.
		
		//1017-6-8
		D_MyFunctionalInter functionalInter;
		functionalInter = new D_MyFunctionalInter() {
			@Override
			public boolean test(String str) {
				return str.length()	>5;
			}
		}; //1017-6-9 표현 내용 불린 반환 매개변수 str 받고 str.length 반환 이걸 표현해보자, 6-8 대신에 6-10 처럼 만들어서 사용할 수 있다!
		//1017-6-10
		functionalInter = (content)->{return content.equals("우와신기");};
		flag = functionalInter.test("우와신기"); // test 는 바로 윗줄 에 구현한걸 말하는 것임. functionalInter 에는 어짜피 추상메소드가 하나만 있으니까 test 라는 메소드명 없이 functionalInter 람다 표현식으로 사용할 수 있음.
		System.out.println(flag);
		//1017-6-11
		functionalInter = (content)->content.equals("우와신기"); // 반환값이 하나면 이렇게도 쓸 수도 있음. 
		functionalInter = content->content.equals("우와신기"); // 반환값이 하나면 이렇게도 쓸 수도 있음. 
		//Question 결국 functionalInter 여기에는 추상메소드가 하나만 있으니까 가능하단거지?!
		//1017-6-13
		testFunctional(i->i.equals("이야이야이야"));
		//1017-7-5
		// 스트링 하나를 받아서 불린을 반환하는 시그니처.. 따로 메소드를 정의해서 사용한 건데, 이렇게 구현된 메소드가 있다고 할때, 이걸 참조해서 로직 그대로 가져와서 쓰라고 만들 수도 있음.
		// static 메소드라는 것이 편한데...
		//1017-7-8
		functionalInter=D_ReferenceMethod::referenceTest;
		
		List.of(1,2,3,4,5).stream().filter((i)->i>3).toList(); // (i)->i>3 이 부분의 표현식을 보면, 매개변수를 가져와서 i 를 이용해서.... 크기를 비교해서 boolean 을반환
	}
	
	//1017-6-1
	public void testCheck(D_NoNameInter no) {
		System.out.println(no.check("test")); //
	}
	
	//1017-6-14
	public void testFunctional(D_MyFunctionalInter inter) {
		inter.test("이야이야이야");
	}
}


























