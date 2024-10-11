package com.obj.model.vo;

public class Developer {
	//이름, 년차, 주언어, 연봉
	//1. 각 필드는 private 로 선언
	//2. 각 필드를 생성자를 이용해서 값을 저장
	//3. 각 필드에 있는 값을 출력해주는 메소드 만들기
	//4. 연봉값만 수정할 수 있는 메소드 만들기
	//5. 연봉값만 출력하는 메소드 만들기

	//1. 각 필드는 private 로 선언
	private String name;
	private int years;
	private String language;
	private int income;
	
	public Developer() {}
	
	//2. 각 필드를 생성자를 이용해서 값을 저장
	public Developer(String name, int years, String language, int income) {
		this.name=name;
		this.years=years;
		this.language=language;
		this.income=income;
	}

	//3. 각 필드에 있는 값을 출력해주는 메소드 만들기
	public void printDeveloper() {
		System.out.print("각 필드의 값 출력: ");
		System.out.println(name+" "+years+" "+language+" "+income);
	}
	
	//4. 연봉값만 수정할 수 있는 메소드 만들기
	public void fixIncome(int income) {
		this.income=income;
	}
	//5. 연봉값만 출력하는 메소드 만들기
	public void printIncome() {
		System.out.println("연봉값 출력: "+income);
	}
	//6. 주언어를 수정하는 메소드 만들기
	public void fixLanguage(String language) {
		this.language=language;
	}
	//7. 주언어를 반환하는 메소드 만들기
	public void printLanguage() {
		System.out.println("주언어 출력: "+language);
	}
	//
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
}
