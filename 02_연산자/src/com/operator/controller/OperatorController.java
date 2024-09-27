package com.operator.controller;

import java.util.Scanner;

// 연산자를 테스트하는 class
// 기능을 제공하는 class
public class OperatorController {
	public void singleOp() {
		// 단항 연산자
		// 1. 부정 연산자 -> boolean 값을 반전시킴
		//	!변수명(boolean) // 이렇게 사용하는 경우는 많지 않음
		//	!기능호출()
		//	!비교연산
		System.out.println("==== 부정 연산자 ====");
		boolean flag=true;
		System.out.println("flag:"+flag);
		System.out.println("!flag:"+!flag); // 이렇게 사용하는 경우는 거의 없음
		
		System.out.println(!"최광훈".contains("훈"));
		
		System.out.println(10>0);
		
		// 2. 증가, 감소 연산
		// 	증가연산: 변수에 있는 값(정수)을 1증가시키고, 다시 변수에 저장
		// 	감소연산: 변수에 있는 값(정수)을 1감소시키고, 다시 변수에 저장
		//  변수명++(후위연산), ++변수명(전위연산)
		// 	변수명--, --변수명
		int plusNum=0, minusNum=0;
		plusNum++; // plusNum = plusNum+1;
		plusNum++; 
		plusNum++; 
		System.out.println(plusNum);
		plusNum--;
		System.out.println(plusNum);
		// 증가, 감소 연산을 단독으로 사용할때는 전위,후위 연산의 차이가 없음.
		// 다른 연산과 같이 사용했을 때는 차이가 발생함.
		int number=0;
		int result=number++;
		System.out.println("전위 result : "+result+"\n전위 number : "+number);
		number=0;
		result=++number;
		System.out.println("후위 result : "+result+"\n후위 number : "+number);

		number=1;
		result=number+++20;
		System.out.println("result=number+++20 : "+result);
		number=1;
		result=++number+20;
		System.out.println("result=++number+20 : "+result);
		
		// 숫자를 셀 때
		// for(int i=0;i<10;i++);
		
	}
	
	public void calcOp() {
		// 산술연산
		// + - * / %(나머지)
		int su=2;
		int su2=10;
		int result=su+su2;
		System.out.println("+ : "+result);
		result=su-su2;
		System.out.println("- : "+result);
		result=su*su2;
		System.out.println("* : "+result);
		double result2=(double)su/su2;
		System.out.println("/ : "+result2);
		result=su%su2;
		System.out.println("% : "+result);
//		System.out.println(su%2);
	}
	
	
	// 간단한 계산기 만들기
	// 두개의 숫자를 입력받아서 두 수의 +,-,*,/,% 결과를 출력하는 기능 구현
	// public void calculator() 내부에 구현
	// 출력문
	// 더하기 : 00
	// ...
	public void calculator() {
		// 두 개의 값을 입력 받기 : 두개의 변수, scanner 기능, 입력받을 안내문		
		// 결과값 출력하기 : 결과를 저장할 변수, 안내문 -> 계산값을 바로 출력하는 것으로 수정
		
		Scanner sc=new Scanner(System.in);
		
		int num1=0, num2=0; // 지역변수는 초기화하고 사용하자!
		
		System.out.println("두 개의 값을 입력해야 합니다.");
		System.out.print("첫 번째 숫자를 입력하세요: ");
		num1=sc.nextInt();	// 선언과 동시에 초기화 하는 방법 int num1=sc.nextInt();
		System.out.print("두 번째 숫자를 입력하세요: ");
		num2=sc.nextInt();
		
		System.out.println("System.out.println(\"더하기 : \"+num1+num2) : "+num1+num2);
		System.out.println("System.out.println(\"더하기 : \"+(num1+num2)) : "+(num1+num2));
		
		
		System.out.printf("더하기\t: %3d \n",num1+num2);
		System.out.printf("빼기\t: %3d \n",num1-num2);
		System.out.printf("곱하기\t: %3d \n",num1*num2);
		System.out.printf("나누기\t: %3.1f \n",(double)num1/num2);
		System.out.printf("나머지\t: %3d \n",num1%num2);
				
	}
	
