package com.inherit.model.vo;

import java.util.Arrays;

public class B_Developer extends B_Person { //1015-2-5 상속 추가
	//1015-2-2
	private int year;
	private String[] skill;
	
	public B_Developer() {
		// TODO Auto-generated constructor stub
		super(); // 기본으로 들어가있음. 코드가 없어도 자동으로 super 를 호출해서 사용하고 있음.
	}

	public B_Developer(String name, int age, char gender, double height, double weight, int year, String[] skill) {
		super(name, age, gender, height, weight);
		this.year = year;
		this.skill = skill;
		
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String[] getSkill() {
		return skill;
	}

	public void setSkill(String[] skill) {
		this.skill = skill;
	}
	
	public String infoDeveloper() {
		return infoPerson()+", "+year+", "+Arrays.toString(skill);
	}
}
