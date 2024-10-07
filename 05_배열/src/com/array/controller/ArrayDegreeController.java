package com.array.controller;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDegreeController {
	// heap 영역에 무언가 만들때는 new 와 함께 사용한다.
	// 2차원 배열을 만들때는 heap 영역에서 행주소의 주소값을 저장하는 영역이 생성되고
	// 각 주소값이 저장되어있는 영역에 실제 데이터들이 저장된다.

	public void doubleArray() {
		// 2차원 배열 활용하기
		// 배열 저장소가 두개 연결되어있는 구조
		// 바둑판식 구조로 저장 되어있다고 생각
		int[][] intArr;
		intArr = new int[3][3];
		System.out.println(intArr);
		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
		System.out.println(intArr[0][1]);
		System.out.println(Arrays.toString(intArr));

		// 이차원 배열에 값 저장하기
		intArr[0][0] = 1;
		intArr[0][1] = 2;
		for (int i = 0; i < intArr.length; i++) {
			for (int j = 0; j < intArr[i].length; j++) {
				System.out.print(intArr[i][j] + " ");
//				if(j==intArr[i].length-1) System.out.println();
			}
			System.out.println();
		}

		// 5*5 int형 배열을 생성하고
		// 12345
		// 12345
		// 12345
		// 12345
		// 12345
		int[][] five = new int[5][5];
		for (int i = 0; i < five.length; i++) {
			for (int j = 0; j < five[i].length; j++) {
				five[i][j] = j + 1;
				System.out.print(five[i][j]);
			}
			System.out.println();
		}
		
		
		// 1 2 3 4
		// 5 6 7 8
		// 9 10 11 12
		int[][] numbers = new int[3][4];
		for(int i = 0; i< numbers.length; i++) {
			for(int j = 0; j < numbers[i].length; j++) {
				numbers[i][j] = i*4+j+1;
				System.out.print(numbers[i][j]+"\t");
			}
			System.out.println();
		}
		
		// 선언과 동시에 초기화
		String[][] test = {{"가","나","다"},{"A","B","C"}};
		test[0] = new String[] {"안녕", "하이","곤니찌와"};
		
		// 가변배열 선언하기 - 각 행별로 서로 다른 열의 데이터 저장소를 가질 수 있음.
		String[][] category = new String[4][];
		category[0] = new String[3];
		category[1]	= new String[10];
		
		String[][] study = {
				{"오민현","최광훈"},
				{"유병승","우민혁"},
				{"이민영","정다인"},
				{"이예진","염상균"},
				{"강성민","안윤상"},
				{"양성준","김민호"}
				};
		// 1. 정다인님의 저장 위치를 출력하고 짝궁의 이름 출력하기
		// 	출력:  정다인님은 0번째 행, 0번째 열에 있습니다.
		//		  짝꿍은 이민영님입니다.
		// 2. 이름을 입력받아 저장위치를 출력, 없는 사람이면 없는 사람입니다. 출력
		
		for(int i=0;i<study.length;i++) {
			for(int j=0; j<study[i].length; j++) {
				if(study[i][j].equals("정다인")) {
					System.out.printf("정다인님의 위치는 %d행 %d열에 있습니다.",i,j);
					System.out.printf("짝궁은 %s 입니다.",study[i][(j+1)%2]);}
			}
		}
		System.out.println("\n");
		
		System.out.print("찾을 이름: ");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		boolean isName=false;
		
		nameFor:
		for(int i=0;i<study.length;i++) {
			for(int j=0; j<study[i].length; j++) {
				if(study[i][j].equals(name)) {
					System.out.printf("%s님의 위치는 %d행 %d열에 있습니다.\n",name,i,j);
					System.out.printf("짝궁은 %s 입니다.",study[i][(j+1)%2]);
					isName=true;
					break nameFor;
				}
			}			
		}
		if(!isName) System.out.println("없는 사람입니다.");
	}
	public void extraTest() {
		// 배열 데이터를 쉽게 탐색하기
		// forEach 활용하기 - 배열에 있는 데이터를 쉽게 탐색하기
		int[] intArr = {1,2,3,4,5};
		for(int i=0; i<intArr.length;i++) {
			System.out.print(intArr[i]+" ");
		}
		System.out.println();
		
		for(int n : intArr) {
			System.out.print(n);
		}
		
	}
	
}

























