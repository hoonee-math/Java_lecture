package com.bs.practice2.run;

import com.bs.practice2.func.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("실행시킬 함수를 선택하시오: ");
		int funcNum=sc.nextInt();
		System.out.print("======================\n");
		
		switch(funcNum){
			case 1: new CastingPractice1().casting(); break;
//			case 2:
//			case 3:
//			case 4:
//			case 5:
//			case 6:
			default : System.out.println("유효한 값을 입력하세요!");
		}
		
	}
}
