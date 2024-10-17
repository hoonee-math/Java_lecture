package com.inter.model.vo;

import com.inter.common.B_PrinterInter;

//1017-2-3
public class B_BrotherPrinter implements B_PrinterInter { //1017-2-15
	private String name;
	
	public B_BrotherPrinter(String name) {
		super();
		this.name = name;
	}

	public void bPrint() {
		System.out.println(name+"프린터가 인쇄중입니다. Brother brother~");
	}
	
	//1017-2-16 // 컨트롤러를 건들 필요가 없어짐!
	@Override
	public void print() {
		bPrint();
	}

	@Override
	public void scanner() {
		// TODO Auto-generated method stub
		
	}
}
