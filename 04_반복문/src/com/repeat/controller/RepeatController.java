package com.repeat.controller;

import java.util.Scanner;

public class RepeatController {
	public void basicFor() {
		// for 문
		// 특정 코드를 원하는 만큼 반복하여 실행시키는 명령어
		// 
		
//		For(초기식; 조건식; 증감식){반복할 토드(로직)}
//		초기식: 변수선언, 반복횟수 데이터를 저장하는 변수. cpu 가 처리하게 하기 위해서는 초기 데이터를 어딘가에 저장해야함!
//		조건식: for 문의 코드를 실행할지 결정한는 조건 
//				true면 실행, flase면 중단
//				초기식에 선언한 변수를 가지고 조건식을 작성(일반)
//				boolean 초기식에서 선언한 값을 가지고 조건식을 만들어 boolean 을 계산함.		
//		증감식: 초기식에 선언한 변수의 값을 변경하는 연산 작성
//				조건식의 결과가 변경되어야함.
//
//		초기식 -> 조건식 -> 코드 -> 증감식
//			 -> 조건식 -> 코드 -> 증감식
//		 	 -> 조건식 -> 코드 -> 증감식 -> ...
		
		// 안녕하세요 10000번 출력하기
		for(int i=1; i<=10; i++) {
			System.out.println("안녕하세요");
		}
		// 본인 이름 5번 출력하기
		for(int i=0; i<5; i++) {
			System.out.println("최광훈");
		}
		// 규칙적인 숫자에 대한 처리를 할때 반복문이용 가능
		for(int i=0; i<10; i++) {
			System.out.print(i+1+" ");
		}
		// 1~ 100까지 출력하기
		for(int i=0; i<100; i++) {
			System.out.print(i+1+" ");
			if((i+1)%10==0) {
				System.out.println();
			}
		}
		// 반복문의 {} 안에는 모든것을 다 사용할 수 있다.
		// 변수선언, 연산자, 조건문, 반복문, 기능 호출 모두 가능!
		int sum=0;
		for(int i=0; i<3; i++) {
			String temp="안녕";
			if(temp.equals("안녕")) {
				temp+="나도 안녕";
			}
			sum=i;
			System.out.println(temp+" "+i);
		}
		
		// 1부터 100까지의 수 중 짝수만 출력하는 로직
		for(int i=0; i<100; i+=2) {
			System.out.print(i+2+" ");
		}
		System.out.println();
		// 100부터 1까지 출력하기
		for(int i=0; i<100; i++) {
			System.out.print(100-i+" ");
		}
		System.out.println();
	}
	public void inputStudent() {

		// 반 친구들의 이름을 5명 입력받고 출력하는 기능 궇녀
		// public void inputStudent()
		// 입력받은 후 각각 출력하고, 한번에도 출력하기		
		String total_st="";
		for(int i=0; i<5; i++) {
			Scanner sc=new Scanner(System.in);
			System.out.print("친구 이름을 입력하세요: ");
			String student=sc.next();
			System.out.printf("%s라는 친구가 등록되었습니다.",student);

			System.out.println();
			if(i!=0) total_st+=",";
			total_st +=student+" ";			
		}
		System.out.println("등록된 학급 학생들의 명단은 다음과 같습니다: "+total_st);
	}
	public void for2() {
		// for 에 초기식, 존건식, 증감식을 무조건 써야하나?
		// for(초기식; 조건식; 증감식){}
		int i=10;
		for(;i<20;i++) {
			System.out.print(i+" ");
		}
		// 무한루프
		i=10;
		for(;i<20;) {
			System.out.println(i+++" ");
		}
		// 의도적으로 무한루프를 돌릴때, 보통은 while문을 이용함.
		for(;;) {
			System.out.println("무한루프"+i++);
			if(i==100) break;
		}
	}
	
}



