package com.repeat.controller;

import java.util.Random;
import java.util.Scanner;

public class RepeatController {
	public void basicFor() {
		// for 문
		// 특정 코드를 원하는 만큼 반복하여 실행시키는 명령어
		// 
		
//		For(초기식; 조건식; 증감식){반복할 토드(로직)}
//		초기식: 변수선언, 반복횟수 데이터를 저장하는 변수. cpu 가 처리하게 하기 위해서는 초기 데이터를 어딘가에 저장해야함!
//		조건식: for 문의 코드를 실행할지 결정한는 조건 
//				true면 실행, flase면 중단
//				초기식에 선언한 변수를 가지고 조건식을 작성(일반)
//				boolean 초기식에서 선언한 값을 가지고 조건식을 만들어 boolean 을 계산함.		
//		증감식: 초기식에 선언한 변수의 값을 변경하는 연산 작성
//				조건식의 결과가 변경되어야함.
//
//		초기식 -> 조건식 -> 코드 -> 증감식
//			 -> 조건식 -> 코드 -> 증감식
//		 	 -> 조건식 -> 코드 -> 증감식 -> ...
		
		// 안녕하세요 10000번 출력하기
		for(int i=1; i<=10; i++) {
			System.out.println("안녕하세요");
		}
		// 본인 이름 5번 출력하기
		for(int i=0; i<5; i++) {
			System.out.println("최광훈");
		}
		// 규칙적인 숫자에 대한 처리를 할때 반복문이용 가능
		for(int i=0; i<10; i++) {
			System.out.print(i+1+" ");
		}
		// 1~ 100까지 출력하기
		for(int i=0; i<100; i++) {
			System.out.print(i+1+" ");
			if((i+1)%10==0) {
				System.out.println();
			}
		}
		// 반복문의 {} 안에는 모든것을 다 사용할 수 있다.
		// 변수선언, 연산자, 조건문, 반복문, 기능 호출 모두 가능!
		int sum=0;
		for(int i=0; i<3; i++) {
			String temp="안녕";
			if(temp.equals("안녕")) {
				temp+="나도 안녕";
			}
			sum=i;
			System.out.println(temp+" "+i);
		}
		
		// 1부터 100까지의 수 중 짝수만 출력하는 로직
		for(int i=0; i<100; i+=2) {
			System.out.print(i+2+" ");
		}
		System.out.println();
		// 100부터 1까지 출력하기
		for(int i=0; i<100; i++) {
			System.out.print(100-i+" ");
		}
		System.out.println();
	}
	public void inputStudent() {

		// 반 친구들의 이름을 5명 입력받고 출력하는 기능 궇녀
		// public void inputStudent()
		// 입력받은 후 각각 출력하고, 한번에도 출력하기		
		String total_st="";
		for(int i=0; i<5; i++) {
			Scanner sc=new Scanner(System.in);
			System.out.print("친구 이름을 입력하세요: ");
			String student=sc.next();
			System.out.printf("%s라는 친구가 등록되었습니다.",student);

			System.out.println();
			if(i!=0) total_st+=",";
			total_st +=student+" ";			
		}
		System.out.println("등록된 학급 학생들의 명단은 다음과 같습니다: "+total_st);
	}
	public void for2() {
		// for 에 초기식, 존건식, 증감식을 무조건 써야하나?
		// for(초기식; 조건식; 증감식){}
		int i=10;
		for(;i<20;i++) {
			System.out.print(i+" ");
		}
		// 무한루프
		i=10;
		for(;i<20;) {
			System.out.println(i+++" ");
		}
		// 의도적으로 무한루프를 돌릴때, 보통은 while문을 이용함.
		for(;;) {
			System.out.println("무한루프"+i++);
			if(i==100) break;
		}
		//반복문을 동적으로 횟수를 정하기
		//10 -> for(i=0;i<10;i++)
		//5  -> for(i=0;i<5;i++)
		//1  -> for(i=0;i<1;i++)
		Scanner sc=new Scanner(System.in);
		System.out.print("반복횟수: ");
		int count=sc.nextInt();
		for(int j=0,su=10; j<count;j++,su+=10) {
			System.out.print(j+1+"번 실행 ");
			System.out.print("su값은 "+su+"\n");
		}
	}
	
	// 규칙성을 갖는 숫자로 로직 작성할때 사용이 가능!
	// 하나하나씩 접근해서 확인하는 것: 탐색!
	public void for3() {
		String text="이것까지만 하고 끝!";
//		text.charAt(i)
		for(int i=0;i<text.length();i++) {
			System.out.print(i);
			System.out.print("\""+text.charAt(i)+"\"\n");
		}
		
		// 입력받은 문자열에 공백이 있는지 확인하는 기능
		// 입력받은 문자열에 대문자가 있는지
	}
	
	
	// 사용자에게 숫자 5개를 입력받고 숫자의 총합을 출력하는 기능
	// public void sumNumber()
	public void sumNumber() {
		Scanner sc=new Scanner(System.in);
		// 5개의 숫자의 합을 누적할 변수
		int sum=0;
		for(int i=0;i<5;i++) {
			System.out.print("숫자 입력(5번) : ");
			int new_num=sc.nextInt();
			sum+=new_num;			
		}
		System.out.printf("입력한 숫자의 총합은 %s 입니다", sum);
		System.out.println();
		
	}
	
