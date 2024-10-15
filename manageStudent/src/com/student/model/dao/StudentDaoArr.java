package com.student.model.dao;

import com.student.model.vo.Student;

// Student 를 저장하고 관리하는 녀석!
public class StudentDaoArr { 
	private Student[] students = new Student[3];
	
	public boolean insertStudents(Student s) {
		for(int i=0 ; i<students.length ; i++ ) {
			
		}
		return false;
	}
	
	
//	public boolean updateStudent(int grade, int classNumber, String phone, String address) {
	public boolean updateStudnet(Student s) {
		for(Student saveS : students) {
			if(saveS!=null && saveS.getStudentNo() == s.getStudentNo()) {
				saveS.setGender(s.getGender());
				saveS.setClassNumber(s.getClassNumber());
				saveS.setPhone(s.getPhone());
				saveS.setAddress(s.getAddress());
				return true;
			}
		}
		return false;
	}
}
