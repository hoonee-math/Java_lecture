package com.myobj.vo;

// 데이터 보관용 클래스, 추상화 목적
public class Users {	// 이 Users 를 생성했을 때 필요한 저장 공간을 선언하자! 
	// 일반적으로 public 으로 사용하지는 않음
	public String id;
	public String pw;
	public String eMail;
	public int age;
//	public String hobby;
	public String[] hobby;
	
	
	// 1010-3-1
	public Users() {}
	public Users(String inputId, String inputPw, String inputEmail, int inputAge, String[] inputHobby) {
		id 		= inputId;
		pw 		= inputPw;
		eMail 	= inputEmail;
		age 	= inputAge;
		hobby 	= inputHobby;
	}
	
	
}
