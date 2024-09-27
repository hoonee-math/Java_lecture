package com.bs.controller;

public class StringTest {
	public static void main(String[] args) {
		// 문자열 자료형에 대해 알아보자.
		// String -> 하나의 클래스
		// 기본자료형처럼 이욯할 수 있게 만든 클래스
		String name="최광훈";
		System.out.println(name);
		name=new String("김관호"); // name="김관호"; 와 똑같은 결과임.
		System.out.println(name);
		
		// 문자열 결합 연산이됨.
		String temp="자바";
		temp="자바"+"선생님";
		System.out.println(temp);
		
		temp=temp+" java teacher";
		System.out.println(temp);
		
		// 다른 자료형과 문자열을 + 연산하기
		temp=100+"점";	// JVM이 알아서 서로다른 자료형의 연산을 연산해줌. 이 경우에는 int 형을 문자열로 바꿔줌. 그래서 int + String 을 String + String 으로 바꿔줌
		System.out.println(temp);
		temp='A'+"는 "+100+'점'+"키는 "+180.5+"cm";
		System.out.println(temp);
		
		char grade=' ', ch=' ';
		int point=0;
		double height=0.0;
		
		grade='B';
		ch='점';
		point=80;
		height=177.3;
		
		String msg = grade + "는 " + point + ch + " 키는 " + height + "cm"; // 위에서 변수명만 선언하고, 초기화는 하지 않는경우 에러가 발생함.
		System.out.println(msg);
		
		// String은 클래스로 유용한 기능을 제공
		// 1. 저장된 문자열에 대한 길이(문자의 갯수)를 알려주는 기능(메소드) 제공
		//	lenght();
		msg="최광훈";
		System.out.println(msg.length()); // 점을 접근 연산이라고함?????
		System.out.println("우와 이제 한시간 남았다.".length());
		
		// 2. 문자열에 저장된 문자 한개만 가져오는 기능
		//	charAt(원하는 문자의 위치번호);
		System.out.println("성은 "+msg.charAt(0));
		System.out.println(msg.charAt(msg.length()-1));
		System.out.println("문자열의 길이는 "+msg.length()+"\n\n\n\n");
		
		// 본인의 이름, 나이, 성별(M/F), 주소, 전화번호, 키를
		// 각각 적당한 변수에 저장하고, 한개의 문자열로 한 번에 출력하기
		// 출력문
		// 나의 이름은 000이고 나이는 00살이고 키는 000.0cm
		// 주소는 000 00000 000, 성별은 0 전화번호는 000-0000-0000이다.
		// 출력문의 길이를 출력하고
		// 출력문의 3번째 4번째 문구를 출력하기
		String myName="", myAddress="", myPhoneN="";
		int myAge=0;
		char myGender=' ';
		double myHeight = 0.0;
		
		myName		= "최광훈";
		myAddress	= "천안시 서북구 월봉1길 15";
		myPhoneN	= "010-7487-0451";
		myAge		= 32;
		myGender	= 'M';
		myHeight	= 173.6;
		
		
		String myInfo="";
		myInfo = "나의 이름은 "+myName+"이고 나이는 "+myAge+"살이고 키는 "+myHeight+"cm"+"\n주소는"+myAddress+", 성별은 "+myGender+" 전화번호는 "+myPhoneN+"이다.";
		System.out.println(myInfo);
		System.out.println("출력문의 길이는 "+myInfo.length()+"입니다");
		System.out.println("출력문의 3번째 문구는 \""+myInfo.charAt(3)+"\"이고, 4번째 문구는 \""+myInfo.charAt(4)+"\"입니다.");
		
		
		// 3. 
	}
}
