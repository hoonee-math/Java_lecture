package com.inter.controller;

import com.inter.common.B_PrinterInter;
import com.inter.model.vo.B_SamsungPrinter;

//1017-2-1
public class B_PrintController {
//	//1017-2-4 //1017-2-6 주석
//	private B_SamsungPrinter printer = new B_SamsungPrinter("삼송");
//	//1017-2-6 //1017-2-9 주석
//	private B_BrotherPrinter printer = new B_BrotherPrinter("브라더");
	//1017-2-9
	private B_PrinterInter printDriver; //1017-2-13 인터페이스를 선언해줌. 넣어줌. 인터페이스 안에 객체를 저장할 수 있음. implements 에선언한 클래스가 들어올 수 있음. 여기 안에 들어오는 애들은 print라는 메소드를 가지고 있을 수 밖에 없음. 그래서 정상작동. 정적인 코드를 굉장히 동적으로 보이도록 만들어줌...
	// 필요한 기능만 보고서 호출하고 끝내버림. 다른 기능은 안봄..
	
//	public B_PrintController() {
//		//1017-2-15 // TODO Auto-generated constructor stub 삼성프린터를 기본값으로 사용하겠다고 만들 수도 있긴함.
//		printDriver= new B_SamsungPrinter();
//	}
	public B_PrintController(B_PrinterInter printDriver) {
		super();
		this.printDriver = printDriver;
	}



	//1017-2-5 //1017-2-7 주석
	public void print() {
//		printer.samPrint();
		//1017-2-7
//		printer.bPrint();
		//1017-2-10
		printDriver.print();
	}
}
