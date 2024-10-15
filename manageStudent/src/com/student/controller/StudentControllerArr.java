package com.student.controller;

import com.student.model.dao.StudentDaoArr;
import com.student.model.vo.Student;
import com.student.view.MainView;

public class StudentControllerArr { 
	private StudentDaoArr dao=new StudentDaoArr();
	private MainView view=new MainView();
	
	
	public void searchAllStudents() {
		
	}
	
	public void updateStudent() {
		searchAllStudents();
//		int studentNo = view.inputStudentGrade("번호");
//		Student s = dao.searchStudentByNumberObj(studentNo);
//		view.updateInputData(s);
	}
	
	
}




