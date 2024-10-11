package com.myobject.run;

import java.util.Arrays;
import java.util.Scanner;

import com.myobject.controller.MethodTest;

public class MyMain {

	public static void main(String[] args) {
		
		System.out.println("==== 1 오늘의 메시지 출력 ====");
		MethodTest md = new MethodTest();
		md.printToday();
		md.oneToTen();
		
		
		System.out.println("==== 3 1부터 사용자가 원하는 수(전달받아서)까지 출력하는 기능 ====");
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력: ");
//		int inputNum = sc.nextInt();
		int inputNum = 5;
		md.oneToInput(inputNum);
		
		int result = md.ontToSumFive();
		System.out.println("md.ontToSumFive() 의 return 값: "+result);
		
		System.out.println("==== 5개의 메시지 반환하기 ====");
		String msgs = md.printMsgs();
		System.out.println(msgs);
		
		System.out.println("==== 5개의 메시지 반환하기 : 배열 버전 ====");
		String[] msgsFive = md.printMsgs5();
		System.out.println(Arrays.toString(msgsFive));
		
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
		
		System.out.println("==== 7 문자열 입력 중복값 체크 ====");
		boolean isCheck = md.duplicated2(inputMsg);
		System.out.println(isCheck?"중복있음":"중복없음");
	}

}