	public void compareOp() {
		// 비교연산자 활용하기
		// 동등 비교 연산 : ==, !=
		// 대소 비교 연산 : >,<,>=,<=
		// 비교연산의 경과는 boolean 형으로 반환 : true / false
		// 1. 동등비교
		// 숫자 동등비교
		int num=13;
		int num2=19;
		int num3=13;
		
		System.out.println("num==num2 : \t\t"+(num==num2));
		System.out.println("num==num3 : \t\t"+(num==num3));
		
		double height=180.5;
		double height2=165.2;
		double height3=180.5;
		System.out.println("height==height2 : \t"+(height==height2));
		
		char ch='A';
		System.out.println("ch=='A' : \t\t"+(ch=='A'));
		
		String name="최광훈";
		System.out.println("name == \"최광훈\" : \t"+(name=="최광훈"));
		String name2=new String("최광훈");	
		System.out.println("name==new String(최광훈): "+(name==name2));	
		// String 은 참조형 자료임! 주소가 들어가있음.
		// 문자열에 대한 동등비교는 equals() 를 이용해야 한다.
		System.out.println("name.equals(name2) : \t"+name.equals(name2));
		
		// 불일치 비교
		// !=, !equals()
		System.out.println("num!=num2 : \t\t"+(num!=num2));
		System.out.println("name.equals(\"천재\"): \t"+name.equals("천재"));
		
		// 입력받은 이름이 본인 이름이면 true출력
		Scanner sc=new Scanner(System.in);
		
		System.out.print("본인 이름을 입력하세요: ");
		String myName=sc.next();
		System.out.print("사용자 확인이 완료되었습니다 : "+(myName.equals("최광훈")));
		System.out.print("사용자 확인이 완료되었습니다 : "+(myName=="최광훈"));	// 이렇게 작성하면 false만 나온다! 왜? String 비굔느 이렇게 하면 안된다~!
		System.out.println();
		
		// 대소 비교 하기
		System.out.println("< : "+(num<num2));
		System.out.println("< : "+(num<num3));
		System.out.println("<= : "+(num<=num3));
		
		// 문자(char) 대소 비교 하기
		System.out.println("A<a : "+('A'<'a'));	//A:65, a:97
		System.out.println("A>a : "+('A'>'a'));
		
		// 문자열 대소비교? 불가능		
	}
	
