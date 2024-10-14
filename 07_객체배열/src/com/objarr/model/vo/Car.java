package com.objarr.model.vo;

public class Car {
	//Car클래스를 선언하고
	//차종, 색상, km, 이름
	//배열을 이용해서 데이터를 저장
	//대형 검정 300 타호
	//중형 흰색 500 GV70
	//스포츠 노랑 10 카마로
	//소형 카키 800 캐스퍼
	//대형 파란 600 타요
	//출력하기
	//0~1 매개변수있는 생성자를 이용해서 생성
	//2~4 기본생성자로 생성하고 데이터 대입저장
	
	private String type;
	private String color;
	private int km;
	private String name;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String type, String color, int km, String name) {
		super();
		this.type = type;
		this.color = color;
		this.km = km;
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String infoCar() {
		return type + color + km + name;
	}
	
	
}
