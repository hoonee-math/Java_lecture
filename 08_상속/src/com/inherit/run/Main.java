package com.inherit.run;

import com.inherit.controller.C_InheritController;
import com.inherit.controller.D_InheritController;
import com.inherit.controller.My_InheritController;

public class Main {

	public static void main(String[] args) {
//		new B_InheritController().useInherit();
		new C_InheritController().objectClassTest();
		new D_InheritController().objectOverride();
		new My_InheritController().testMyInherit();
	}
}
