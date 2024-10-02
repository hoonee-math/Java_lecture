package com.array.controller;

import java.util.Random;
import java.util.Scanner;

public class ArrayController {
	public void arrayTest() {
		// 기본 배열 활용하기
		// 배열은 그냥 사용할 수 없음
		// 배열은 저장공간을 생성해서 사용해야함! -> 할당!
		//  저장공간을 확보한 다음에, 저장공간을 활용하는 방법
		// 선형구조로 저장 순서가 있음
		// 저장소를 지칭하는 번호가 있음 -> 인덱스!
		//  인덱스는 0부터 시작, 1씩 증가하면서 부여함
		
		// 배열자료형 자료형[] 선언을 함.
		int[] numbers; // int형 배열을 저장하는 변수
		numbers=new int[5]; // 5개의 int형 자료를 저장할 것이라고 선언!
		System.out.println(numbers); // 주소랑 연결되어있는 해시코드 값("[I@5ca881b5")이 출력됨.
		
		// 생성된 배열에 접근하기
		// 배열변수명[인덱스번호]
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		
		// 배열에 값을 저장하기
		numbers[0]=134; // numbers라는 배열의 0번째에 접근함. 거기에 134를 저장함.
		numbers[1]=-1;
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);

		// 선언된 배열 변수의 자료형과 할당한 배열의 자료형이 일치해야 함!
		// double[] dArr=new int[5]; 불가능
		double[] dArr=new double[3];
		char[] chArr=new char[3];
		String[] stArr=new String[4];
		// 자료형별 초기값
		// int: 0
		// double: 0.0
		// char: ' '
		// String: null (S 대문자, 객체는 null이 들어감)
		
//		// 인덱스 번호를 넘어서 접근을 하면??
//		numbers[5]=200; // 코드 작성시 나타나는 에러 : 컴파일 에러, 이건 컴파일 에러가 아님!
//		//java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
		
		// 친구들 3명 이름을 names 배열에 저장하고 출력하기.
		String[] names=new String[3];
		names[0]="유병승";
		names[1]="오민현";
		names[2]="최광훈";
		for(int i=0;i<names.length;i++)
			System.out.print(names[i]+" ");
		System.out.println();
			
		// 숫자를 저장하는 배열을 만들고 1~5까지 저장후 출력하기		
		int[] nums=new int[5];
		nums[0]=1;
		nums[1]=2;
		nums[2]=3;
		nums[3]=4;
		nums[4]=5;
		for(int i=0;i<nums.length;i++)
			System.out.println(nums[i]);

//		// 숫자를 저장하는 배열을 만들고 1~5까지 저장후 출력하기
//		// 배열길이를 직접 선언하기
//		Scanner sc=new Scanner(System.in);
//		System.out.print("배열 길이: ");
//		int arrLength=sc.nextInt();
//		int[] nums=new int[arrLength];
//		for(int i=0;i<nums.length;i++){
//			nums[i]=i+1;
//			System.out.println("nums["+i+"] = "+nums[i]);
//		}
		
		// 배열의 길이를 알려주는 값이 있음
		// 배열명.length / 문자열.length()
		
		// 학색 5명의 이름을 저장할 수 있는 저장공간을 확보하고
		// 입력받은 값으로 이름을 저장 후 출력하기
		// 입력, 출력은 따로 작성
		Scanner sc=new Scanner(System.in);
		System.out.print("입력 받을 학생 수: ");
		int stNum=sc.nextInt();
				
		String[] stName=new String[stNum];
		
		for(int i=0; i<stName.length ; i++) {
			System.out.print("학생 이름: ");
			stName[i]=sc.next();			
		}
		
		for(int j=0; j<stName.length; j++)
			System.out.print(stName[j]+" ");
	}
	public void arrayTest2() {
		// 데이터를 필터, 조회하는 기능(원하는 값을 찾는 기능)
		// 수 10개를 저장활 수 있는 저장공간을 확보하고
		// 10개의 수에 랜덤값 1~100까지의 수를 저장하고
		// 10개의 수 중에서 50보다 큰 수가 몇개인지 출력
		int[] numArr=new int[10];
		Random random = new Random();
		for(int i=0; i<numArr.length; i++) {
			numArr[i]=random.nextInt(100)+1;
			System.out.print(numArr[i]+" ");
		}
		System.out.println();
		int count=0;
		for(int i=0; i<numArr.length; i++) {
			if(numArr[i]>50) count+=1;
		}
		System.out.println("50보다 큰 수는 "+count+"개 있습니다.");
	}
}





