package com.obj.run;

import com.obj.model.vo.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
//		main클래스에서 사원클래스 두개를 (생성)만들고
//		이름 부서에 각각
//		유병승 강사부
//		은세계 학생부 로 등록하고 출력할것
//		객체는 두개를 생성
//		사람클래스를 만들어서 활용하자
		Employee member1=new Employee("오민현","감자팀");
		Employee member2=new Employee("은세계","학생부");
		
		System.out.println(member1.name+" "+member1.team);
		System.out.println(member2.name+" "+member2.team);
	}

}
