package com.obj.model.vo;

public class FieldTest {
	// 필드 선언하기
	// 필드 : 객체가 클래스를 객체로 생성했을 때 이용할 수 있는 저장공간. 즉 변수.
	// 선언 방법 (클래스 중괄호 안에서)
	//	접근제한자 [예약어] 자료형 변수명;
	// 접근제한자
	//  public : 프로젝트 내 모든 패키지에서 이용가능
	// 	default: 프로젝트 내 같은 패키지에서만 이용가능
	//  private: 클래스 내부에서만 이용가능
	// 	protected: 나중에 배울 예정
	// 이용가능: 객체로 직접 접근해서 이용하는 것을 의미함
	
	
	public int num=1;			// 필드 public 으로 선언, 선언과 동시에 초기화 가능
	String name;			// 필드 default 로 선언
	private double weight;	// 필드 private 로 선언
	// 여기 선언된 필드는, new라는 명령어를 실행했을 때 heap영역에 생성됨.
	// 여기에 선언한건 코드 그 자체일 뿐. 객체로 생성했을 때 이렇게 만들면 된다고 알려주는 코드!
	
//	weight=65.5;
//	// 생성자나, 초기화 블록(그냥 중괄호로 묶은 경우), 메소드 내부에 들어가야지만 if 문이나 for 문이나 그런것들을 사용할 수 있음.
	
	{
		// 이렇게 초기화 블록 안으로 넣으면 오류가 사라짐.
		weight=65.5;		// 이것도 직접 접근이라 할 수 있음.
		this.weight=541234.4; 	// 원래는 윗줄 코드도 this 가 생략되어있음.
		System.out.println(weight);
		System.out.println(this.weight);
	}
	
	
	// 필드에 final 예약어 사용하면 상수로 이용할 수 있음. 파이널 필드!
	// 상수로 쓰는건 대문자 사용
	public final int AGE=19;
	// final은 언제 쓰느냐? 객체를 생성했을 때 더 이상 수정하지 않을 때, final로 생성해서 사용!
//	public FieldTest(int AGE) {
//		this.AGE=AGE;
//	}
	
	
	// 필드에 다양한 자료형을 선언할 수 있다.
	// 참조형 자료형! >> 배열, String 등 class 들도! type 이 된다!, 
	public int[] numbers;				// null 이 들어감, null 로 인해서 접근을 하면 nullPointException 오류가 발생함.
//	public int[] numbers=new int[5];
//	public PublicTestClass ptc;			// null 이 들어감, null 로 인해서 접근을 하면 nullPointException 오류가 발생함.
	public PublicTestClass ptc=new PublicTestClass(); // 241008-1333
}











