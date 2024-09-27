package com.my.controller;

import java.util.Scanner;

public class MyScannerTest {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
//		System.out.print("이름:");
//		String name = sc.next();
//		System.out.print("나이:");
//		int age = sc.nextInt();		
//		System.out.print("성병(남/여):");
//		char gender = sc.next().charAt(0);
//		
//		System.out.printf("%s(%c)님 안녕하세요. 당신의 나이는 %d 이군요!\n", name, gender,age);
		
		
//		System.out.print("학년:");
//		int grade = sc.nextInt();
//		System.out.print("반:");
//		int classN = sc.nextInt();
//		System.out.print("번호:");
//		int studentN = sc.nextInt();
//		
//		System.out.printf("당신의 학번은 %d%d%d 이군요", grade, classN, studentN);
		
		
		System.out.print("키:");
		double height = sc.nextDouble();
		
		sc.nextLine();
		System.out.print("주소:");
		String address = sc.nextLine();
				
		System.out.print("이메일:");
		String mail = sc.next();
		
		System.out.printf("당신의 개인정보를 확인해주세요.\n키:%.1f\n주소:%s\n이메일:%s",height, address,mail);
		

//		// 어떤 메서드를 사용할지 고민하기!
//		// 이렇게 어떤 변수를 사용할지 먼저 고민하기
//		String nameS, addressS, email, genderS;
//		int ageS, gradeS, classS, studentNumber;
//		double heightS;
//		
	}

}
