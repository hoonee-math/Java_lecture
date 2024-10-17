package com.inherit.controller;

import com.inherit.model.vo.My_Cat;
import com.inherit.model.vo.My_Child;

public class My_InheritController {
	  public void testMyInherit() {

	    My_Child user1 = new My_Child("최광훈",32,'남',"010-1234-5678",
	            183.7,new String[] {"java","python"});
	    My_Child user2 = new My_Child();

	    user2.setName("강사님");
	    user2.setAge(19);

	    //System.out.println(user1.infoParent());
	    System.out.println(user1.infoChild());
	    System.out.println(user2.getName());
	    System.out.println(user2.infoChild());
	    
	    
	    // My_Cat cat = new My_Cat("냥이",'M');
	    My_Cat cat = new My_Cat();
	    cat.setName("냥이");
	    cat.setGender('M');
	    cat.move();
	    cat.bark();
	  }
	}