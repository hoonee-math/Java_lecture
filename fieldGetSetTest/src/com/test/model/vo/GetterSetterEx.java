package com.test.model.vo;

public class GetterSetterEx {
//	프로젝트 생성 후
//	사원 클래스를 만들자
//	사원번호, 사원명, 부서, 직책, 월급, 보너스
//	
//	멤버변수는 모두 직접접근이 불가능하게 설정할 것
//	사원번호는 자동으로 부여되고 출력은 되나 수정은 금지
//	그외 다른 멤버변수는 다 수정, 출력이 가능하게 설계
//	데이터를 한번에 출력하는 메소드도 선언
//	
//	1. 유병승 강사부 강사 100 0.5
//	2. 은세계 학생부 학생 10  0.2
//	3. 황지윤 학생부 학생 10  0.1
	
	private String codeM;
	private String name;
	private String team;
	private String level;
	private int salary;
	private double bonus;
	
	
	private static int countTeacher;
//	private static int empNo; // 이런식으로 만들면 3만 출력될 것임. static 영역의 값을 나중에 불러옴.
	private int empNo; // empNo 라는 저장소를 새로 만들어서
//	private final int empNo; 이렇게 해서 저장시킬 수도 있음.
	
	static int count=1; 
	{
		memberCode();
		count++;
		
		empNo=++countTeacher;
//		empNo="BS_"+(++countTeacher.count);
	}
	
	public GetterSetterEx() {}
	
	public void memberCode() {
		codeM=count+"번";
	}
	
	// 1011-3-2 getter 만 존재하고 setter 는 존재 하지 않는 다면 수정이 불가능
	// field 에 private 로 묶어 놓고, getter 를 두지 않으면 수정하지 못하게 사용 가능!
	public String getCodeM() {
		return codeM;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setTeam(String team) {
		this.team=team;
	}
	public String getTeam() {
		return team;
	}
	public void setLevel(String level) {
		this.level=level;
	}
	public String getLevel() {
		return level;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public int getSalary() {
		return salary;
	}
	public void setBonus(double bonus) {
		this.bonus=bonus;
	}
	public double getBonus() {
		return bonus;
	}
	
	public void printAll() {
		System.out.println(empNo+" "+codeM+" "+name+" "+team+" "+level+" "+salary+" "+bonus);
	}
	
	
	
	public static int countStatic;	// static 변수로 만든 변수는 getter/setter 도 static 으로 만들어서 사용하자!
	
	public static int getCountStatic() {
		return GetterSetterEx.countStatic;
	}
	public static void setCountStatic(int countStatic) {
		GetterSetterEx.countStatic=countStatic;
//		empNo=countStatic; // empNo는 new 할때 생성됨. 이 영역 안에서는 얘를 사용하지 못함. static 영역 안에서는 멤버 변수를 사용할 수 없음.
	}
	
	
	
	
	
}
