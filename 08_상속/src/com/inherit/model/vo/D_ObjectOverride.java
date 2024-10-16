package com.inherit.model.vo;

import java.util.Objects;

//1016-1-1
public class D_ObjectOverride extends D_ObjectParent { //1016-5-1, D_ObjectParent 는 final 예약어를 포함한 final 클래스 이기 때문에 상속할 수 없음.
	private int no;
	private String data;
	
	public D_ObjectOverride() {
		// TODO Auto-generated constructor stub
	}

	public D_ObjectOverride(int no, String data) {
		super();
		this.no = no;
		this.data = data;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	//1016-1-5 동등성 비교를 위해서 equals 를 재정의 하자!
	@Override
	public boolean equals(Object obj) { // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Object.html#equals(java.lang.Object)
		//1016-6-11 다형성을 이용해서 모든 클래스를 저장할 수 있는 Object 를 받고 있음.
		// 하지만 이런 경우 자식 필드에는 접근 할 수 없음. 가려져있음. 강제 형변환을 이용하면 아래와 같이 접근가능하게 됨.
		//1016-1-6 
		D_ObjectOverride param = (D_ObjectOverride)obj;
		if(this.no==param.no && this.data==param.data) { // this 는 생략 가능 // param 이라는 객의 no, data 와 매개변수로 받은 객체와 서로 같은지 확인
			return true;
		}
		return false;
	}
	//1016-2-3
	@Override
	public int hashCode() { // 최상위 hashCode 메소드는 native 코드, native 는 코드 비공개/c나 c++같은 언어로 만들어짐.
		//hash 가 기울기가 되어있네? static 메소드!
		return Objects.hash(this.no,this.data); // 두개의 값을 결합해서 hash 알고리즘을 돌려서 값을 돌려줌.
	}
	//1016-3-1
	@Override
	public D_ObjectOverride clone() {
		//깊은 복사
//		return this;
		return new D_ObjectOverride(no, data);
	}
	//1016-4-1
	@Override
	public String toString() {
		//객체를 대표하는 문구를 출력해주는 메소드
		//필드에 저장된 값을 출력
		// print(), println() 매개변수로 참조형변수를 전달했을 때
		// 자동으로 호출됨.
		
		//1016-4-2
		return no+","+data; // 쉼표는 csv 파일의 저장 방법의 일종임! return 을 보내는 다양한 방법 중 한가지.
	}
	
//	//1016-5-5
//	@Override
//	public void test() { } // final 예약어가 붙은 final method 는 수정해서 사용할 수 없어!
//	// error : Cannot override the final method from D_ObjectParent
}
