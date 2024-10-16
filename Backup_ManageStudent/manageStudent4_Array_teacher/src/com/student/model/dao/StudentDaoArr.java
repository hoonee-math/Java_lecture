package com.student.model.dao;

import com.student.model.vo.Student;

public class StudentDaoArr {
	private Student[] students=new Student[10];
	
	public boolean insertStudent(Student s) {
		//boolean result=false;
		for(int i=0;i<students.length;i++) {
			if(students[i]==null) {
				students[i]=s;
//				result=true;
//				break;
				return true;
			}
//			else {
//				result=false;
//			}
		}
		return false;
//		return result;
//		for(Student saveS : students) {
//			if(saveS==null) {
//				saveS=s;
//				return true;
//			}
//		}
	}
	
	public String searchAllStudents() {
		String result="";
		for(Student s : students) {
			if(s!=null) {
				result+=s.infoStudent()+"\n";
			}
		}
		return result;
	}
	public String searchStudentByNumber(int num) {
//		String result="";
		for(Student s:students) {
			if(s!=null&&s.getStudentNo()==num) {
//				result+=s.infoStudent()+"\n";
				return s.infoStudent();
			}
		}
//		return result;
		return "";
	}
	
	public String searchStudentByGrade(int grade) {
		String result="";
		for(Student s : students) {
			if(s!=null&&s.getGrade()==grade) {
				result+=s.infoStudent()+"\n";
			}
		}
		return result;
	}
	public boolean deleteStudent(int studentNo) {
		for(int i=0;i<students.length;i++) {
			if(students[i]!=null
					&&students[i].getStudentNo()==studentNo) {
				students[i]=null;
				return true;
			}
		}
		return false;
	}
//	public boolean updateStudent(int grade, int classNumber, 
//					String phone, String address) {
//		
//		return false;
//	}
	public boolean updateStudent(Student s) {
		for(Student saveS : students) {
			if(saveS!=null
					&&saveS.getStudentNo()==s.getStudentNo()) {
				saveS.setGrade(s.getGrade());
				saveS.setClassNumber(s.getClassNumber());
				saveS.setPhone(s.getPhone());
				saveS.setAddress(s.getAddress());
				return true;
			}
		}
		return false;
	}
	
	public Student searchStudentByNumberObj(int studentNo) {
		for(Student s : students) {
			if(s!=null&&s.getStudentNo()==studentNo) {
				return s;
			}
		}
		return null;
	}
	
	
	
}






