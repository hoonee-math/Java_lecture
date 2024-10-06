package com.bs.practice.chap02.run;

import java.util.Scanner;

import com.bs.practice.chap02.loop.LoopPractice;
import com.bs.practice.chap02.loop.Supplementary;


public class Run {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("반복문 실습 / 실행할 함수 번호를 입력하세요: ");
		int num=sc.nextInt();
		
		switch(num) {
			case 1 : new LoopPractice().practice1(); break;
			case 2 : new LoopPractice().practice2(); break;
			case 3 : new LoopPractice().practice3(); break;
			case 4 : new LoopPractice().practice4(); break;
			case 5 : new LoopPractice().practice5(); break;
			case 6 : new LoopPractice().practice6(); break;
			case 7 : new LoopPractice().practice7(); break;
			case 8 : new LoopPractice().practice8(); break;
			case 9 : new LoopPractice().practice9(); break;
			case 10 : new LoopPractice().practice10(); break;
			case 11 : new LoopPractice().practice11(); break;
			case 12 : new LoopPractice().practice12(); break;
			case 13 : new LoopPractice().practice13(); break;
			case 14 : new LoopPractice().practice14(); break;
			case 21 : new Supplementary().rockScissorsPaper(); break;
			
			default : System.out.println("유효한 값을 입력하세요!");
		}
		
	}
}
