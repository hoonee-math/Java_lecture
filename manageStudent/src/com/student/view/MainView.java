package com.student.view;

import java.util.Scanner;

import com.student.model.vo.Student;

public class MainView {	// 1011-4-1
	// 1011-4-10 view 설계
	//1.메뉴를 출력하는 기능
	//2.학생을 입력받는 기능
	//3.메시지를 출력하는 기능
	//4.조회항목을 입력받는 기능
	//5.조회한 결과를 출력해주는 기능
	// 이것들을 메소드로 만들자!

	// 1011-4-11
	//1.메뉴를 출력하는 기능
	public void mainMenu() {
		Scanner sc=new Scanner(System.in); // 공통 영역으로 올려서 써도 되는데, 쓰레기값 버퍼를 지워줘야 하는 번거로움이 생김
		while(true) {
			System.out.println("==== 학생관리 프로그램 v1 ====");
			System.out.println("1. 학생등록");
			System.out.println("2. 학생수정");
			System.out.println("3. 학생삭제");
			System.out.println("4. 전체조회");
			System.out.println("5. 학생 번호로 조회");
			System.out.println("6. 학년으로 조회");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택: ");
			int choiceMenu=sc.nextInt();
			switch(choiceMenu) {
				case 1: System.out.println("개발중...."); break;
				case 2: System.out.println("개발중...."); break;
				case 3: System.out.println("개발중...."); break;
				case 4: System.out.println("개발중...."); break;
				case 5: System.out.println("개발중...."); break;
				case 6: System.out.println("개발중...."); break;
				case 0: System.out.println("프로그램을 종료합니다. :)"); return;
				// return 하면 호출한 곳으로 되돌아감!
				default : break;
			}
		}
	}
	//2.학생을 입력받는 기능
	// return을 받으면 매개변수가 없어도 되고, return이 없으면 매개변수를 채워서 값을..
	
	
	
	
	//3.메시지를 출력하는 기능
	//4.조회항목을 입력받는 기능
	//5.조회한 결과를 출력해주는 기능
	// 이것들을 메소드로 만들자!
	
	
}







