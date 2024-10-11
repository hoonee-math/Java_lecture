package com.obj.model.vo;
// GoodsMain에 연결

public class Employee {
//	사원클래스를 만들어보자
//	이름, 부서, 직책, 월급, 보너스가 있고
//	이름, 부서 는 외부패키지에서 수정, 접근이 가능하게 설정
//	직책, 월급 내부패키지에서만 수정, 접근이 가능
//	보너스는 클래스 내부에서만 수정, 접근이 가능
//	main클래스에서 사원클래스 두개를 (생성)만들고
//	이름 부서에 각각
//	유병승 강사부
//	은세계 학생부 로 등록하고 출력할것
//	객체는 두개를 생성
//	사람클래스를 만들어서 활용하자
	
	// 이름, 부서는 외부 패키지에서 수정, 접근 가능
	public String name;
	public String team;
	// 직책, 월급 내부 패키지에서만 수정, 접근 가능
	String level;
	int income;
	// 클래스 내부에서만 수정, 접근 가능
	private int bonus;
	
	public Employee() {}
	
	public Employee(String name, String team) {
		this.name=name;
		this.team=team;
	}
		
//	com.obj.model.vo패키지에 선언
//	이름, 주소, 전화번호, 키, 몸무게
//	저장
//	이름, 주소는 클래스내부에서만 활용가능
//	전화번호 키, 몸무게는 외부패키지에서 활용가능
//	두개의 사람클래스를 생성해서
//	각각
//	01036446259 180.5 65.5
//	01012345678 195.5 100.2
//	저장 후 출력하기
	private String name1;
	private String address;
	public String phone;
	public double height;
	public double weight;
	
		
	
}









