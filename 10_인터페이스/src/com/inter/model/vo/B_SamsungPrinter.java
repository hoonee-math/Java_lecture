package com.inter.model.vo;

import com.inter.common.B_PrinterInter;

//1017-2-2
public class B_SamsungPrinter implements B_PrinterInter { //1017-2-13 implements B_PrinterInter
	private String name;
	
	public void samPrint() {
		System.out.println(name+" 출력 중.. 삼성삼성~~");
	}

	public B_SamsungPrinter(String name) {
		super();
		this.name = name;
	}
	
	//1017-2-14
	@Override
	public void print() {
		samPrint();
	}

	@Override
	public void scanner() {
		// TODO Auto-generated method stub
		
	}
}
