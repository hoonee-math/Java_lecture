package com.obj.controller;

import java.util.Scanner;

public class MethodTest {
	
//	1. 오늘 수업 너무 쉽다 출력하는기능
	public void printToday() {
		System.out.println("오늘 너무 쉽다... 졸립다.....");
	}
	
//	2. 1부터 10까지 출력하는 기능
	public void oneToTen() {
		for(int i=0;i<10;i++) {
			System.out.print((i+1)+" ");
		}
		System.out.println();
	}
	
//	3. 1부터 사용자가 원하는 수(전달받아서)까지 출력하는 기능
	public void oneToInput(int inputNum) {
		
		for(int i=0;i<inputNum;i++) {
			System.out.print((i+1)+" ");
		}
		System.out.println();
	}
	
//	4. 1부터 5까지 더한수를 반환하는 기능
	public int ontToSumFive() {
		int result=0;
		
		for(int i=0;i<5;i++) {
			result += i+1;
		}
		
		return result;
	}
	
//	5. 사용자에게 5번 메세지를 입력받고 입력받은 메세지를 반환하는 기능
	public String printMsgs() {
		String msgs="";
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			System.out.print((i+1)+"번째 메시지 입력: ");
			msgs+=sc.next()+" ";
		}
		
		return msgs;
	}
			
//	6. 숫자두개, 연산자를 전달받아 계산한결과를 반환해주는 기능
	public int calc(int num1, int num2, char operator) {
		int resultNum=0;
		
		switch(operator) {
			case '+' : resultNum= num1 + num2; break;
			case '-' : resultNum= num1 - num2; break;
			case '*' : resultNum= num1 * num2; break;
			case '/' : resultNum= num1 / num2; break;
			case '%' : resultNum= num1 % num2; break;
			default : 
		}
		
		return resultNum;
	}
	
//	7. 문자열을 전달받아 문자열의 중복값 여부를 반환하는 기능
	public String duplicated(String msg) {
		String result = "";
		boolean check=false;
		
		checkFor:
		for(int i=0; i<msg.length(); i++) {
			char checkNum1=msg.charAt(i);
			for(int j=i+1; j<msg.length(); j++) {
				char checkNum2=msg.charAt(j);
				if(checkNum1==checkNum2) {
					check=true;
					System.out.println("중복 문자: "+ checkNum1);
					break checkFor;
				}
			}
		}
		
		result = check?"중복값 있음":"중복값 없음";
		return result;
	}
	
}


