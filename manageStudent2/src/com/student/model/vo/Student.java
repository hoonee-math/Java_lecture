package com.student.model.vo;

// 학생 한명에 대한 정보들을 종합적으로 저장하는 클래스
public class Student { // 1011-4-2
	// 1011-4-6 추상화! 하기
	private static int studentCount; // 학생 번호를 자동으로 부여하기 위한 작업
	private int studentNo;
	private String name;
	private int age;
	private int grade;
	private int classNumber;
	private String phone;
	private String address;
	private double height;
	private char gender;
	
	// 1011-4-7 단축키
	// 기본생성자 - ctrl+space 뭘 만들지 않았다면 엔터까지 누르면 기본생성자 바로 생성됨.
	// 매개변수 있는 생성자 - alt+s+a+g // 맥북은 [source] [generate constructor space]
	// setter/getter 만들기 - alt+s+r+a+r // 맥북은 [source] [generate getter/setter] [select all]
	
	// 1011-4-8 학생 번호를 자동으로 생성하는 로직 - 초기화 블럭!
	{
		studentNo=++studentCount;
	}
	
	public Student() {}

//	// 1014-1-3 이건 단축키를 이용해서 자동 생성한 것임. studentNo가 있으면 안되겠죠?
//	public Student(int studentNo, String name, int age, int grade, int classNumber, String phone, String address,
//			double height, char gender) {
	public Student(String name, int age, int grade, int classNumber, String phone, String address,
			double height, char gender) {
//		super(); // 나중에 상속할때 필요한거 일단 지우자
		// 1014-1-4
//		this.studentNo = studentNo;
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.classNumber = classNumber;
		this.phone = phone;
		this.address = address;
		this.height = height;
		this.gender = gender;
	}

	public static int getStudentCount() {
		return studentCount;
	}

//	// 1011-4-9 studentCount 는 수정이 불가능하도록 setter 삭제!
//	public static void setStudentCount(int studentCount) {
//		Student.studentCount = studentCount;
//	}

	public int getStudentNo() {
		return studentNo;
	}

//	// 1014-1-5 학생 번호는 수정되면 안됨
//	public void setStudentNo(int studentNo) {
//		this.studentNo = studentNo;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassNumber() {
		return classNumber;
	}

	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	// 1014-1-11 학생 정보를 출력해주는 기능 만들어 두기
	// getter 메소드를 호출하는 것보다는 직접 접근해서 가져오는 것이 효율 적임.
	// 상속관계에 있거나, private 로 닫혀 있을 때는 method 사용해야 되긴 함.
	public String infoStudent() {
		return this.studentNo+" "+this.name
				+" "+this.age+" "+this.grade
				+" "+this.classNumber+" "+this.phone
				+" "+this.address+" "+this.height
				+" "+this.gender;
	}
	
	
}
