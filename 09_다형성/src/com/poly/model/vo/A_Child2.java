package com.poly.model.vo;

//1016-6-9
public class A_Child2 extends A_Parent{
	private int account;
	
	public A_Child2() {
		// TODO Auto-generated constructor stub
	}
	public A_Child2(int account) {
		super();
		this.account = account;
	}

	public int getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}
	
}
