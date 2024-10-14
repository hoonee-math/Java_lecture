package com.student.view;

import java.util.Scanner;

import com.student.controller.StudentController;
import com.student.model.vo.Student;

// 나중에 html 로 빠질 영역, jsp 화면
public class MainView {	// 1011-4-1
	// 1014-1-28
//	private StudentController studentController = new StudentController();
	// 1011-4-10 view 설계
	//1.메뉴를 출력하는 기능
	//2.학생을 입력받는 기능
	//3.메시지를 출력하는 기능
	//4.조회항목을 입력받는 기능
	//5.조회한 결과를 출력해주는 기능
	// 이것들을 메소드로 만들자!

	// 1011-4-11
	//1.메뉴를 출력하는 기능
//	public void mainMenu() {
	// 1014-1-34 매개변수로 studentController 객체를 넣어줌!
	public void mainMenu(StudentController studentController) {
		Scanner sc=new Scanner(System.in); // 공통 영역으로 올려서 써도 되는데, 쓰레기값 버퍼를 지워줘야 하는 번거로움이 생김
		while(true) {
			System.out.println("==== 학생관리 프로그램 v1 ====");
			System.out.println("1. 학생등록");
			System.out.println("2. 학생수정");
			System.out.println("3. 학생삭제");
			System.out.println("4. 전체조회");
			System.out.println("5. 학생 번호로 조회");
			System.out.println("6. 학년으로 조회");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택: ");
			int choiceMenu=sc.nextInt();
			switch(choiceMenu) {
//				case 1: new StudentController().insertStudent(); break;
//				// 1014-1-27 여기서도 기능이 new 로 새로 만들어지고 있어서, 저장소가 컨트롤러 마다 새로 생성되고 있었음.
				case 1: studentController.insertStudent(); break; // 1014-1-29
				case 2: System.out.println("개발중...."); break;
				case 3: System.out.println("개발중...."); break;
				case 4: System.out.println("개발중...."); break;
				case 5: System.out.println("개발중...."); break;
				case 6: System.out.println("개발중...."); break;
				case 0: System.out.println("프로그램을 종료합니다. :)"); return;
				// return 하면 호출한 곳으로 되돌아감!
				default : break;
			}
		}
	}
	//2.학생을 입력받는 기능
	// return을 받으면 매개변수가 없어도 되고, return이 없으면 매개변수를 채워서 값을..
	// 1014-1-1 youtube 0908
	// 매개변수로 student 를 받으면 반환형이 없어도 됨. ㅇㅇㅇㅇ
	// 외부에서 받은 생성된 객체에 값을 넣으주느냐? 일반적으로는 반환형이 있도록 만들어줌. ㅇㅇㅇ
	public Student inputStudent() {
		Scanner sc=new Scanner(System.in);
		System.out.println("====== 학생 등록 ======");
//		// 1014-1-6 입력받을 때는 default 를 생성해서 setter로 해서 집어넣을 수도 있음.
//		Student st1=new Student();
		
		System.out.print("학생 이름: ");
		String name=sc.nextLine(); // sc.nextLine() 도 String 을 return 받는 method
//		st1.setName(sc.nextLine()); // 1014-1-6 이렇게 입력받을 수 있음.
		System.out.print("나이: ");
		int age=sc.nextInt();
		System.out.print("학년(1~3): ");
		int grade=sc.nextInt();
		System.out.print("반: ");
		int classNumber=sc.nextInt();
		sc.nextLine(); //nextInt로  받았던전례가 있기 때문에 다음 nextLine 을 받기 전에 공란을 만들어줌
		System.out.print("전화번호: ");
		String phone=sc.nextLine();
		System.out.print("주소: ");
		String address=sc.nextLine();        
		System.out.print("키: ");
		double height=sc.nextDouble();
		System.out.print("성별(남/여): ");
		char gender=sc.next().charAt(0);
		
		// 1014-1-2
		Student s=new Student(name, age, grade, classNumber, phone, address,
				height, gender);
		return s;
	}
	
	//3.메시지를 출력하는 기능
	// 1014-1-38 // 시스템 메시지를 출력해줌. 어떤 기능에서든 msg 를 넣어서 사용하면됨.
	public void printMessage(String msg) {
		System.out.println("===== 시스템 메세지 =====");
		System.out.println(msg);
		System.out.println("=====================");
	}
	//4.조회항목을 입력받는 기능
	//5.조회한 결과를 출력해주는 기능
	// 이것들을 메소드로 만들자!
	
	
}







