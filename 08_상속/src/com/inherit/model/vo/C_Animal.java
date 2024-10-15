package com.inherit.model.vo;

//1015-4-14
public class C_Animal {
	private String name;
	private int age;
	private double weight;
	
	
	public C_Animal() {
		// TODO Auto-generated constructor stub
	}
	public C_Animal(String name, int age, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	//1015-4-15
	public void move() {
		// 동물마다 움직임을 표현하는 방법이 다를 수 있음. 여기서 정의하기는 애매모호함.
		// 클래스별로 움직임이 다르다. 엉금엉금, 깡총깡총
		// 공통적인 부분만 정의해야 함.
		System.out.println(name+"는 움직이지 않는다."); // 재정의를 하지 않은 경우에는 기본값으로 이렇게 사용할 수 있음.
	}
	public void bark() {
		// 짖는 소리도 다 다르다. 어흥,
		System.out.println(name+"는 소리를 내지 않는다."); // 재정의를 하지 않은 경우에는 기본값으로 이렇게 사용할 수 있음.
	}
}
