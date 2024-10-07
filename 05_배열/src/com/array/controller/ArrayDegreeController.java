package com.array.controller;

import java.util.Arrays;

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
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
		}
	}
}
