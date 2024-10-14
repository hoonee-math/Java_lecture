package com.objarr.run;

import java.util.Scanner;

import com.objarr.model.vo.Fruit;

public class FruitMain {

	public static void main(String[] args) {
		//과일을 저장할 수 있는 클래스를 만들고
		//이름, 무게, 색상, 가격
		//과일을 5개 저장할 수 있는 저장소를 만들자
		//과일 본인이 좋아하는 과일로 초기화하고
		//1. 초기화한 과일들 전체 출력하기
		//2. 입력된 과일중 무게가 3kg이상인 과일 출력하기
		//3. 가격이 3000 이상인 과일 출력하기
		//사과 5 빨강 10000
		//바나나 3 노랑 8000
		//딸기 1.5 빨강 2500
		//키위 2 초록 2800
		//샤인머스켓 1.3 초록 40000
		
		System.out.println("==== 과일을 저장할 수 있는 클래스, 객체 배열 실습 ====");
		System.out.print("몇개의 과일을 저장하시겠습니까(기본값 삽입 0): ");
		Scanner sc=new Scanner(System.in);
		int scale=sc.nextInt();
		int setScale=scale;
		if(scale ==0) scale=5;
		Fruit[] fruits = new Fruit[scale];
		
		if(setScale==0) {
			fruits[0]=new Fruit("사과", 5, "빨강", 10000);
			fruits[1]=new Fruit("바나나", 3, "노랑", 8000);
			fruits[2]=new Fruit("딸기", 1.5, "빨강", 2500);
			fruits[3]=new Fruit("키위", 2, "초록", 2800);
			fruits[4]=new Fruit("샤인머스켓", 1.3, "초록", 40000);
		} else if(scale>0 && scale<6) {
			// 과일 입력받기
			for(int i=0; i<fruits.length;i++) {
				System.out.println("---- "+(i+1)+"번째 과일 입력 ----");
				fruits[i]=new Fruit();
				System.out.print("과일명: ");
				fruits[i].setName(sc.next());
				System.out.print("무게 : ");
				fruits[i].setWeight(sc.nextDouble());
				System.out.print("색상 : ");
				fruits[i].setColor(sc.next());
				System.out.print("가격 : ");
				fruits[i].setPrice(sc.nextInt());
			}
		} else {
			main(new String[]{"stop"});
		}
		
		
		
		System.out.println("==== 입력된 전체 과일 출력 ====");
		for(Fruit f : fruits) {
			System.out.println(f.outFruit());
		}
		
		System.out.println("==== 무게가 3kg 이상인 과일 출력하기 ====");
		for(Fruit f : fruits) {
			if(f.getWeight()>=3)
				System.out.println(f.outFruit());
		}
		
		System.out.println("==== 가격이 3000 이상인 과일 출력하기 ====");
		for(Fruit f : fruits) {
			if(f.getPrice()>=3000)
				System.out.println(f.outFruit());
		}
	}

}
