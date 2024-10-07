package com.array.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
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
		// public void checkNumber()
		int[] numArr=new int[10];
		Random random = new Random();
		for(int i=0; i<numArr.length; i++) {
			numArr[i]=random.nextInt(100)+1;		// Random 객체 활용하는 방법
			numArr[i]=(int)(Math.random()*100)+1;	// Math 클래스 활용하는 방법 
			// Math 클래스는 java.lang 패키지에 포함되어 있어 별도의 import 없이 사용할 수 있습니다.
			// Math는 모든 메서드가 static으로 선언된 유틸리티 클래스입니다. 따라서 객체를 생성하지 않고 클래스 이름으로 직접 메서드를 호출할 수 있습니다.
			System.out.print(numArr[i]+" ");
		}
		System.out.println();
		int count=0;
		for(int i=0; i<numArr.length; i++) {
			if(numArr[i]>50) count+=1;
		}
		System.out.println("50보다 큰 수는 "+count+"개 있습니다.");
	}
	
	public void arrayBasic2() {
		// 배열 선언과 동시에 초기화 하기.
		// 방법1. 자료형[] 변수명={값,값,값} 중괄호에 값을 넣어서 초기화
		// 방법2. 자료형[] 변수명=new 자료형[]{값,값,값,...}
		// example 가나다를 저장한 배열을 생성하기
//		char[] arrChar=new char[3];
		char[] arrChar= {'가','나','다'};
		char ch='가'; // 이런 느낌과 똑같은 거!
		for(int i=0; i<arrChar.length;i++)
			System.out.print(arrChar[i]+" ");
		System.out.println();
		
		double[] height=new double[] {180.5,173.2,163.2,178.4};
		for(int i=0; i<height.length;i++)
			System.out.print(height[i]+" ");
		System.out.println();
		
		
		// {} 중괄호는 배열변수를 선언한 위치에서 초기화할때만 가능
		// 방법1. 잘못된 방법
//		String[] names1;
//		names = {"최광훈","유병승","홍길동"};
		// 방법2. 가능한 방법 
		String[] names2 = {"최광훈","유병승","홍길동"}; // 저장소의 길이를 증가시킬 수 없음
		// 방법3. 가능한 방법, 선언한 이후에 밑에서 다시 사용할 수 있음?! 1007-1325 youtube확인, 
		String[] names3; // 당장은 어떤 값이 들어올지 모르지만, 일단 변수만 선언해놓고, 나중에 값을 넣음. 길이도 나중에 결정됨!
		names3 = new String[] {"최광훈","유병승","홍길동"};
		for(int i=0;i<names3.length;i++) 
			System.out.print(names3[i]+" ");
		System.out.println();
		
		String[] arrString;
		arrString = new String[3];
		System.out.println(Arrays.toString(arrString));
		
		// 배열은 한번 할당되면 변경되지 않는다 -> 길이를 변경할 수 없다.
		// 자바 배열에서는 자동으로 추가해주지 않는다. 자바에서는 더 큰 배열을 선언해서 복사해서 사용! 깊은 복사, 얕은 복사
		System.out.println("배열 names3의 길이: "+names3.length);
//		names3[3]="우민혁";
//		오류 메시지: 
//		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
//		at com.array.controller.ArrayController.arrayBasic2(ArrayController.java:154)
		
		
		// 다수의 데이터를 한번에 저장하고 관리하려고 사용
		// 데이털를 조회, 필터링할때
		int[] numbers= {10,20,30,40,50,60,70};
		int count=0;
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]>50) {
				System.out.print(numbers[i]+" ");
				count++;
			}
		}
		System.out.println("numbers배열 안에 50보다 큰 수는 "+count+"개 있습니다.");
		
		String[] studentName = {"오민현","최광훈","우민혁","오민현","정다인","강성민","이예진","염상균","양성준","김민호","안윤상","김1","김2"};
		// 저장된 학생 중 김씨성을 가진 학생의 수를 구하는 기능 구현
		// 입력받은 성씨를 찾는 기능 구현
		int countName=0;
		for(int i=0;i<studentName.length;i++) {
			char charName = studentName[i].charAt(0);
			if(charName=='김') countName++;
		}
		System.out.println("김씨성을 가진 학생 수는 "+countName+"명 입니다.");
		System.out.println("\n");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("찾을 성을 입력해 주세요: ");
