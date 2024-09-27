package com.bs.controller;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		// Scanner 클래스를 이용해서 사용자가 입력한 값
		// 키보드로 입력한 값을 받는 기능
		// 1. java.util.Scanner 를 import
		// 	import java.util.Scanner; // 패키지와 class 선언부 사이에 import
		// 2. class 생성하기 new 연산자 이용
		// 	Scanner sc=new Scanner(System.in);
		// 3. 생성된 Scanner 가 제공하는 기능을 이용해서 입력값을 받아오기
		// 	nextInt() : 		// 정수형(int)값을 가져올때 사용
		// 	nextDouble() :	// 실수형(double)값을 가져올때 사용
		// 	next() :			// 문자열(String), 입력한 문자열의 띄어쓰기 전까지
		// 	nextLine() :		// 문자열(String), 입력한 문자열의 개행 전까지
		// 	문자(char)가져오기 : nextChar 라는것은 없음. next().charAt(0);
		
		Scanner sc=new Scanner(System.in);
		System.out.print("나이를 입력하세요: ");
		int age=sc.nextInt();
		
		
		System.out.print("키: ");
		double height=sc.nextDouble();
		
		sc.nextLine();		
		System.out.print("이름을 입력하세요: ");
		String name=sc.nextLine();	// 여기서 sc.nextLine()으로 입력받으려고 시도하면 제대로 입력을 받지 않음.
		System.out.printf("당신의 이름은 %s 이고 나이는 %d살 이군요!", name, age);
		
		
		
	}
	
	// myproject 프로젝트에서
	// com.my.controller.MyScannerTest
	// 이름, 나이, 성별(남/여), 학년, 반, 번호, 키, 주소, 이메일
	// 입력받고, 입력한 내용을 추력하기
	// 1. 입력한 값을 입력받고 바로 출력
	// 2. 입력한 값을 다 입력 받은 후 한번에 모두 출력
}
