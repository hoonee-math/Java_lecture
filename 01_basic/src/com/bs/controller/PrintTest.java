package com.bs.controller;

public class PrintTest {
	public static void main(String[] args) {
		// print()
		// 특징: 출력후 개행(행을 밑으로 떨어뜨리는 것)하지 않음
		int age=19;
		System.out.print("안녕 ");
		System.out.print("나는 최광훈이야");
		System.out.println(" 난"+age+"살이야");
		
		// println()
		// 특징: 출력 후 개행함.
		System.out.println("안녕");
		System.out.println("나는 최광훈이야");
		
		// printf()
		// 특징: format으로 출력할 구문을 작성하고 출력
		// %d(정수), %s(문자열), %f(실수), %c(문자)
		String format="안녕 나는 %s이야. 난 %d살이야.";
		System.out.printf(format, "최광훈",19);
		System.out.printf("성별 %c 키 %.1f", 'M',180.5);	// printf 도 개행이 되지 않음. 즉 줄바꿈이 되지 않음.
		System.out.println();
		
		format="%5s%3d%2c%6.2f";
		System.out.printf(format, "cgh",20,'M',180.516);
		System.out.println();
		System.out.printf(format, "gh",7,'M',170.516);
		System.out.println();
		
		format="%-5s%-3d%2c%6.2f";
		System.out.printf(format, "cgh",20,'M',180.516);
		System.out.println();
		System.out.printf(format, "gh",7,'M',170.516);
		System.out.println();
		
		format="%-5s\t%-3d\t%2c\t%6.2f\n";	// escape 문 \t, \n 역슬래시는 escape 구문을 나타냄.
		System.out.printf(format, "cgh",20,'M',180.516);
		System.out.printf(format, "gh",7,'M',170.516);
		
		// 파일 경로 작성하기
		// C:\\Users\\user
		System.out.println("c:\\User\\user");
		
		// 문자열 안에서 " ", ' ' 문자열이나 문자를 표현하는 리터럴
		String html="\"안녕\" 이라고 말했다.";
		System.out.println(html);
		
		html="<p onclick=\"location.assign('test.do')\">클릭해봐</p>";
	}
}