//		char charName1 = sc.next().charAt(0);
		char charName1 = '김';
		String searchName = "";
		for(int i=0;i<studentName.length;i++) {
			char charName = studentName[i].charAt(0);
			if(charName==charName1) {
				System.out.print(studentName[i]+" ");
				searchName+=studentName[i]+" ";
			}
		}
		System.out.println("\n");
		System.out.println(searchName);
		System.out.println("\n");
		
		// 저장된 수 중에서 최댓값과 최솟값을 구하는 기능 구현
		int[] numbers1=new int[10];
		System.out.println("10개짜리 배열 numbers1 : ");
		for(int i=0;i<numbers1.length;i++) {
			numbers1[i]=(int)(Math.random()*201-100);
			System.out.print(numbers1[i]+" ");
		}
		int max=numbers1[0], min=numbers1[0];
		for(int i=0;i<numbers1.length;i++) {
			if(numbers1[i]>=max) max=numbers1[i];
			if(numbers1[i]<=min) min=numbers1[i];
		}
		System.out.println();
		System.out.println("최댓값: "+max+"\n최솟값: "+min);
		
		// 선형자료구조 -> 순서가 있음
		// 정렬: 데이터의 크기에 따라 순서를 바꾸는 것
		// 오름차순, 내림차순 정렬
		int[] testArr= {4,3,6,2,7,5,1};
		
		for(int i=0;i<testArr.length;i++) {
			for(int j=i; j<testArr.length;j++) {
				// j=0 일때 7 6 5 4 3 2 1 출력됨
				// j=i 일때 1 2 3 4 5 6 7 출력됨
				if(testArr[i]>testArr[j]) {
					int t=testArr[i];
					testArr[i]=testArr[j];
					testArr[j]=t;
				}
				System.out.print("");
			}
		}
		for(int i=0;i<testArr.length;i++) {
			System.out.print(testArr[i]+" ");
		}
		System.out.println();
		
		int[] testArr1= {4,3,6,2,7,5,1};
		Arrays.sort(testArr1);
//		List<Integer> numList=Arrays.sort(testArr1);
//		Collections.sort(numList,(pre,next)->pre-next);
		
		for(int i=0;i<testArr1.length;i++) {
			System.out.print(testArr1[i]+" ");
		}
		System.out.println();
	}
	
	public void arrayCopy() {
		// 배열 복사하기
		// 얕은 복사 : 원본 값을 공유하는 방식 -> 주소값을 복사
		// 깊은 복사 : 사본을 생성해서 데이터를 저장 -> 새로운 배열에 저장
		int[] num = {1,2,3,4,5};
		int[] copyNum = num; // 얕은 복사
		
		System.out.println("num : " + Arrays.toString(num));
		System.out.println("copyNum : " + Arrays.toString(copyNum));

		num[0]=100;
		System.out.println("num : " + Arrays.toString(num));
		System.out.println("copyNum : " + Arrays.toString(copyNum));
		
		int[] deepCopyNum = new int[num.length];
		for(int i=0;i<num.length;i++) {
			deepCopyNum[i]=num[i];
		}
		System.out.println("num : " + Arrays.toString(num));
		System.out.println("deepCopyNum : " + Arrays.toString(deepCopyNum));

		num[1]=200;
		System.out.println("num : " + Arrays.toString(num));
		System.out.println("deepCopyNum : " + Arrays.toString(deepCopyNum));
		
		// System.arraycopy(1,2,3,4,5) 기능 이용해서 깊은 복사 하기
		// 원본배열에서 원하는 개수만큼만 복사할 수 있음
		// 첫번째 : 원본배열 변수명(target)
		// 두번째 : 원본배열 시작 인덱스 번호
		// 세번째 : 사본배열 변수명(복사값을 저장할 배열)
		// 네번째 : 사본배열 시작 인덱스 번호
		// 다섯번째 : 복사할 데이터 수
		String[] names = {"유병승","최광훈","오민현","우민혁"};
		String[] copyNames = new String[6];
		System.out.println("전: "+Arrays.toString(copyNames));
		System.arraycopy(names, 1, copyNames, 3, 2);
//		System.arraycopy(names, 2, copyNames, 3, 3); // 오류 메시지: Array Index Out Of Bounds Exception
		System.out.println("후: "+Arrays.toString(copyNames));
		names[1]="김두한";
		System.out.println("names 변경 후 : "+Arrays.toString(copyNames));
		
		copyNames = new String[names.length+3];
		System.arraycopy(names, 0, copyNames, 0, names.length);
		names=copyNames;
		names[4]="김민호";
		System.out.println("공간 증가 : "+Arrays.toString(copyNames));
		
		// clone()이용하기 -> 통째로 복사할때
		String[] cloneCopy = names.clone();
		System.out.println("cloneCopy : "+Arrays.toString(cloneCopy));
	}
	
	
}





