package com.poly.model.vo;

//1016-7-2
public class A_Student extends A_Person { //1016-7-3
	private int grade;
	private int classNumber;
	public A_Student() {
		
	}
	//1016-7-4 alt+s+a 에서 g 누르기 전에 select Super constructor 에서 아래거 선택하면 상속 관계에 있는것 포함해서 생성함
	public A_Student(String name, int age, char gender, int grade, int classNumber) {
		super(name, age, gender);
		this.grade = grade;
		this.classNumber = classNumber;
	}
	
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassNumber() {
		return classNumber;
	}
	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}
	
	//1016-8-9
	public void printData() {
		System.out.println(getName()+" "+getAge()+" "+getGender()
		+" "+this.grade+" "+classNumber);
	}
	
	//1016-8-15
	@Override
	public String toString() {
//		return toString()+","+grade+","+classNumber; // 이렇게 사용하면 this가 생략되어있으므로 재귀호출. 계속 호출되다 스택이 꽉 차버림
//		return this.toString()+","+grade+","+classNumber; // 이렇게 사용하면 this가 생략되어있으므로 재귀호출. 계속 호출되다 스택이 꽉 차버림
		return super.toString()+","+grade+","+classNumber;
		// 이렇게 되면 [1016-8-13] 에서 예진님의 정보가 학년/반 까지 출력시켜줌. 이게 동적 바인딩 기능!
		// 현재 A_Student 에 저장된 toString 이 있지만 super 클래스에 저장된 메소드를 호출해서 사용함
		// [1016-8-13] 에서 print 메소드를 호출하면 toString 은 자동 호출되며, toString 은 자동으로 오버라이딩 되어있는 해당 객체의 toString 메소드를 호출함.
	}
}
