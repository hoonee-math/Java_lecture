package com.inherit.model.vo;

public class My_Parent {
	
	  private static int totalMemberCount;
	  private int memberNo;
	  private String name;
	  private int age;

	  {
	      memberNo=++totalMemberCount;
	  }
	  public My_Parent() {}
	  public My_Parent(String name, int age) {
	//  super(); // 상속관계에서 최상위 클래스임.
	//  this.memberNo = memberNo; //자동 생성됨.
	    this.name = name;
	    this.age = age;
	  }
	  //호출할 일 없음!
	//public static int getTotalMemberCount() {
	//  return totalMemberCount; }
	//public static void setTotalMemberCount(int totalMemberCount) {
	//  My_Parent.totalMemberCount = totalMemberCount; }
	  public int getMemberNo() {return memberNo;}
	//public void setMemberNo(int memberNo) {this.memberNo = memberNo;}
	  public String getName() {return name;}
	  public void setName(String name) {this.name = name;}
	  public int getAge() {return age;}
	  public void setAge(int age) {this.age = age;}

	  //상속해서만 사용할 메소드임.
	  protected String infoParent() { return name+" "+age+"세"; }
	}