package com.student.model.dao;

import com.student.model.vo.Student;

// 종합적으로 데이터를 관리하는 녀석!
// 얘가 관리해야 하는 대상은 Student.
// Student 를 저장하고 관리하는 녀석!
public class StudentDao { // 1011-4-3
	// 1014-1-13
	// student 를 관리하는 역할
	// field 저장공가는 내가 참조한 걸 없애기 전까지, gc 가 접근해서 삭제하기 전까지는 남아있음
	private Student s, s1, s2; // 1014-1-14 student 한 명(객체)을 저장시킴. 아직까지는 여러명을 객체 배열로 저장할 수 없으므로, 변수 세개 지정해보자.
	// 1014-1-20 기본형으로 만들어짐. 참조형 자료형 기본값으로 들어가 있음. null
	
	// 1014-1-15
	// 내 저장소에 학생들을 저장시킬 기능 
	public boolean insertStudent(Student newStudent) { // 1014-1-17 return 저장 결과를 반환해야함. void 로 놔둬도 상관 없음.... 사용자가 불편할 뿐!
		// 1014-1-18 여기서는 매개변수를 Student 객체로 받으면 되겠죠? youtube 9:38
		// 매개변수로 받을 수 있는건 객체 그 자체 밖에 없음...?
		// 1014-1-19 Dao 가 가지고 있는 field 에 저장을 함.
		// 1014-1-21
		if(s==null) s=newStudent;
		else if(s1==null) s1=newStudent;
		else if(s2==null) s2=newStudent;
		else return false; // 저장공간이 부족하면 else에 빠짐. flase
		return true; // else 에 빠지지 않으면 true 
		}
	
	// 1014-2-1 전체 데이터 전달해주기!
	public String searchAllStudents() {
		String infoAll="";
		
		// null 인걸 고려하지 않으면 null point exception 이 뜸.
		if(s!=null) infoAll+=s.infoStudent()+"\n";
		if(s1!=null) infoAll+=s1.infoStudent()+"\n";
		if(s2!=null) infoAll+=s2.infoStudent();
		
		return infoAll;
	}
	
	// 1014-3-4
	public boolean deleteStudent(int studentNo) {
		
		// 1014-3-5
		if(s!=null && s.getStudentNo()==studentNo) {
			s=null;
		} else if(s1!=null && s1.getStudentNo()==studentNo) {
			s1=null;
		} else if(s2!=null && s2.getStudentNo()==studentNo) {
			s2=null;
		} else return false;
		
//		switch(studentNo) {
//			case 1 : s=null; break;
//			case 2 : s1=null; break;
//			case 3 : s2=null; break;
//			default : return false;
//		}
		
		return true;
	}
	
}
