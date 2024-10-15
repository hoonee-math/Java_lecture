package com.inherit.controller;

import com.inherit.model.vo.B_Developer;
import com.inherit.model.vo.B_Employee;

public class B_InheritController {
	//1015-2-1
	//직업별 사람을 관리하는 프로그램
	// 개발자, 강사, 회사원, 학생
	// 개발자	: 이름, 나이, 성별, 경력, 주언어
	// 강사	: 이름, 나이, 성별, 경력, 주과목, 연봉
	// 회사원	: 이름, 나이, 성별, 연차, 직급, 부서
	// 학생	: 이름, 나이, 성별, 학년, 학과, 학교
	public void useInherit() {
		B_Developer mark = new B_Developer();
		mark.setName("마크 저커버그"); // B_Developer 에 name 을 필드에 선언하지는 않았지만 부모 클래스에 있으므로 사용가능
		mark.setAge(40);
		mark.setGender('M');
		mark.setYear(20);
		mark.setHeight(179.2);
		mark.setWeight(73);
		mark.setSkill(new String[] {"c","java","c++"});
		
		System.out.println(mark.infoDeveloper());
		
		B_Employee e = new B_Employee();
		e.setName("최광훈");
		e.setGender('F');
		e.setDayOf(10);
		e.setDept("개발팀");
		e.setJob("연구원");
		System.out.println(e.infoPerson());
		
		B_Developer hoon = new B_Developer("최광훈",33,'M',173.6,63.5,5, new String[] {"자바","파이썬","C"});
		System.out.println(hoon.infoDeveloper());
	}
}
