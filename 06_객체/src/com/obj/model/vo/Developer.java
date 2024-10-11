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
//	private String[] arrayLanguage;
	private String[] arrayLanguage=new String[5]; // ★★ 얘가 1번, 초기화 블록 2번, 생성자가 3번 참조형 자료형 같은 경우에는 기본값(5)을 넣어주는 것도 좋다!
	private int income;
	
	public Developer() {} // 생성할 당시에 초기값이 없을 수도 있기 때문에 기본 생성자를 만들어 둠!
	
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
	

	//배열추가.
	public Developer(String name, int years, String[] arrayLanguage, int income) {
		this.name=name;
		this.years=years;
		this.arrayLanguage=arrayLanguage;
		this.income=income;
	}
	//배열3. 각 필드에 있는 값을 출력해주는 메소드 만들기
	public void printDeveloperArray() {
		System.out.print(this.name+" "+this.years);
		for(String l : this.arrayLanguage) {
			System.out.print(" "+l);
		}
		System.out.println(" "+this.income);
	}
	//배열6. 주언어를 수정하는 메소드 만들기
	public void fixArrayLanguage(String[] arrayLanguage) {
		this.arrayLanguage=arrayLanguage;
	}
	//배열7. 주언어를 반환하는 메소드 만들기
	public String[] getArrayLanguage() {
		return this.arrayLanguage;
	}
	
	// 1011-3-1
	// setter/getter 만들기
	//	필드에 데이터를 수정, 가져오는 메소드
	// setter : void set필드명(매개변수); // 반환형 없음.
	// getter : 반환형 get필드명(); // 내 필드, 내가 갖고있는 걸 주기 때문에 매개변수는 없음. 대신에 반환값이 있음.
	//	내가 선언한 필드 하나하나 마다 만들어줘야함.
	public void setYears(int years) {
		if(years>0) {
			this.years=years;
		}
	}
	public int getYears() {
		return this.years;
	}
}
