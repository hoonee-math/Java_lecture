package com.obj.run;

import java.util.Arrays;

import com.obj.model.vo.Developer;

public class DeveloperMain {

	public static void main(String[] args) {
		//Method 메인에서
		//김개발, 10, java, 1000 을 생성
		//
		//전체 내용을 출력
		//
		//연봉을 출력
		//
		//연봉을 10으로 수정
		//
		//수정 후 연봉을 출력
		//
		//주언어를 파이썬으로 수정하고 주언어 출력하기
		Developer dev=new Developer("김개발",10,"java",1000);
		dev.printDeveloper();
		dev.printIncome();
		
		dev.fixIncome(10);
		dev.printIncome();
		
		dev.fixLanguage("파이썬");
		dev.printLanguage();
		
		System.out.println("==== 배열 이용 추가 실습 ====");
		System.out.print("배열 for문 이용 출력: ");
		String[] lang = new String[] {"java"};
		Developer dev1 = new Developer("김개발",10,lang,1000);
		dev1.printDeveloperArray();
		
		System.out.println("");
		Developer dev2 = new Developer("김개발",0,new String[] {"자바"},1000);
		dev2.printDeveloperArray();
		dev2.printIncome();
		dev2.fixIncome(10);
		dev2.fixArrayLanguage(new String[] {"파이썬","레드썬"});
		String[] lang2 = dev2.getArrayLanguage();
		System.out.println(Arrays.toString(lang2));
		
		// 1011-3-2
		dev2.setYears(-100);
		dev2.printDeveloperArray();
	}
}









