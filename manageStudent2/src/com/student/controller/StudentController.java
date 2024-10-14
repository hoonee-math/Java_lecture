package com.student.controller;

import com.student.model.dao.StudentDao;
import com.student.model.vo.Student;
import com.student.view.MainView;

public class StudentController { // 1011-4-4
	// 1014-1-25
	private StudentDao dao=new StudentDao();
	// 1014-1-32
	private MainView view=new MainView();
	
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
	// controller 는 뷰한테 ,,, 메인뷰가 갖고있는 특정 ㅇㅇ을 누가... 4:35분 youtube 다시듣기
	public void initMenu() {
//		new MainView().mainMenu(); // 1014-1-30 MainView 도 결국 기능이니까 new 로 만들어지고 있겠지?
		view.mainMenu(this); // 1014-1-33 // 1014-1-35 매게변수로 this를 받음
		// 실행시켜 보면 오류! Exception in thread "main" java.lang.StackOverflowError
		// 얘가 쓸 수 있는 공간은 한정되어있는데, 꽉 찼다는 의미!
		//  Main 에서 StudentController 객체를 생성했음. 그 다음 StudentController 여기로 가서 MainView를 생성함
		//  MainView 가서 StudentController 객체를 생성...함?! 계속 서로 만들고 있음!
		//  StudentController 에서 MainView 는 view 객체로 그대로 두자 // 1014-1-34
		
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
//		boolean result = new StudentDao().insertStudent(s);// 1014-1-23 실행시킬 때마다 Dao 객체가 새로 생김! 같은 Dao 객체에 저장해야하는데 계속 새로운 Dao 객체가 만들어지고 있음.
//		// 1014-1-24 기능을 제공하는 class 에 대해서는 객체를 하나만 생성해서 사용해야함. vo 나 Dto 같은 경우는 여러개 만들지만
//		//  controller 나 Dao 같은 기능을 제공하는 것은 한번만 생성하게 만든 후에 G.C가 실행될때만 삭제되야 함.
		// 1014-1-26 new 로 새로 만들지 않고 dao 객체 하나를 미리 만들어놓고 dao 변수로 받아서 객체에 저장함
		boolean result = dao.insertStudent(s);
//		System.out.println(result?"자료가 저장되었습니다.":"자료 저장에 실패했습니다."); // 1014-1-38 개발자가 보는 화면 출력 안함.
		
		// 3. 등록이 끝나면 client 에게 결과 화면을 출력해줌 -> 다시 View 에게 요청을 함.
		// 1014-1-16 2에서 저장된 것을 받아와서 보여줘야 하기 때문에 [1014-1-15] Dao 에서 return 값이 있어야 함.
		// 1014-1-37 view 로 보여주자!
		String msg = result?"정상적으로 학생을 등록했습니다."
				:"학생등록 실패, 관리자에게 문의하세요 :(";
		view.printMessage(msg); // 1014-1-39 사용자에게 보여줄 view 화면에 기능을 추가함.
	}
	
	//3. 2 학생수정 메소드
	//4. 3 학생삭제 메소드
	public void deleteStudent() {
		// 1014-3-1
		// 1. 저장된 학생 전체 출력 -> 기존 기능 이용
		// 2. 학생 번호를 입력받는 화면을 출력하기 -> view
		// 3. 입력한 번호의 일치한 학생을 찾아서 삭제하기 -> dao
//		searchAllStudents();
		// MainView 클래스의 delelteStudentNum 에서 StudentController 의 기능을 사용하기 위해 매개변수로 StudentController 로 객체를 받아서 사용함.
		// 여기서는 매개변수로 현재 객체 자체를 받아오기 위해 this를 사용함.
//		this.searchAllStudents();
		// 1014-3-3 2.학생 번호 입력
		int studentNo = view.inputStudentNum(this,"삭제");  
		// 1014-3-6 3.학생 삭제 ->dao
		boolean result = dao.deleteStudent(studentNo);
		// 1014-3-7 4.삭제 출력
		view.deleteStudent(result?"정상 삭제되었습니다.":"삭제 실패");
	}
	
	//5. 4 전체조회 메소드
	// 1014-2-2 
	public void searchAllStudents() {
		String result = dao.searchAllStudents();
		view.printStudents(result);
	}
	//6. 5 학생 번호로조회 메소드
	public void searchStudentByNumber() {
		// 1. 조회번호를 입력
		int studentNo = view.inputStudentNum(this,"조회");
		// 2. 입력된 번호와 일치하는 학생을 조회
		//  결과가 하나밖에 안나오기 때문에 객체 자체를 그대로 받아서 출력해줘도 됨.
		view.printStudents(dao.searchStudentByNumber(studentNo));
	
	}
	
	//7. 6 학년으로조회 메소드
	public void searchStudentByGrade() {
		// 1. 조회번호를 입력
		int grade = view.inputStudentGrade();
		// 2. 입력된 번호와 일치하는 학생을 조회
		//  결과가 하나밖에 안나오기 때문에 객체 자체를 그대로 받아서 출력해줘도 됨.
		view.printStudents(dao.searchStudentByGrade(grade));
	
	}
}
