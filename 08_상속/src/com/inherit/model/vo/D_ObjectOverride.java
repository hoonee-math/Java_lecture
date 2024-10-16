package com.inherit.model.vo;

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
}
