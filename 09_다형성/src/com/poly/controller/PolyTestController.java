package com.poly.controller;

import java.util.Scanner;

import com.poly.model.vo.A_Child;
import com.poly.model.vo.A_Child2;
import com.poly.model.vo.A_Employee;
import com.poly.model.vo.A_Parent;
import com.poly.model.vo.A_Person;
import com.poly.model.vo.A_Student;
import com.poly.model.vo.A_Teacher;

public class PolyTestController {
	//1
	//1016-6-1
	public void basicTest() {
		//다형성 활용하기
		//부모타입의 변수가 자식객체를 저장할 수 있게 하는 기술
		// 두 클래스가 상속관계로 설정되어야한다.
		//1016-6-2
		A_Parent p;
		p=new A_Parent();
		p=new A_Child(); //1016-6-3 p는 A_Parent 객체임! [1016-6-4] 상속관계를 추가하지 않으면 error
		System.out.println(p);
		
		//1016-6-7
		//부모클래스에 저장된 자식객체 이용하기
		// 부모타입으로 형변환(업캐스팅) 해서 대입되기 때문에
		// 대입되는 순간 부모에 선언된 내용만 사용이 가능하다!
		//사용시 자식 내용을 사용하려면 다운캐스팅(강제형변환)을 해야한다.
		p=new A_Child("안녕 child"); // 업캐스팅? 해서 들어감?
		//1016-6-8
		((A_Child)p).setChildData("오호! 점 찍기 전에 괄호를 쳐야하는구나!"); // 점 접근연산자는 최우선 연산자, 형변환은 나중 연산
		((A_Child)p).setParentData("부모! 점 찍고도 부모 데이터 접근 가능");
		
		//1016-6-10
		p=new A_Child2(10); // parent 를 상속받는 모든 객체를 다 받아올 수 있음.....? youtube 11:14
		
		//1016-6-11
		//Object 클래스는 모든 클래스의 최상위 부모, 제일 위에 있는 것을 루트라고 함.
		// 자바에서 사용하는 모든 클래스를 저장할 수 있는 변수
		Object o;
		o=new Scanner(System.in);
		o=new String("test");
		o=new A_Parent();
		o=new A_Child();
		o=new A_Parent[10];
		// [1016-1-5] 여기서 재정의 했던 equals 에서도 매개변수로 object 를 받아서 사용함. 매개변수로 던져진 값도 업캐스팅 되어있음.
		// 업캐스팅되면 부모꺼만 볼 수 있음.
				
		//1016-6-13
		//변수에 저장된 참조형 타입을 확인하는 예약어가 있다.
		// instanceof
		System.out.println(o instanceof A_Child); // o 에 마지막으로 저장시킨 것은 A_Parent[] 이기때문에 false
		System.out.println(o instanceof A_Parent[]); // o 에 마지막으로 저장시킨 것은 A_Parent[] 이기때문에 true
		
		if(o instanceof A_Parent[]) {
			int length = ((A_Parent[])o).length;
			System.out.println("[6-13] ((A_Parent[])o).length : " + length); // 자식 것을 확인하려면 무조건 강제형변환 해서 사용해야함.
		}
		
		//1016-6-14
		o=new A_Child();
		((A_Child)o).setParentData("[6-14] 부모 데이터");
		((A_Child)o).setChildData("[6-14] 자식 데이터");
		if(o instanceof A_Parent[]) {
			int length = ((A_Parent[])o).length;
			System.out.println(length);
		} else if(o instanceof A_Child) {
			A_Child c = (A_Child)o;
			System.out.println(c.getParentData());
			System.out.println(c.getChildData());
		}
		
		printPerson(new A_Person());
		printPerson(new A_Student());
		printPerson(new A_Teacher());
		printPerson(new A_Employee()); //1016-7-8 // extends 로 A_Person 을 상속만 해주면.. 사용가능하게 됨.
		
		//1016-8-1
		//객체배열에 다형성 적용하기
		A_Person[] persons = new A_Person[5];
		//Person 또는 Student 또는 Teacher 또는 Employee 를 저장할 수 있는 저장소!
		persons[0]=new A_Student();
		persons[1]=new A_Teacher();
		
		//1016-8-2
		persons = new A_Person[] {
				new A_Student("양성준",29,'M',2,1),
				new A_Student("강성민",30,'M',3,2),
				new A_Employee("안윤상",96,'M',"인사팀", "과장"),
				new A_Employee("정다인",26,'F',"개발팀","팀장"),
				new A_Teacher("이민영",26,'M',"수학",1),
				new A_Teacher("최광훈",33,'M',"수학",3)
		};
		//1016-8-3
		//저장된 사람의 객체별 수를 구하기
		// 학생: 00명
		// 선생: 00명
		// 사원: 00명
		//총 00명 출력하기
		int countS=0, countT=0, countE=0, totalCount=0;
		
		for( A_Person pe : persons) {
			if(pe!=null) {
				if(pe instanceof A_Student)	countS++;
				else if(pe instanceof A_Teacher) countT++;
				else if(pe instanceof A_Employee) countE++;
				else System.out.println("잘못된 입력입니다.");
				totalCount++; // 이렇게 해주면 오류가 발생하는 것을 방지할 수 있음.
			}
		}
		
		//1016-8-4
		System.out.printf("학생: %d명 / 선생: %d명 / 사원: %d명\n총 %d명\n",countS,countT,countE,countS+countT+countE); // 이러면 오류에 빠질 수 있음.
		System.out.printf("학생: %d명 / 선생: %d명 / 사원: %d명\n총 %d명\n",countS,countT,countE,totalCount);
		// 저장된 사람들의 평균나이를 구하세요.
		int sumAge=0, countMember=0;
		for( A_Person pe : persons ) {
			sumAge+=pe.getAge();
			countMember++;
		}
		
		//1016-8-5
		System.out.println("저장된 사람의 평균 나이: "+sumAge/(double)countMember);
		// 직책이 팀장인 사람의 정보를 출력하세요.
		for( A_Person pe : persons ) {
				
//			if(((A_Employee)pe).getJob().equals("팀장")) { 이렇게도 가능함!
			if(pe instanceof A_Employee) {
//				A_Employee e = (A_Employee)pe; 이렇게 변환해서 한 번에 접근할 수도 있음.
				System.out.println(pe.getName()
						+" "+pe.getAge()
						+" "+pe.getGender()
						+" "+((A_Employee)pe).getDept()
						+" "+((A_Employee)pe).getJob()
						);
				
			}
		}
		//1016-8-7
		//동적 바인딩 개념
		// 특정한 메소드에 대해서 부모와 자식이 동일한 것을 갖고 있을때(sub 클래스가 super 클래스의 메소드를 오버라이딩 되어 있을 때)
		// [1016-8-6] 와 같이 ... 되어있을 때 저장되어있는ㅇㅇㅇㅇ
		// 실행됐을 때는 부모의 메소드와 연결
		// 런타임 시점에 연결된 sub 클래스의 메소드에 접근해서 실행시킴.
		//부모클래스타입에 자식객체를 저장한 변수가 선언된 동일한 메소드를 호출했을 때,
		// 자식클래스에 선언된 메소드가 실행되는 것
		// 원래는 자식거 못봄.. 오버라이드 되어있는 상태에서는, 부모와 똑같은 메소드가 들어있는 상태에서는 자식꺼를 호출해서 사용한다!
		//1016-8-11
		printPerson(new A_Person("유병승",19,'M'));
		printPerson(new A_Student("이예진",24,'F',2,1));
		printPerson(new A_Teacher("김민호",31,'M',"수영",20));
	}
	
	//1016-7-6
	// Person 뿐만 아니라 Student 와 Teacher 까지 포함하도록 상속을 만들어 둠.
	public void printPerson(A_Person p) {
//		//1016-8-6
//		if(p instanceof A_Student) {
//			A_Student s=(A_Student)p;
////			s. 이런식으로 일일이 코드를 짜주는 번거로움을 이전 개발자들도 고민했음. //1016-8-7 로 go go
//		}
		//1016-8-10
		p.printData(); // 컴파일 시점에서는 부모 객체에 연결된 메소드만 보임. p. - A_Person
		//1016-8-13
		System.out.println(p); // 주소가 출력됨. 얘는 Object 꺼의 toString 을 호출함. 주소를 불러옴. [1016-8-14]에서 toString 을 override 해주면 
	}
	
	//1016-7-9
	public A_Person makePerson(String title) {
		switch(title) {
		case "person" : return new A_Person();
		case "student" : return new A_Student();
		case "teacher" : return new A_Teacher();
		default : return null;
		}
	}
	
}
