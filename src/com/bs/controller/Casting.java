package com.bs.controller;

public class Casting {
	public static void main(String[] args) {
		// 형변환
		// 특정연산을 실행할 때는 피연산자의 타입이 동일해야한다.
		int num=10;
		double num2=10.5;
//		int result=num+num2;
		double result=num+num2;
		System.out.println(result);
		
		result=100;
		
		// 강제 형변환
		// 코드를 명시해야함
		// (자료형)리터럴||(자료형)변수명
//		int num3=result; result는 double형이기 때문에 넣어줄 수 없다! 왜? 다시 들어보기
		int num3=(int)result;
		System.out.println(num3);
		System.out.println(result);
		
		// 계산 결과를 출력할 때 주의!
		// 평균값 
		int kor=80, math=70, eng=70, coding=30;
		System.out.println((kor+math+eng+coding)/4f);
		
		
	}
}
