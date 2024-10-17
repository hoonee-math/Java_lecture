package com.inherit.model.vo;

import java.util.Arrays;

public class My_Child extends My_Parent{
	
	  private char gender;
	  private String phone;
	  private double height;
	  private String[] skill;

	  public My_Child() {	}

	  public My_Child(String name, int age, char gender,
	                  String phone, double height, String[]	skill) {
	    super(name, age);
	    this.gender = gender;
	    this.phone = phone;
	    this.height = height;
	    this.skill = skill;
	  }

	  public char getGender() {return gender;}
	  public void setGender(char gender) {this.gender = gender;}
	  public String getPhone() {return phone;}
	  public void setPhone(String phone) {this.phone = phone;}
	  public double getHeight() {return height;}
	  public void setHeight(double height) {this.height = height;}
	  public String[] getSkill() {return skill;}
	  public void setSkill(String[] skill) {this.skill = skill;}

	  public String infoChild() {
	      return getMemberNo()+" "+infoParent()+" "+gender+" "
	    		  +phone+" "+height+" "+Arrays.toString(skill);
	  }
	}