	// 사용자에게 메시지를 입력받고 출력하는 기능
	// 1. 메시지를 5개 입력받고 출력하는 기능
	// 2. 사용자가 exit 입력할때까지 입력받고 출력 기능
	// public void inputMessage()
	public void inputMessage() {
		Scanner sc=new Scanner(System.in);
		// 메시지를 누적할 변수 선언
		String concat_message="";
		
//		for(int i=0;;i++) {
//			System.out.print("메시지 입력: ");
//			String mes=sc.next();
//			System.out.printf("등록된 메시지: %s \n",mes);
//			
//			if(mes.equals("exit")) break;
//			
//			if(i!=0) concat_message+=",";
//			concat_message+=mes;
//			
//		}
		for(String str="";!str.equals("exit");) {
			System.out.print("메세지: ");
			str=sc.nextLine();
			if(!str.equals("exit")) concat_message+=str+"\n";
//			concat_message+=str+"\n";
		}
		System.out.println(concat_message);
	}
	
	// 사원정보를 입력받는 기능 구현
	// 입력정보: 이름, 나이, 성별, 급여, 보너스
	// 아이디 admin 패스워드 1234 인증받은사람만 등록가능
	// 아이디 패스워드가 일치하지않으면 "입력할 수 없습니다" 출력
	// 출력예) 유병승 19 남 100 0.5
	//		 홍길동 24 남 50  0.4
	// 버전업 사용자가 원하는 만큼 사원 입력 받기로 업그레이드
	// public void empInputData()
	public void empInputData() {
		
		String name="", gender="", id="", pw="";
		int age=0, income=0, bonus=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("=== 사원 정보 등록 프로그램 ===");
		
		// ID PW 입력받기
		System.out.print("관리자 로그인 ID: ");
		id=sc.next();
		System.out.print("관리자 로그인 PW: ");
		pw=sc.next();
		
		// ID PW 유효성 검사 후 코드 실행
		if(id.equals("admin")&&pw.equals("1234")) {
			
			
			System.out.print("이름: ");
			name=sc.next();
			System.out.print("나이: ");
			age=sc.nextInt();
			System.out.print("성별(남/여): ");
			gender=sc.next();
			System.out.print("급여: ");
			income=sc.nextInt();
			System.out.print("보너스: ");
			bonus=sc.nextInt();
			
		} else {
			System.out.println("관리자가 아닙니다. 입력할 수 없습니다.");
			empInputData();
		}
		System.out.print("등록정보: ");
		System.out.println(name+" "+age+" "+gender+" "+income+" "+bonus);
		// 출력예) 유병승 19 남 100 0.5
	}
	
	// 문자열을 입력받고 그 문자열에 알파벳이 있는지 확인하는 기능 구현
//	public void checkAlphabet() {
//		Scanner sc=new Scanner(System.in);
//		System.out.print("문자열 입력: ");
//		String text=sc.nextLine();
//		
//		System.out.print("찾을 문자: ");
//		int totalAlpha=0;
//		char findAlpha=sc.next().charAt(0);
//		for(int i=0;i<text.length();i++) { // 탐색!!
//			if(text.charAt(i)==findAlpha) {
//				totalAlpha+=1;				
//			}
//		}
//		if(totalAlpha>0) {
//			System.out.printf("%s라는 문자는 총 %d개 있습니다.",findAlpha, totalAlpha);
//		} else {
//			System.out.println("문자열에는 찾는 문자가 포함되어 있지 않습니다.");
//		}
//	}
	
	public void checkAlpha() {
		Scanner sc=new Scanner(System.in);
		System.out.print("문자열 입력: ");
		String text=sc.nextLine();
		String result="없다";
		for(int i=0; i<text.length();i++) {
			char ch=text.charAt(i);
			if((ch>='A'&&ch<='Z')||('a'<=ch&&ch<='z')) {
				result="있다";
			}		
		}
		System.out.println(result);
	}
	
	public void forInFor() {
		// 중첩 반복문 이용하기
		// for{} 안에 for{}를 선언
		// 구구단
		for(int i=2;i<=9;i++) {
			System.out.println(i+"단");
			for(int j=1;j<=9;j++)
				System.out.printf("%d x %d = %d\n",i,j,i*j);
		}		
	}
	// 문자열에 중복값이 있는지 확인하는 기능
	// 어떤 값을 정렬하는 기능을 구현할 때.
	
