package com.student.controller;

import com.student.model.dao.StudentDao;
import com.student.model.vo.Student;
import com.student.view.MainView;

public class StudentController { // 1011-4-4
	// 1011-4-12 컨트롤러 설계
	//1.메인 화면 출력해주는 서비스
	//2.학생등록 메소드
	//3.학생수정 메소드
	//4.학생삭제 메소드
	//5.전체조회 메소드
	//6.이름으로조회 메소드
	//7.학년으로조회 메소드
	
	// 1011-4-13
	//1.메인 화면 출력해주는 서비스
	// controller 는 뷰한테 ,,, 메인뷰가 갖고있는 특정 ㅇㅇ을 누가... 4:35분 yutube 다시듣기
	public void initMenu() {
		new MainView().mainMenu();
	}
	
	//2.학생등록 메소드
	// 1014-1-7
	public void insertStudent() {
		// 1014-1-8
		// 1. 학생등록화면 -> 화면은 view 에 있음.
		// 2. 등록된 학생을 저장소에 저장 -> 저장하는 것은 Dao 의 기능
		// 3. 등록이 끝나면 client 에게 결과 화면을 출력해줌 -> 다시 View 에게 요청을 함.
		
		// 1. 학생등록화면 -> 화면은 view 에 있음.
		// 1014-1-9
		Student s=new MainView().inputStudent();
		System.out.println(s.infoStudent());	 // 1014-1-10 Student 클래스에 infoStudent() 함수를 만들자!
		
		// 2. 등록된 학생을 저장소에 저장 -> 저장하는 것은 Dao 의 기능
		// 1014-1-12
		// 1014-1-22
		boolean result = new StudentDao().insertStudent(s);
		System.out.println(result?"자료가 저장되었습니다.":"자료 저장에 실패했습니다.");
		
		// 3. 등록이 끝나면 client 에게 결과 화면을 출력해줌 -> 다시 View 에게 요청을 함.
		// 1014-1-16 2에서 저장된 것을 받아와서 보여줘야 하기 때문에 [1014-1-15] Dao 에서 return 값이 있어야 함.
	}
	
	//3.학생수정 메소드
	//4.학생삭제 메소드
	//5.전체조회 메소드
	//6.이름으로조회 메소드
	//7.학년으로조회 메소드
	
}
