package com.obj.run;

import com.obj.controller.MyMethod;

public class MethodMain {

	public static void main(String[] args) {
		// 1010-7-5 클래스에 선언된 메소드 호출하기
		// 생성자는 선언 안했기 때문에 기본 생성자? 만들어짐
		MyMethod md = new MyMethod();
		// 생성된 객체에 접근해서 메소드를 호출
		// 객체변수명.메소드명();
		md.printMsg();
		
		// 1010-7-7
		md.printMsg2("이야 이게 되네");
		md.printMsg2("우리 모두 화이팅 합시다!");

		// 1010-7-9
		System.out.println(md.inputNum());
		
		// 1010-7-10
		// stack 영억은 어떻게 그려지느냐?
		// stack 영역에 처음에는 main 이 만들어짐.
		// -> [7-5] md.printMsg() 가 실행되면서 stack 에서 생됨
		// -> stack 에 쌓이 [7-5] 을 삭제한 후 다음 코드인 [7-7] 이 만들어짐.
		// -> 반환형이 있으면.. 남음????
		
		// 1010-7-12
		long total=md.calc(20,30);
		System.out.println(total);
		
		md.test3();
	}

}
