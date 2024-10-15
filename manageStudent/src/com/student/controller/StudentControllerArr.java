//package com.student.controller;
//
//import com.student.model.dao.StudentDaoArr;
//import com.student.model.vo.Student;
//import com.student.view.MainView;
//
//public class StudentControllerArr {
////	private StudentDao dao=new StudentDao();
//	private StudentDaoArr dao=new StudentDaoArr();
//	private MainView view=new MainView();
//	//1. 메인화면출력해주는 서비스
//	public void initMenu() {
//		view.mainMenu(this);
//	}
//	//2. 학생등록 메소드
//	public void insertStudent() {
//		//1. 학생등록화면 -> View
//		Student s=view.inputStudent();
////		System.out.println(s.infoStudent());
//		//2. 학생을 저장소에 저장 -> Dao
////		boolean result=new StudentDao().insertStudent(s);
//		boolean result=dao.insertStudent(s);
////		System.out.println(result);
//		//3. 클라이언트에게 결과화면 -> View
//		String msg=result?"정상적으로 학생을 등록했습니다."
//				:"학생등록 실패, 관리자에게 문의하세요 :(";
//		view.printMessage(msg);
//	}
//	
//	//3. 학생 수정 메소드
//	
//	//4. 학생 삭제 메소드
//	public void deleteStudent() {
//		//1. 저장된 학생전체 출력 -> 기능
//		this.searchAllStudents();
//		//2. 학생번호를 입력받는 화면을 출력하기 -> view
//		int studentNo=view.inputStudentNumber("삭제");
//		//3. 입력한 번호와 일치한 학생을 찾아서 삭제하기 -> dao
//		boolean result=dao.deleteStudent(studentNo);
//		//4. 삭제결과 출력
//		view.printMessage(result?
//				studentNo+"번 학생이 삭제되었습니다.":
//					"삭제실패, 관리자에게 문의하세요 :(");
//	}
//	
//	
//	//5. 전체조회 메소드
//	public void searchAllStudents() {
//		String result=dao.searchAllStudents();
//		view.printStudent(result);
//	}
//	
//	public void searchStudentByNumber() {
//		//1. 조회번호를 입력
//		int studentNo=view.inputStudentNumber("조회");
//		//2. 입력된 번호와 일치하는 학생을 조회
//		String result=dao.searchStudentByNumber(studentNo);
//		//3. 조회결과를 출력
//		view.printStudent(result);
//	}
//	
//	//6. 이름으로 조회 메소드
//	
//	//7. 학년으로 조회 메소드
//	public void searchStudentByGrade() {
//		int grade=view.inputStudentGrade();
//		String result=dao.searchStudentByGrade(grade);
//		view.printStudent(result);
//	}
//	public void updateStudent() {
//		searchAllStudents();
////		int studentNo = view.inputStudentGrade("번호");
////		Student s = dao.searchStudentByNumberObj(studentNo);
////		view.updateInputData(s);
//	}
//	
//	
//}
//
//
//
//
