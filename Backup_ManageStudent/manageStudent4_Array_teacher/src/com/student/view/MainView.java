package com.student.view;

import java.util.Scanner;

import com.student.controller.StudentController;
import com.student.model.vo.Student;

public class MainView {
	//private StudentController studentController=new StudentController();
	//1. 메뉴를 출력하는 기능
	public void mainMenu(StudentController studentController) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("==== 학생관리 프로그램 v1 ====");
			System.out.println("1. 학생등록");
			System.out.println("2. 학생수정(학년,반,전화번호,주소,키,나이)");
			System.out.println("3. 학생삭제");
			System.out.println("4. 전체조회");
			System.out.println("5. 학생번호로 조회");
			System.out.println("6. 학년으로 조회");
			System.out.println("7. 이름으로 조회(동일한것만)");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 : ");
			int choiceMenu=sc.nextInt();
			switch(choiceMenu) {
				case 1 : studentController.insertStudent();break;
				case 2 : studentController.updateStudent();break;
				case 3 : studentController.deleteStudent();break;
				case 4 : studentController.searchAllStudents();break;
				case 5 : studentController.searchStudentByNumber();break;
				case 6 : studentController.searchStudentByGrade();break;
				case 0 : System.out.println("프로그램을 종료합니다. :)");return;
			}
		}
	}
	//2. 학생을 입력받는 기능
	public Student inputStudent() {
		Scanner sc=new Scanner(System.in);
		System.out.println("===== 학생 등록 =====");
		//Student s2=new Student();
		System.out.print("학생이름 : ");
		String name=sc.nextLine();
		//s2.setName(sc.nextLine());
		System.out.print("학생나이 : ");
		int age=sc.nextInt();
		//s2.setAge(sc.nextInt());
		System.out.print("학년(1~3) : ");
		int grade=sc.nextInt();
		System.out.print("반 : ");
		int classNumber=sc.nextInt();
		sc.nextLine();
		System.out.print("전화번호 : ");
		String phone=sc.nextLine();
		System.out.print("주소 : ");
		String address=sc.nextLine();
		System.out.print("키 : ");
		double height=sc.nextDouble();
		System.out.print("성별(남/여) : ");
		char gender=sc.next().charAt(0);
		Student s=new Student(name,age,grade,classNumber
				,phone,address,height,gender);
		
		return s;
	}
	
	//3. 메세지를 출력하는 기능
	public void printMessage(String msg) {
		System.out.println("==== 시스템 메세지 ====");
		System.out.println(msg);
		System.out.println("====================");
	}
	//4. 조회항목을 입력받는 기능
	
	//5. 조회한 결과를 출력해주는 기능
	public void printStudent(String students) {
		System.out.println("===== 학생조회결과 ======");
		if(!students.equals("")) {
			System.out.println(students);
		}else {
			System.out.println("조회된 학생이 없습니다.");
		}
		System.out.println("======================");
	}
	
	//학생번호입력 화면
	public int inputStudentNumber(String title) {
		Scanner sc=new Scanner(System.in);
		System.out.println("===== 학생 "+title+" =====");
		System.out.println(title+"할 학생 번호 : ");
//		int su=sc.nextInt();
//		return su;
		return sc.nextInt();
	}
	public int inputStudentGrade() {
		Scanner sc=new Scanner(System.in);
		System.out.println("==== 학생 학년으로 조회 ====");
		System.out.print("조회할 학년 : ");
		return sc.nextInt();
	}
	public void updateInputData(Student s) {
		Scanner sc=new Scanner(System.in);
		System.out.println("===== 학생 수정 =====");
		System.out.print("학년(1~3) : ");
		int grade=sc.nextInt();
		s.setGrade(grade);
		System.out.print("반 : ");
		int classNumber=sc.nextInt();
		s.setClassNumber(classNumber);
		sc.nextLine();
		System.out.print("전화번호 : ");
		String phone=sc.nextLine();
		s.setPhone(phone);
		System.out.print("주소 : ");
		String address=sc.nextLine();
		s.setAddress(address);

	}
	
}
