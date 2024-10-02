package com.repeat.controller;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

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
		
		for(int k=0;k<contents.length();k++) {
			char text=contents.charAt(k);
			
			for(int l=0;l<contents.length();l++) {
				if(k!=l&&text==contents.charAt(l)) {
					is_contain=true;
					break;
				}	
			}
			if(is_contain) break;
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
	
	public void checkDuplicate_teacher() {
		Scanner sc=new Scanner(System.in);
		System.out.print("문자열 : ");
		String text=sc.nextLine();
		
		for(int i=0;i<text.length();i++) {
			char target=text.charAt(i);
			for(int j=0;j<text.length();j++) {
				char compare=text.charAt(j);
				if(i!=j&&target==compare) {
					
				}
			}
			
		}
	}
}









