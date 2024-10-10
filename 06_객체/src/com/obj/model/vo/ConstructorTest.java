package com.obj.model.vo;

public class ConstructorTest { //1010-1-1
	public String title; //  참조형 자료형 -> nullpointexception
	public long account;
	public double height;
		
	// 생성자를 선언하기
	// 접근제한자 클래스명([매개변수...]){}
	// 생성자의 접근제한자는 필드와 동일
	// 필드의 접근 제한자 : public, protected(상속관계가 있는경우만), default(같은 패키지), private(내부적으로만)
	// 클래스를 생성하고 접근을 제한하기 위해서 접근제한자를 사용.
	// 생성자에 대해서도 사용할 수 있게/없게 
	// 일반적으로 선언한 클래스의 생성자는 public 으로 선언한다! class 도 일반적으로 public
	// 설계상의 특정 제약이 없다면(일반적인 서비스를 만들때) 생성자는 public
	
	public ConstructorTest() { //1010-1-2
		// 기본생성자 -> 클래스를 기본 생성할 때 사용하는 생성자
		System.out.println("기본 생성자 호출");
		title=""; // 기본 생성자에 이렇게 초기값을 선안하면 여러 ㅇㅇ에서 동시에 값을 사용할때! 이용가능
 	}
	
//	public ConstructorTest() { //1010-1-5
//		// Duplicate method ConstructorTest() in type ConstructorTest
//	}
	
	public ConstructorTest(String inputTitle) { //1010-1-5
		// 매개변수 있는 생성자
		// 생성할 시점(new라고 해서 호출 할 때)에 특정 데이터를 받아서 필드를 초기화 할 때 사용.
		title=inputTitle; // title 은 4번째줄 필드에 선언한 변수
	}
	
	//1010-1-5-6
	// 생성자는 다수 선언할 수 있다.
	//  조건: 매개변수 선언시 순서와 타입이 달라야 함.
//	public ConstructorTest(String test) { // 이러면 1010-1-5 와 같은 타입! 타입이 중요함! 오류 발생
//	}
	public ConstructorTest(String test, int a) {
	}
	public ConstructorTest(int a, String test) {
	}
	
	// 1010-2-1
	// 매개변수 있는 생성자는 '전달 받은 값'(인수)으로 필드를 초기활 할 때 사용
	public ConstructorTest(String inputTitle, long inputAccount, double inputHeight) {
		// 아래와 같이 작성해서 사용하면
		// [1010-2-2]에서 new로 heap 영역에 새 저장소를 생성할 때 초기값을 default로 넣지 않고, 초기값을 선언해 놓을 수 있다!
		
		if(inputTitle.length()>2) { // 1010-2-7 일반적으로는 이렇게 사용하지 않지만, setter, getter가면 이걸 많이 사용함.
			title  = inputTitle;			
		}
		if(inputAccount>0) {
			account= inputAccount;			
		}
		if(inputHeight<0) {
			throw new IllegalArgumentException("에러에러");
		}
		height = inputHeight;
	}
	
	// 1010-4-1
	public ConstructorTest(String title, double height, long account) {
		// 매개변수의 이름과 필드명이 동일한 경우
		// 지역변수에서 title 이라는 변수가 존재하기 때문에 굳이 필드 변수까지 가서 확인하지 않는다!
		// 필드변수는 필드라고 명시(객체꺼라고) -> this(자기 자신의 주소를 저장하고 있는 예약어
		// 매개변수(지역변수)의 title 이 아닌 객체가 만들어질때마다 각각의 title 을 가리키는 주소를 가리키기 위해 this 라는 "예약어"를 사용함.
		this.title  =title;
		this.height =height;
		this.account=account;
	}
	
	// 1010-5-1
	// this 생성자!
	// this() : 생성자로 선언된 다른 생성자를 호출할 때 사용
	public char data;
	public int numData;
	public double weight;
	
	public ConstructorTest(char data) { // 1010-5-2
		this(data,19); // 아래 생성자(5-3)를 호출함.
		// this 생성자( this() ) 는 한개만 선언이 가능
//		this.data=data;
	}
	public ConstructorTest(char data, int numData) { // 1010-5-3
		this(data,numData,10.5);
		this.data=data;
		this.numData=numData;
	}
	public ConstructorTest(char data, int numData, double weight) { // 1010-5-4
		this.data=data;
		this.numData=numData;
		this.weight=weight;
	}
	
}











