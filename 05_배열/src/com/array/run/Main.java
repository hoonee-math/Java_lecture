package com.array.run;

import java.util.Scanner;

import com.array.controller.ArrayController;
import com.array.controller.ArrayDegreeController;

public class Main {
	public static void main(String[] args) {
		// String 이라는 배열을 선언한것임!
		
		Scanner sc=new Scanner(System.in);
//		System.out.println("배열 실습 / 실행할 메서드를 선택해 주세요: ");
//		int num=sc.nextInt();
		
		
		
//		new ArrayController().arrayTest();
//		new ArrayController().arrayTest2();
//		new ArrayController().arrayBasic2();
//		new ArrayController().arrayCopy();
		new ArrayDegreeController().doubleArray();
	}
}
