package com.goods.vo;

public class Goods {
//	상품클래스를 생성해보자
//	저장내용:	상품번호, 상품타입, 상품이름, 상품가격, 상품할인율, 상품재고
//	모든 필드는 외부에서 접근할 수 있게 설정
//	클래스를 생성할때
//	기본생성 가능
//	타입, 이름, 가격만 설정가능
//	타입 이름, 가격, 할인률 설정가능
//	상품이름, 가격, 할인률, 재고 설정가능
//	할 수 있게 클래스를 구성하고
//	각 객체 생성 후 내용 출력하기 생성은 매개변수 생성자로할것
//	컴퓨터, macbook, 200
//	핸드폰, 갤럭시노트, 120, 0.2
//	마스크, 10, 0.5, 100
//	출력시에는 전체 필드출력하기
//	* 다 하신분
//	  -> 생성시 마다 상품번호가 1부터 1씩증가해서 대입
	public String type;
	public String name;
	public int price;
	public double sale;
	public int stock;
	public String color;
	
	static int code=1;
	public final String goodsCode="P_"+code;
	{
		code++;
	}
	
	public Goods() {}
	
	public Goods(String type, String name, int price) {// 타입, 이름, 가격만 설정가능
		this.type=type;
		this.name=name;
		this.price=price;
	}
	public Goods(String type, String name, int price, double sale) {// 타입, 이름, 가격, 할인률 설정가능
		this.type=type;
		this.name=name;
		this.price=price;
		this.sale=sale;
	}
	public Goods(String name, int price, double sale, int stock) {// 상품이름, 가격, 할인률, 재고 설정가능
		this.name=name;
		this.price=price;
		this.sale=sale;
		this.stock=stock;		
	}
	
//	상품을 저장할 수 있는 클래스를 선언 -> vo패키지, Main실행
//	상품번호, 상품명, 가격, 색상, 할인율
//	1. 상품번호는 중복되지않게 자동을 생성되게 함. P_1, P_2, P_3 상품이 생성될때마다 자동생성
//	    수정이 불가능해야함.
//	2. 상품을 등록할때(생성) 상품명, 가격 / 상품명, 가격, 색상 / 상품명,가격,색상, 할인율의 데이터를
//	   대입해서 생성이 되어야함. 기본생성은 불가능
	public Goods(String name, int price) {
		this.name=name;
		this.price=price;
	}
	public Goods(String name, int price, String color) {
		this(name,price);
		this.color=color;
	}
	public Goods(String name, int price, String color, double sale) {
		this(name, price, color);
		this.sale=sale;
	}
	
//	3. 상품 -> 생성자를 이용해서 아래 상품을 생성 후 출력
//	   맥북 590 그레이 0.2
//	   갤럭시S24 180 블랙 0.1
//	   아파트34평 40000... 핫핑크 0
//	4. 상품추가 후 아래처럼 출력 * 매개변수있는 생성자활용
//	   책상 200 null 0.0
//	   이어폰 30 화이트
//	   자동차 800 블랙 0.3
	
	public void printGoods() {
		System.out.println(goodsCode +" "+ name +" "+ price +" "+ color +" "+ sale);
	}
}
