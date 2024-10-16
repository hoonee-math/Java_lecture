package com.poly.model.vo;

//1016-9-2
//public class B_Animal { //1016-9-6 abstract 예약어를 삽입. 얘는 상속을 통해서만 이용할 수 있는 코드다. 미완성 코드다. 상속체(구현체)를 가지고 이용을 할때만 구현해서 사용할 수 있다.
//	//1016-9-26 error message: The type B_Animal must be an abstract class to define abstract methods
public abstract class B_Animal { //1016-9-7 //1016-9-25 다시 abstract 를 지운다면, 에러가 발생함. 추상메소드를 가지고 있는 클래스는 무조건 추상 클래스로 선언해서 사용해야함. 미완성된 메소드인 추상메소드를 실행시킬 수가 없기 때문에, 추상메소드가 선언되어있다면 무조건 추상클래스를 사용해야함.
	private String name;
	private String type;
	private int age;
	private double weight;
	
	public B_Animal() {
		// TODO Auto-generated constructor stub
	}
	public B_Animal(String name, String type, int age, double weight) {
		super();
		this.name = name;
		this.type = type;
		this.age = age;
		this.weight = weight;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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

	@Override
	public String toString() {
		return name+" "+age+" "+type+" "+weight;
	}
	
//	//1016-9-14
//	public void move()	{
//		System.out.println(name+"은(는) 움지기이 않아");
//	}
	public abstract void move();//1016-9-18 abstract 예약어를 삽입하게 되면 move 메소드가 구현되어있는 B_Cat 은 오류가 발생하지 않지만, B_Dog 는 오류가 발생하게됨.
	
//	public abstract void bark();
}
