package com.condition.controller;

import java.util.Scanner;

public class ConditionController {

	Scanner sc= new Scanner(System.in);

	public void ifTest() {
		// 기본 if 활용하기
		// if(조건식-true/false 값을 갖는 연산){조건식이 true 일때 실행할 로직}
		// {} 안에는 변수선언, 기능호출, 연산자, 조건문, 반복문 모두 사용 가능
		if(100>10) {
			boolean is_true;
			is_true = 100>10;
			System.out.printf("10은 100보다 크냐? %b \n",is_true);
		}
		System.out.println("if문 밖에 있는 구문은 if에 영향을 받지 않아요.");
		

		System.out.print("수입력: ");
		int inputNum=sc.nextInt();
				
		// 입력받은 수가 200이면 월요병을 출력
		if(inputNum==200){
			System.out.println("월요병");
		}
		
		// 입력받은 수가 100~200 사이 값이면 "정상 데이터 입력"을 출력
		// if 문의 {} 안에는 변수선언, 연산을 할 수 있다.
		// 입력한 변수에 100을 누적하기
		if(inputNum>=100 && inputNum<=200) {
			System.out.println("이 값은 100이상 200이하의 값입니다.");
			// if 문 외분에 선언한 변수를 if{} 내부에서 이용할 수 있다.
			inputNum += 100;
			// if 문 내부에서 변수선언하기. 
			// 내부에서 선언한 변수는 외부에서 이용할 수 없음!
			String name="최광훈";
			System.out.println(name);
		} else {
			System.out.println("이 값은 100이상 200이하의 수가 아닙니다.");
		}
		System.out.printf("inputNum값이 100~200사이의 값이면 100이 합산되어 %d입니다.", inputNum);
		
	}
	
	// public void checkNumber()
	// 수를 입력받아 5의 배수이면 5의 배수입니다 출력하는 기능
	public void checkNumber() {
		System.out.print("수 입력 :");
		int checkNum=sc.nextInt();
		if(checkNum%5==0) {
			System.out.println("5의 배수입니다.");
		}
	}
	
	// public void testName()
	// 입력된 이름이 본인 이름과 같은면 코딩천재!! 출력하는 기능
	public void testName() {
		System.out.print("이름 입력: ");
		String name=sc.next();
		if(name.equals("최광훈")) {
			System.out.println("코딩천재!");
		}
	}
	
	// public void loginCheck()
	// 아이디와 패스워드를 입력받고 아이디가 user01, 패스워드가 2222이면 로그인 성공 출력하는 기능
	public void loginCheck() {
		System.out.print("ID: ");
		String id=sc.next();
		System.out.print("PW: ");
		String pw=sc.next();
		if(id=="user01"&&pw=="2222") {
			System.out.println("로그인 성공");
		}
	}
	
	public void ifelseTest() {
		//if~else 문 활용하기
		//if(조건식){true 일때 실행할 로직}else{false 일때 실행할 로직}
		//특정 수가 음수인지 양수인지 판단하는 기능
		System.out.print("수 입력: ");
		int num=sc.nextInt();
		
		if(num>=0) {
			System.out.println("양수");
			num+=100;
		} else { 
			System.out.println("음수");
			num-=100;
		}
		System.out.println(num);
		// else 문은 단독으로 쓰일 수 없음
		// 사용자가 입력한 값이 양수면 100을 더하고 음수면 100을 빼기
		// 결과를 출력하기
	}
	
	// public void enrollMember()
	// 성년이면 회원정보를 입력받아 내용을 출력하고
	// 이름, 나이, 성별, 키
	// 회원정보 : ---님 --살 - ---.--cm
	// 미성년이면 회원가입이 불가능하다를 출력하는 기능
	public void enrollMember() {
		System.out.print("====회원가입====\n성인인가요(y/n) : ");
		String is_adult=sc.next();
		String name, gender;
		int age;
		double height;
		
		if(is_adult.equals("y")) {
			System.out.print("이름: ");
			name = sc.next();
			System.out.print("나이: ");
			age = sc.nextInt();
			System.out.print("성별: ");
			gender = sc.next();
			System.out.print("키: ");
			height = sc.nextDouble();
			System.out.printf("회원정보: %s님 %d살 %s자 %.1fcm", name, age, gender, height);
		} else {
			System.out.println("회원가입이 불가능합니다.");
		}
	}

	public void ifelseifelseTest() {
		//if~ else if~ else if~ else 구분 이용하기
		//처리할 조건이 여러개일때 사용하는 구무
		//계절을 확인하거나 학생별로 기능을 구현할때
		Scanner sc=new Scanner(System.in);
		System.out.print("계절을 확인할 달: ");
		int month=sc.nextInt();
		if(month%12<=2 && month<=12) {
			System.out.println("겨울하면 보드타러 gogo!");
		} else if(month<=5) {
			System.out.println("봄에는 spring을 배워야지.");
		} else if(month<=8) {
			System.out.println("여름에는 서핑을 가야지");
		} else if(month<=11) {
			System.out.println("가을에는 단풍구경!");
		} else {
			System.out.println("없는 달 입니다. \n1~12까지만 입력 가능합니다.");
		}
	}
	
	// 성적에 대한 등급을 출력해주는 기능 구현
	
	public void scoreGrade() {
		Scanner sc=new Scanner(System.in);
		System.out.println("===등급 산출 프로그램===");
		System.out.print("점수를 입력하세요: ");
		double score=sc.nextDouble();
		
//		if(score>100||score<0) {
//			System.out.println("점수를 정확히 입력하세요!");		
//		}else if(score>=90) {
//			System.out.println("A 등급 입니다.");			
//		} else if(score>=80) {
//			System.out.println("B 등급 입니다.");			
//		} else if(score>=70) {
//			System.out.println("C 등급 입니다.");			
//		} else if(score>=60) {
//			System.out.println("D 등급 입니다.");			
//		} else {
//			System.out.println("F 등급 입니다.");			
//		}
//		
		char grade=' ';
		if(score>100||score<0) {
			System.out.println("점수를 정확히 입력하세요!");		
		} else if(score>=90) {
			grade='A';
		} else if(score>=80) {
			grade='B';		
		} else if(score>=70) {
			grade='C';	
		} else if(score>=60) {
			grade='D';	
		} else {
			grade='F';
		}
		if(score<=100&&score>=0) {
			System.out.printf("당신은 %c등급입니다.", grade);
		}
	}
	
	
}
