package com.student.model.dao;

import com.student.model.vo.Student;

public class StudentDao {
	//student를 관리하는 역할
	private Student s,s1,s2,s3,s4,s5,s6,s7,s8,s9;
	
//	Stduent newStudent=new Student;
	//학생 저장하기
	public boolean insertStudent(Student newStudent) {
		//Dao의 필드에 저장
//		s.studentNo=newStudent.getStudentNo();
		if(s==null) s=newStudent;
		else if(s1==null) s1=newStudent;
		else if(s2==null) s2=newStudent;
		else return false;
		return true;
	}
	
	//전체 데이터 전달해주기
	public String searchAllStudents() {
		String students="";
		if(s!=null)	students+=s.infoStudent()+"\n";
		if(s1!=null) students+=s1.infoStudent()+"\n";
		if(s2!=null) students+=s2.infoStudent()+"\n";
		return students;
	}
	
	
	public boolean deleteStudent(int studentNo) {
		
		if(s!=null&&s.getStudentNo()==studentNo) {
			s=null;
		}else if(s1!=null&&s1.getStudentNo()==studentNo) {
			s1=null;
		}else if(s2!=null&&s2.getStudentNo()==studentNo) {
			s2=null;
		}else {
			return false;
		}
		return true;
	}
	
	public String searchStudentByNumber(int studentNo) {
//		if(s!=null||s1!=null||s2!=null) {
		String result="";
		if(s!=null && s.getStudentNo()==studentNo) {
			result=s.infoStudent();
		}else if(s1!=null && s1.getStudentNo()==studentNo) {
			result=s1.infoStudent();
		}else if(s2!=null && s2.getStudentNo()==studentNo) {
			result=s2.infoStudent();
		}
		return result;
//		}
	}
	
	public String searchStudentByGrade(int grade) {
		String result="";
		if(s!=null&&s.getGrade()==grade) result+= s.infoStudent();
		if(s1!=null&&s1.getGrade()==grade) result+= s1.infoStudent();
		if(s2!=null&&s2.getGrade()==grade) result+=s2.infoStudent();
		return result;
	}
	
	
}








