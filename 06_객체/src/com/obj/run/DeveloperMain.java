package com.obj.run;

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
	}
}
