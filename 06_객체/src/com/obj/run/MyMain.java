package com.obj.run;

import java.util.Scanner;

import com.obj.controller.MethodTest;

public class MyMain {

	public static void main(String[] args) {
		
		MethodTest md = new MethodTest();
		md.printToday();
		md.oneToTen();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력: ");
		int inputNum = sc.nextInt();
		md.oneToInput(inputNum);
		
		int result = md.ontToSumFive();
		System.out.println("md.ontToSumFive() 의 return 값: "+result);
		
		String msgs = md.printMsgs();
		System.out.println(msgs);
		
		System.out.println("==== 6 숫자 입력 계산기 ====");
		System.out.print("첫 번째 숫자 입력:\t");
		int num1 = sc.nextInt();
		System.out.print("연산자 입력: \t");
		char operator = sc.next().charAt(0);
		System.out.print("두 번째 숫자 입력: \t");
		int num2 = sc.nextInt();
		int resultNum = md.calc(num1,num2,operator);
		System.out.println(resultNum);
		
		System.out.println("==== 7 문자열 입력 중복값 체크 ====");
		System.out.print("문자열을 입력하세요: ");
		String inputMsg = sc.next();
		String checkResult = md.duplicated(inputMsg);
		System.out.println(checkResult);
	}

}
