package com.obj.run;

import com.obj.model.vo.FieldTest;
import com.obj.model.vo.PublicTestClass;

// 7_객체 28/51
public class FieldMain {

	public static void main(String[] args) {
		//FieldTest 이용하기
		// 이용하려면 생성을 해야함.
		FieldTest ft=new FieldTest();	
		// stack 영역에 ft가 생기고 ft에 0x11과 같은 주소가 저장된 0x11과 연결되어있는 객체는 heap영역에 생성됨(num, name, weigth 저장소가 생성됨)
		
		// 생성된 객체에 접근하려면 접근 연산자를 사용해야 함.
		// 배열에서는 [] 안에 index번호를 이용해서 접근했던 것 처럼
		// 여기서는 . 이라는 연산자를 이용해서 접근한다.
		//  ft.필드명 >>> 직접 접근이라고 함. (FieldTest.java 파일 13번째 줄 // 이용가능: 객체로 직접 접근해서 이용하는 것을 의미함)
		ft.num=100;		// public int num;
		System.out.println(ft.num);
//		// public 접근 제한자를 사용한 필드는 다른패키지에서
//		//	직접 접근 가능
//		// default 접근 제한자를 선언한 필드는 다른 패키지에서
//		// 	직접 접근 불가 -> error not visible
//		ft.name="최광훈";	// String name;
//		// private 접근 제한자를 선언한 필드는 다른 패키지에서
//		// 	직접 접근 불가 -> error not visible
//		ft.weigth=56.2; // private double weight;

		FieldTest ft1=new FieldTest();
		System.out.println(ft1.num);
		
		System.out.println(ft.AGE);
//		ft.AGE=20; //error : The final field FieldTest.AGE cannot be assigned
	
		ft.numbers=new int[10]; // 여기서 선언할 수 있음 2024.10.08 13:22
////		ft.numbers= {1,2,3,4,5}; // 이렇게 사용 못함. 선언과 동시에 초기화가 아님..? 앞에 new int를 써줘야함.
		ft.numbers= new int[] {1,2,3,4,5};
		ft.numbers[0]=123;
//		가장 많이 보게될 오류 메시지 error message
// 		Exception in thread "main" java.lang.NullPointerException: Cannot store to int array because "ft.numbers" is null
//		 at com.obj.run.FieldMain.main(FieldMain.java:35)
//		java.lang.NullPointerException 앞에 주소가 나와야하는데 주소가 아니라 null 이 들어가 있을 때, 참조형 자료형 같은 경우에 기본값이 null 임.

		for(int i=0;i<ft.numbers.length;i++) {	// . 은 접근 연산자
			System.out.print(ft.numbers[i] + " ");
		}
		ft.ptc=new PublicTestClass();
		ft.ptc.data="졸지마요! 정신차려요!"; 
		// "ft.ptc=new PublicTestClass();" 이걸 쓰지 않고(객체를 만들지 않고 사용하지 않으면) 런타임 오류가 생기게 됨! 241008-1332
		// ptc는 클래스! 클래스는 클래스 자체로 이용못함. 객체로 생성해야지만 사용할 수 있음. 
		// 컴파일 시점의 에러를 출력해주지 않음. 실행(런타임)시점 에러가 발생함. 점찍어서 객체를 실행할때는 그 객체가 잘 만들어졌는지 확인을 하자!
		
		new FieldTest().num=200;	// new를 할 때마다 똑같은 클래스(설계도면)를 토대로 새로 객체를 생성함! heap에서 새성됨. heap 영역은 개발자가 직접 닫아줘야함. c에서는 소멸자가 있음. java에서는 gc를 만들었음. new 할 때마다 생성되고 남아있던 heap 영역 저장공간이 꽉 차면 리소스 부족현상 발생. gc로 삭제해줘야함.
		System.out.println(new FieldTest().num);
	}

}



