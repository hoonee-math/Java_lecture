package com.inter.run;

import java.util.Scanner;

import com.inter.controller.B_PrintController;
import com.inter.controller.InterfaceController;
import com.inter.model.vo.B_BrotherPrinter;
import com.inter.model.vo.B_CannonPrinter;
import com.inter.model.vo.B_SamsungPrinter;

//1016-10-1
public class Main {

	public static void main(String[] args) {
		new InterfaceController().basicInterface();
		
		
//		//1017-2-11
//		// 원래는 직접 프린터에 의존해서 ~~~
//		// 공통의 약속이 필요함. 어떤 프린트간에 구현되어있는거 호출하고 싶은거임.
//		// 컨트롤러입방에서.
//		new B_PrintController().print(); // 무조건 프린트 드라이버가... 여기서 기본생성자로 호출해서 에러가남! new B_PrintController() 이렇게 안됨! 무조건 매개변수 넣어서 실행시켜야함. //1017-2-14
		
		//1017-2-17
		Scanner sc=new Scanner(System.in);
		System.out.println("인쇄기능");
		System.out.print("1.삼성 프린터\n2.브라더프린터\n3.캐논\n입력: ");
		switch(sc.nextInt()) {
		case 1 : new B_PrintController(new B_SamsungPrinter("삼성")).print(); break;
		case 2 : new B_PrintController(new B_BrotherPrinter("브라더")).print(); break;
		case 3 : new B_PrintController(new B_CannonPrinter()).print(); break;
		}
	}
}
