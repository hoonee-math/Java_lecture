package com.student.controller;

import com.student.model.dao.StudentDao;
import com.student.model.vo.Student;
import com.student.view.MainView;

public class StudentController { 
	private StudentDao dao=new StudentDao();
	private MainView view=new MainView();
	//1.메인 화면 출력해주는 서비스
	public void initMenu() {
		view.mainMenu(this); 
	}
	
	//2.학생등록 메소드
	public void insertStudent() {
		// 1. 학생등록화면 -> 화면은 view 에 있음.
		Student s=new MainView().inputStudent();
		System.out.println(s.infoStudent());
		
		// 2. 등록된 학생을 저장소에 저장 -> 저장하는 것은 Dao 의 기능
		boolean result = dao.insertStudent(s);
		// 3. 등록이 끝나면 client 에게 결과 화면을 출력해줌 -> 다시 View 에게 요청을 함.
		String msg = result?"정상적으로 학생을 등록했습니다."
				:"학생등록 실패, 관리자에게 문의하세요 :(";
		view.printMessage(msg); 
	}
	
	//3. 2 학생수정 메소드
	//4. 3 학생삭제 메소드
	public void deleteStudent() {
		// 1. 저장된 학생 전체 출력 -> 기존 기능 이용
		// 2.학생 번호 입력 -> view
		int studentNo = view.inputStudentNum(this,"삭제");  
		// 3.학생 삭제 ->dao
		boolean result = dao.deleteStudent(studentNo);
		// 4.삭제 출력
		view.deleteStudent(result?"정상 삭제되었습니다.":"삭제 실패");
	}
	
	// 전체조회 메소드
	public void searchAllStudents() {
		String result = dao.searchAllStudents();
		view.printStudents(result);
	}
	// 학생 번호로조회 메소드
	public void searchStudentByNumber() {
		// 1. 조회번호를 입력
		int studentNo = view.inputStudentNum(this,"조회");
		// 2. 입력된 번호와 일치하는 학생을 조회
		//  결과가 하나밖에 안나오기 때문에 객체 자체를 그대로 받아서 출력해줘도 됨.
		view.printStudents(dao.searchStudentByNumber(studentNo));
	
	}
	
	// 학년으로조회 메소드
	public void searchStudentByGrade() {
		// 1. 조회 학년을 입력
		int grade = view.inputStudentGrade();
		view.printStudents(dao.searchStudentByGrade(grade));
	
	}
}
