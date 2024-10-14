package com.objarr.run;

import com.objarr.model.vo.Car;
import com.objarr.model.vo.Food;

public class Main {

	public static void main(String[] args) {
		// 다수의 데이터를 저장하기 위해서 배열을 사용함.
		// 배열 타입을 클래스로 줄 수 있음.
		Food[] foods = new Food[5]; // Food 라는 클래스대로 객체들을 만들어서 저장할 수있는 공간
		System.out.println(foods[0]); // Food 객체 하나를 저장할 공간이 생김. foods[0]
		
		// 생성된 Food 배열에 Food 대입하기
		foods[0]=new Food();
		foods[1]=new Food();
		
		// 배열에 저장된 객체에 접근하기
		System.out.println(foods[0].infoFood());
		
		foods[2]=new Food("제육볶음",8000,"한식",new String[] {"돼지고기","대파","고추장"});
		System.out.println(foods[2].infoFood());
		
		// 객체 배열 필드에 저장된 값 가져오기
		// foods 에 저장된 food 객체 이름 가져오기
		foods[0].setName("햄버거");
		foods[1].setName("피자");
		System.out.println(foods[0].getName());
		System.out.println(foods[1].getName());
		System.out.println(foods[2].getName());
		
		// for 문을 이용해서 객체 배열의 데이터 출력하기
		for(int i=0; i<foods.length; i++) {
			if(foods[i]!=null) // 이거 없이 객체 생성 없이 출력하면 null point exception
				System.out.println(foods[i].infoFood());
		}
		
		System.out.println();
		System.out.println();
		System.out.println("===== Car 객체 이용 실습 ======");

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
		
		Car[] cars = new Car[5];
		cars[0] = new Car("대형","검정",300,"타호");
		cars[1] = new Car("중형", "흰색", 500, "GV70");
		
		cars[2] = new Car();
		cars[2].setType("스포츠");
		cars[2].setColor("노랑");
		cars[2].setKm(10);
		cars[2].setName("카마로");
		
		cars[3] = new Car();
		cars[3].setType("소형");
		cars[3].setColor("카키");
		cars[3].setKm(800);
		cars[3].setName("캐스퍼");
		
		cars[4] = new Car();
		cars[4].setType("대형");
		cars[4].setColor("파란");
		cars[4].setKm(600);
		cars[4].setName("타요");
		
		for(int i =0 ; i<cars.length; i++) {
			System.out.println(	// getter 로 바로 받아서 출력하기
					cars[i].getType()+" "+
					cars[i].getColor()+" "+
					cars[i].getKm()+" "+
					cars[i].getName()
				);
		}
		
		System.out.println("==== 배열을 이용한 for문으로 출력하기 ====");
		for(Car car : cars) {System.out.println(	// getter 로 바로 받아서 출력하기
				car.getType()+" "+
				car.getColor()+" "+
				car.getKm()+" "+
				car.getName()
			);
		}
	}

}