	public void logicOp() {
		// 논리 연산자
		// boolean 연결하기 위한 연산자
		// 그리고	: &&(AND)  	피연산자 두개 모두 true 일때, true
		// 또는 	: ||(OR)	피연산자 두개 중에 하나만 true 라고해도 true
		// 진위형에는 기능(eqaul,contains 등), 비교연산자
		// id가 admin이고 password가 1234 이니?
		String id="admin";
		String pw="1234";
		System.out.println("id==admin, pw==1234"+(id.equals("admin")&&pw.equals(pw)));
		
		// 성별이 여자이거나 성인이면 true, 아니면 flase 출력하기
		String gender="남자";
		int age=19;
		System.out.println("여자이거나 성인인가요 : "+(gender.equals("여자")||(age>19)));
		
		// 숫자의 범위를 설정할때 사용
		// 입력받은 값이 1부터 100사이의 값인지 확인
		Scanner sc=new Scanner(System.in);
		System.out.print("나이를 하나 입력하세요 : ");
		int num=sc.nextInt();
		System.out.println("입력한 숫자는 1이상 100이하의 값인지 확인하세요 : "+(num>=1||num<=100));
		
		// 나이를 입력받고 청소년이면 treu, 아니면 false를 출력하기
		System.out.println("해당 나이가 청소년인지 확인하세요 : "+ (num>=13||num<=18));
		
		// 영문자 한개를 입력 받고, 그 문자가 대문자인지 확인
		// 그 문자가 알파벳인지 확인.
		System.out.print("문자 하나를 입력해 주세요: ");
		char ch=sc.next().charAt(0);
//		System.out.printf("입력한 문자의 아스키 코드는 다음과 같습니다 : %d",ch);
		System.out.println("입력하신 문자가 대문자인지 확인하세요 : "+ (ch>='A'&&ch<='Z'));
		System.out.println("입력하신 문자가 알파벳인지 확인하세요 : "+ ((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')));
	
		// 사는 곳이 서울 또는 인천이면서 30대인 사람을 조회
		System.out.print("사는 도시명을 입력해주세요 : ");
		String address=sc.next();
		System.out.println("사는 곳이 서울 or 인천 이면서 30대 인가요? "+((address.equals("서울")
				||address.equals("인천"))&&(num>=30&&num<40)));
	}
	
	public void complexOp()	{
		// 복합 대입 연산자
		// 산술연산, 대입연산을 한 번에 처리하는 연산자
		// +=, -=, /=, *=
		
		// 값을 누적할때 사용
		int total=30000;
		total += 1000;
		System.out.println(total);
		total -= 22000;
		System.out.println(total);
		
		String msg="";
		msg+="오늘은 금요일";
		msg+="아이유 만나야지~~";
		System.out.println(msg);
		
		msg="";
		msg+="<html>";
		msg+="<head>";
		msg+="</head>";
		msg+="<body>";
		msg+="<h1>";
		msg+=total;
		msg+="</h1>";
		msg+="</body>";
		msg+="</html>";
		System.out.println(msg);
	}

	public void thirdOp() {
		// 삼항 연산자
		// 조건식(true, false를 갖는 값) 기능, 논리, 불리언, 비교 연산자를 사용할 수 있음.
		// 조건식?true일때 실행:false일때 실행
		// 키가 180 보다 크면 키가 크네요, 아니면 키가 작네요를 출력하는 기능
		Scanner sc=new Scanner(System.in);
		double height=180.5;
		System.out.print("키를 입력하세요: ");
		height = sc.nextDouble();
		String result = height>=180?"키가크네요":"키가작네요";	// java 에서는 삼항 연산자만 별로도 사용할 수 없음
		System.out.println(result);
		
		// 점수를 입력받고, 60점 이상이면 합격, 아니면 불합격
		double score=0;
		System.out.print("점수를 입력하세요: ");
		score = sc.nextDouble();
		System.out.println(score>=60?"합격":"불합격");
	}
	
	// 수학, 영어, 국어, 코딩 점수를 입력받고
	// 합계와 평균을 출력해주는 기능을 구현
	// 각 과목의 점수는 따로 저장하지 않고, 한개의 변수만 이용해서 합계와 평균을 구해야 함.
	// public void calcPoint()
	
	public void calcPoint() {
		// 각 과목을 입력받지만 값을 변수에 저장하지는 않음 : 복합대입연산자 사용 +=
		// 과목의 합을 누적할 변수 선언 하여 사용 : total
		Scanner sc=new Scanner(System.in);
		Double total=0.0;
		int num=0;
		System.out.println("각 점수를 입력해주세요.");
		System.out.print("수학: ");
		total += sc.nextDouble();
		num +=1;
		System.out.print("영어: ");
		total += sc.nextDouble();
		num +=1;
		System.out.print("국어: ");
		total += sc.nextDouble();
		num +=1;
		System.out.print("코딩: ");
		total += sc.nextDouble();
		num +=1;
		System.out.printf("총점은 %.2f 입니다.\n",total);
		System.out.printf("평균은 %.2f 입니다.", total/num);
	}
	
	// 사용자에게 4개의 메시지를 입력받고, 입력받은 모든 메시지를 한번에 출력기능 구현.
	// public void inputMsg()
	
	public void inputMsg() {
		
		String msg="";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("4개의 메시지를 입력해 세주요.");
		System.out.print("첫 번째 메시지를 입력해 주세요: ");
		msg += sc.next();
		System.out.print("두 번째 메시지를 입력해 주세요: ");
		msg += sc.next();
		System.out.print("세 번째 메시지를 입력해 주세요: ");
		msg += sc.next();
		System.out.print("네 번째 메시지를 입력해 주세요: ");
		msg += sc.next();
		System.out.printf("입력한 메시지는 다음과 같습니다: %s",msg);
		
	}
	
	// 아이디와 패스워드를 입력받고
	// 아이디가 user01이고 패스워드가 1234면
	// 로그인 성공, 아니면 로그인 실패를 출력
	// public void loginCheck()
	
	public void loginCheck() {
		
		String isId="user01", isPw="1234", userId="", userPw="";
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("ID 를 입력하세요 : ");
		userId = sc.next();
		System.out.print("Pw 를 입력하세요 : ");
		userPw = sc.next();
		
		String isLoginCheck = (userId.equals(isId)&&userPw.equals(isPw))?"로그인 성공":"로그인 실패";
		System.out.print(isLoginCheck);
	}
	
	public void bitOp() {
		// 비트 연산자
		// 저장소에 있는 비트끼리 연산을 하는 것
		// A & B 	(AND 연산) 두 비트 모두 1일때 1, 아니면 0 반환
		// A | B	(OR  연산) 두 비트 중 한개가 1이면 1, 아니면 0 반환
		// A ^ B	(XOR 연산) 두 비트가 서로 다른 값을 가지면 1 아니면 0 반환
		// ~A		(보수,반전) 보수 비트를 반전시키는 것
		// A>>2, A<<2	(이동 연산)
		int a=10, b=22;
		String bit="";
		for(int i=0;i<32;i++) {
			bit+=0;
		}
		String bitData=bit+Integer.toBinaryString(a);
		bitData=bitData.substring(bitData.length()-32);
		System.out.println(bitData+"-> a비트값");

		bitData=bit+Integer.toBinaryString(b);
		bitData=bitData.substring(bitData.length()-32);
		System.out.println(bitData+"-> b비트값");
		
		bitData=bit+Integer.toBinaryString(a&b);
		bitData=bitData.substring(bitData.length()-32);
		System.out.println(bitData+"-> a&b비트값");

		bitData=bit+Integer.toBinaryString(a|b);
		bitData=bitData.substring(bitData.length()-32);
		System.out.println(bitData+"-> a|b비트값");
		
		bitData=bit+Integer.toBinaryString(a^b);
		bitData=bitData.substring(bitData.length()-32);
		System.out.println(bitData+"-> a^b비트값");

		bitData=bit+Integer.toBinaryString(~a);
		bitData=bitData.substring(bitData.length()-32);
		System.out.println(bitData+"-> ~a비트값");
		
		bitData=bit+Integer.toBinaryString(a>>2);
		bitData=bitData.substring(bitData.length()-32);
		System.out.println(bitData+"-> a>>2비트값 (a*2^2을 계산해줌)");
		
		bitData=bit+Integer.toBinaryString(a<<2);
		bitData=bitData.substring(bitData.length()-32);
		System.out.println(bitData+"-> a<<1비트값 (a/2^1을 계산해줌)");
	}

	
}