	public void forInFor2() {
		String test="apple";
		for(int i=0;i<test.length();i++) {
			System.out.println(test.charAt(i));
			char target=test.charAt(i);
			int count=0;
			for(int j=0;j<test.length();j++) {
				//중복값을 확인하는 로직
				
				if(i!=j&&target==test.charAt(j)) {
					count++;
				}
			}
//			System.out.println();
			if(count>0) {
				System.out.printf(target+"은 중복값 %d개 있음!"+"\n",count);
			}
		}
	}
	
	public void forInFor3() {
		for(int m=0;m<4;m++) {
			for(int n=0;n<m+1;n++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//public void checkDuplicate()
	// 문자열을 입력받아 입력받은 문자열의 중복값이 있는지 확인하는 기능
	// 1. 중복값이 있으면 있다. 없으면 없다!
	// 2. 어떤 값이 몇개 중복하는지 출력
	public void checkDuplicate() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하시오: ");
		String contents=sc.nextLine();
		System.out.println();
		
		int countAll=0;
		boolean is_contain=false;
		
		teacher: //teacher 라는 id 를 선언함! for 문에 이름이 붙음!
		for(int k=0;k<contents.length();k++) {
			char text=contents.charAt(k);
			
			for(int l=0;l<contents.length();l++) {
				if(k!=l&&text==contents.charAt(l)) {
					is_contain=true;
					break teacher;
				}	
			}
		}
		System.out.println(is_contain?"있다.":"없다.");
		System.out.println();

		if(is_contain) {
			for(int i=0;i<contents.length();i++) {
				char text=contents.charAt(i);
				int count=0;
				
				for(int j=0;j<contents.length();j++) {
					if(i!=j&&text==contents.charAt(j)) {
						count++;
					}
				}
				if(count>0) {
					System.out.printf("%d번째 문자 %s의 중복 확인: ",i,text);
					System.out.printf("%s는 총 %d번 반복됩니다."+"\n", text, count);
				}
			}
		}
	}
	
	public void whileTest() {
		//while 활용하기
		// 반복문을 구현하는 방법 중 하나
		// 강의중 설명중에 대괄호가 있으면 생략 가능
		// while(조건식) { 로직 [증감식] *while 을 벗어나는 구문 작성 }
		// 특정 조건에 의해 반복문을 빠져나갈때 많이 사용
		// 의도적인 무한루프를 실행할 때
		// 1~10까지 출력하기
		for(int i=0; i<10; i++) {
			System.out.print(i+1);
		}
		System.out.println();
		
		int n=0;
		while(n<10) {
			System.out.print(n+1);
			n++;
		}
		System.out.println();
		
		// 사용자가 끝이라고 입력할때까지 메시지를 입력받기
		Scanner sc=new Scanner(System.in);
		String msg="", str="";//사용자가 입력할 문구 저장
		while(!msg.equals("끝")) {
			System.out.print("메시지: ");
			msg=sc.nextLine();
			if(!msg.equals("끝")) str+=msg;
		}
		System.out.println(str);
		
		//사용자가 3의 배수를 입력할때까지 숫자 입력받기
		int is_3=1;
		while(!(is_3%3==0)) {
			System.out.print("수 입력: ");
			is_3=sc.nextInt();
		}
		System.out.println("3의 배수가 입력되어 종료되었습니다.");
		
	}
	public void whileTest2() {
		Scanner sc= new Scanner(System.in);
		
		int count=0;
		while(true) {
			System.out.print(count+" ");
			if(count++==10) break;
		}
		System.out.println();
		
		int choice=0;
		while(choice!=9	) {
			System.out.println("=== 점심 메뉴 ===");
			System.out.println("1. 구내식당");
			System.out.println("2. 김밤");
			System.out.println("3. 볶음밥");
			System.out.println("9. 주문종료");
			System.out.print("입력: ");
			choice=sc.nextInt();
		}
	}
	
	// do~while
	// do{ 반복할 로직 }while( 조건식 );
	// do 안의 반복문을 실행한 다음에 while의 조건을 확인함! do 안의 로직은 무조건 한 번 실행함.
	// 처음 조건식이 false 일때, 무조건 한번은 do에의해 실행시킬때 이용. 조건식이 true이면 do를 실행
	public void doWhileTest() {
		Scanner sc=new Scanner(System.in);
		boolean flag=false;
		
		while(flag) { //while 이 실행되지 않음
			System.out.println("while 문 실행");
		}
		
		do {	// do while 에서는 do 부분이 무조건 한 번은 실행됨.
			System.out.println("do~while문 실행");
			String msg=sc.nextLine();
//		}while(msg.equals("끝")); // 이렇게 사용할 수 없다. msg라는 변수는 do 안에서만 사용할 수 있다.	
		}while(flag);
	}
	
	// 주문받는 프로그램 만들기
	// 1. 아메리카노 3000
	// 2. 카페라떼 4000
	// 3. 카페모가 4500
	// 4. 자바칩 프라푸치노 7000
	// 0. 주문종료
	// 원하는 메뉴를 모두 주문받고(음료 갯수 포함)
	// 주문 결과(메뉴, 갯수)와 총 금액을 출력해주는 기능을 구현
	public void coffeeOrder() {
		Scanner sc=new Scanner(System.in);
		System.out.println("=== 커피를 주문하시겠습니까 ===");
		System.out.println("1. 아메리카노 3000");
		System.out.println("2. 카페라떼 4000");
		System.out.println("3. 카페모가 4500");
		System.out.println("4. 자바칩 프라푸치노 7000");
		System.out.println("0. 주문종료");
		
		int order=0, scale=0, total=0;
		String orderList=""; // 1421 -> 1번 4개, 2번 1개 주문 받기 (홀수번째:메뉴/짝수번째:수량)
		String result="";
		
		// do while문 이용해서 메뉴와 수량 계속 입력 받기
		do {
			System.out.print("메뉴 선택: ");
			order = sc.nextInt();
			orderList+=(order==0?"":order);
			
			if(order==0) break;
			
			System.out.print("수량: ");
			scale = sc.nextInt();
			orderList+=(order==0?"":scale);
			
			// 계속 메뉴를 받다가 "메뉴 선택:"에서 0을 입력받으면 계산 시작(for문 계산 실행)
		}while(order!=0);
		
		for(int i=0;i<orderList.length();i+=2) {
			
			String menu="";
			int menuPrice=0;
			order=(int)(orderList.charAt(i)-'0');
			scale=(int)(orderList.charAt(i+1)-'0');
			
			switch(order) {
			case 1 : total+=3000*scale; menu="아메리카노"; menuPrice=3000*scale; break; //아메리카노 3000원 누적
			case 2 : total+=4000*scale; menu="카페라떼"; menuPrice=4000*scale; break;
			case 3 : total+=4500*scale; menu="카페모카"; menuPrice=4500*scale; break;
			case 4 : total+=7000*scale; menu="자바칩 프라푸치노"; menuPrice=7000*scale; break;
			default : break;
			}
			result+=menu+" "+scale+"잔"+"\n";
			System.out.println(menu+" "+scale+"개 주문, 총 "+menuPrice+"원");
		}
		System.out.println(result);
		System.out.println("총 주문 금액은 "+total+"원 입니다.");	
	}
	
	public void breakContinueTest() {
		// 분기문 활용하기
		// continue : 반복문에서 continue 문을 만나면, 그 line 아래 코드 전체를 생략하고
		//			  증감식으로 넘어감!
		// break	: 반복문에서 break 문을 만나면, for 문이 종료됨.
		// 조건문과 같이 사용함!
		for(int i=0;i<10;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=0;i<10;i++) {
			if(i%3==0) {
				continue;
			}
			System.out.print(i+" ");
		}
		for(int i=0;i<10;i++) {
			System.out.println("실행되니?");
			if(i%3==0) {
				break;
			}
			System.out.print(i+" ");
		}

		// 중첩 반복문에서 사용하기
		forT:
		for(int i=2;i<10;i++) {
			System.out.println("===="+i+"단"+"====");
			for(int j=1;j<10;j++) {
				if(j==5) break forT; //내부 for 문만 중단됨. 바깥쪽 반복문은 다시 실행됨.
				System.out.print(i+"X"+j+"="+(i*j)+" ");
			}
			System.out.println();
//			if(i==5) break; //break 가 포함된 for 문이 중담됨.
		}
	}
	
	// 자바에서 랜덤값(숫자) 출력하기
	// 1. Math.random() 이용
	// 2. Random 클래스의 기능을 이용
	// 0~1 사이의 값을 출력(실수) -> 정수로 변경해서 사용
	public void randomNumber() {
		//Math.random();
		// 정수로 바꾸기
		// (int)(Math.random()*정수) 	-> 0~(정수-1) 의 범위의 랜덤 숫자가 출력됨
		// (int)(Math.random()*9)	-> 0~8까지 랜덤숫자
		// (int)(Math.random()*9)+1 -> 1~9까지 랜덤숫자
		for(int i=0;i<3;i++) {
//			System.out.println(Math.random());
			System.out.println((int)(Math.random()*10));
		}
		
		// Random 이라는 클래스(클래스는 기능을 포함함)
		Random random=new Random(); // ctrl+shift+O
		System.out.println(random.nextInt());
		System.out.println(random.nextInt(10)); // 0~9
		System.out.println(random.nextInt(10)+1); // 1~10
	}
	
}









