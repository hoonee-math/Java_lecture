package com.array.controller;

import java.util.Arrays;
import java.util.Random;
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
		
		// for(변수선언 : 배열(List,Set))
		for(int n : intArr) {
			System.out.print(n);
		}
		System.out.println();
		
		String[] names= {"핑크퐁","등골핑","파산핑","피카츄"};
		for(String name : names) {
			if(name.equals("등골핑"))
				System.out.print(name+" ");
			System.out.println();
			if(name.charAt(2)=='핑')
				System.out.print(name+" ");
		}
		System.out.println();
		System.out.println();
		
		Arrays.stream(names).forEach(System.out::print);
		System.out.println();
		System.out.println();
		
		// 배열에 저장된 데이터를 수정할 때는 사용할 수 없다.
		for(String name : names) {
			if(name.equals("티니핑")) {
				name="시X핑";				// name에는 배열에서 각 값을 받아와서 잠시 저장해두는 지역변수이다. 이 저장소에 데이터를 바꾼다고 해서 배열의 데이터가 수정되지 않음
			}
		}
		for(String name : names) {
			System.out.print(name+" ");	// 위에서 "시X핑"으로 바꿨지만, 실제로는 바뀌지 않은 것을 확인할 수 있음.
		}
		System.out.println();
		
		
		// 배열에 저장된 데이터를 전체순회, 필터해서 출력할 때
		
		// 2차원 배열에서 순회할 수 있을까?
		int[][] number2 = {{1,2,3,4},{5,6,7,8}};
		for(int[] first : number2) {
			for(int num : first) {
				System.out.print(num);
			}
			System.out.println();
		}
		
		// 정수 5개를 저장할 수 있는 배열에 1~10까지의 랜덤값을 저장
		// 조건: 중복값 없이 저장해야함
		Random random=new Random();
		int[] fiveNum=new int[5];
		for(int i=0;i<fiveNum.length;i++) {
			fiveNum[i]=random.nextInt(10)+1;
			
			for(int j=0; j<i;j++) {
				if(fiveNum[i]==fiveNum[j]) {
//					fiveNum[i]=random.nextInt(10)+1;
//					j=0;
					i--;
					break;
				}
			}
		}
		for(int n : fiveNum) {
			System.out.print(n+" ");
		}
		System.out.println();
	}
	
}

























