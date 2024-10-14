package com.student.model.dao;

import com.student.model.vo.Student;

// Student 를 저장하고 관리하는 녀석!
public class StudentDao { 
	private Student s, s1, s2; 
	
	// 내 저장소에 학생들을 저장시킬 기능 
	public boolean insertStudent(Student newStudent) { 
		if(s==null) s=newStudent;
		else if(s1==null) s1=newStudent;
		else if(s2==null) s2=newStudent;
		else return false; 
		return true; 
		}
	
	// 전체 데이터 전달해주기!
	public String searchAllStudents() {
		String infoAll="";
		
		if(s!=null) infoAll+=s.infoStudent()+"\n";
		if(s1!=null) infoAll+=s1.infoStudent()+"\n";
		if(s2!=null) infoAll+=s2.infoStudent();
		
		return infoAll;
	}
	
	public boolean deleteStudent(int studentNo) {
		
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
	
	public String searchStudentByNumber(int studentNo) {
		if(s!=null && studentNo == s.getStudentNo()) {
			return s.infoStudent();
		} else if(s1!=null && studentNo == s1.getStudentNo()) {
			return s1.infoStudent();
		} else if(s2!=null && studentNo == s2.getStudentNo()) {
			return s2.infoStudent();
		} else {
			return studentNo+"번 학생은 존재하지 않습니다.";
		}
	}
	
	public String searchStudentByGrade(int grade) {
		String result = "";
		
		if(s!=null && grade == s.getGrade()) {
			result += s.infoStudent()+"\n";
		} 
		if(s1!=null && grade == s1.getGrade()) {
			result += s1.infoStudent()+"\n";
		} 
		if(s2!=null && grade == s2.getGrade()) {
			result += s2.infoStudent()+"\n";
		} 
		if(result.equals("")) result=grade+"학년 학생은 존재하지 않습니다.";
		return result;
	}
	
	// 학생 정보 수정을 위한 메소드
	public String modifyStudentInfo(int studentNo,int modifyNo, String modifyInfo) {
		
		switch(studentNo) {
		case 1 : {
				switch(modifyNo) {
				// 학년(1), 반(2), 전화번호(3), 주소(4) + 내용
					case 1 : int grade = (int)(modifyInfo.charAt(0)-'0'); s.setGrade(grade); break;
					case 2 : int classNumber = (int)(modifyInfo.charAt(0)-'0'); s.setClassNumber(classNumber); break;
					case 3 : s.setPhone(modifyInfo); break;
					case 4 : s.setAddress(modifyInfo); break;
					default : return "잘못된 입력입니다.";
				}				
			}; return s.infoStudent();
		case 2 : {
				switch(modifyNo) {
				// 학년(1), 반(2), 전화번호(3), 주소(4) + 내용
					case 1 : int grade = (int)(modifyInfo.charAt(0)-'0'); s1.setGrade(grade); break;
					case 2 : int classNumber = (int)(modifyInfo.charAt(0)-'0'); s1.setClassNumber(classNumber); break;
					case 3 : s1.setPhone(modifyInfo); break;
					case 4 : s1.setAddress(modifyInfo); break;
					default : return "잘못된 입력입니다.";
				}
			}; return s1.infoStudent();
		case 3 : {
				switch(modifyNo) {
				// 학년(1), 반(2), 전화번호(3), 주소(4) + 내용
					case 1 : int grade = (int)(modifyInfo.charAt(0)-'0'); s2.setGrade(grade); break;
					case 2 : int classNumber = (int)(modifyInfo.charAt(0)-'0'); s2.setClassNumber(classNumber); break;
					case 3 : s2.setPhone(modifyInfo); break;
					case 4 : s2.setAddress(modifyInfo); break;
					default : return "잘못된 입력입니다.";
				}
			}; return s2.infoStudent();
		}
		
		
		return "잘못된 입력입니다.";
	}
	
	public boolean insertExample() {
		s = new Student("유병승",19,1,5,"010-1234-1234","경기도 안산",180.5,'남');
		s1 = new Student("최광훈",33,2,6,"010-1234-5678","충남 천안",173.5,'남');
		s2 = new Student("오민현",20,3,7,"010-9876-5432","서울",190,'남');
		return true;
	}
	
	public String searchStudentByName(String name) {
		String resrult ="";
		if(s.getName().equals(name)) resrult +=s.infoStudent()+"\n";
		if(s1.getName().equals(name)) resrult +=s1.infoStudent()+"\n";
		if(s2.getName().equals(name)) resrult +=s2.infoStudent();
		
		return resrult;
	}
	
}
