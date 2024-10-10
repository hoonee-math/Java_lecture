package com.obj.run;

import com.goods.vo.Goods;

public class GoodsMain {
	public static void main(String[] args) {
//		각 객체 생성 후 내용 출력하기 생성은 매개변수 생성자로할것
//		컴퓨터, macbook, 200
//		핸드폰, 갤럭시노트, 120, 0.2
//		마스크, 10, 0.5, 100
//		출력시에는 전체 필드출력하기
		Goods goods1=new Goods("컴퓨터", "macbook", 200);
		Goods goods2=new Goods("핸드폰", "갤럭시노트", 120, 0.2);
		Goods goods3=new Goods("마스크", 10, 0.5, 100);

		System.out.println(goods1.goodsCode+" "+goods1.type+" "+goods1.name+" "
				+goods1.price+" "+goods1.sale+" "+goods1.stock);
		System.out.println(goods2.goodsCode+" "+goods2.type+" "+goods2.name+" "
				+goods2.price+" "+goods2.sale+" "+goods2.stock);
		System.out.println(goods3.goodsCode+" "+goods3.type+" "+goods3.name+" "
				+goods3.price+" "+goods3.sale+" "+goods3.stock);
		
//		??
//		* 다 하신분
//		  -> 생성시 마다 상품번호가 1부터 1씩증가해서 대입
		
//		3. 상품 -> 생성자를 이용해서 아래 상품을 생성 후 출력
//		   맥북 590 그레이 0.2
//		   갤럭시S24 180 블랙 0.1
//		   아파트34평 40000... 핫핑크 0
//		4. 상품추가 후 아래처럼 출력 * 매개변수있는 생성자활용
//		   책상 200 null 0.0
//		   이어폰 30 화이트
//		   자동차 800 블랙 0.3
		Goods goods4=new Goods("맥북",590,"그레이",0.2);
		goods4.printGoods();
		Goods goods5=new Goods("갤럭시S24",180,"블랙",0.1);
		goods5.printGoods();
		Goods goods6=new Goods("아파트34평",40000,"핫핑크",0);
		goods6.printGoods();
	}
}
