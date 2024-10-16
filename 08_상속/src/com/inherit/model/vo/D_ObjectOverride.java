package com.inherit.model.vo;

import java.util.Objects;

//1016-1-1
public class D_ObjectOverride {
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
	
}
