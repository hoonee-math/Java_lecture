package com.test.run;

import com.test.model.vo.GetterSetterEx;

public class GetterSetterExMain {

	public static void main(String[] args) {

		GetterSetterEx member1=new GetterSetterEx();
		member1.setName("유병승");
		member1.setTeam("강사부");
		member1.setLevel("강사");
		member1.setSalary(100);
		member1.setBonus(0.5);
//		member1.printAll();
		System.out.println(
				member1.getCodeM()+" "+
				member1.getName()+" "+
				member1.getLevel()+" "+
				member1.getSalary()+" "+
				member1.getBonus()
				);
		
		GetterSetterEx member2=new GetterSetterEx();
		member2.setName("은세계");
		member2.setTeam("학생부");
		member2.setLevel("학생");
		member2.setSalary(10);
		member2.setBonus(0.2);
//		member2.printAll();
		System.out.println(
				member2.getCodeM()+" "+
				member2.getName()+" "+
				member2.getLevel()+" "+
				member2.getSalary()+" "+
				member2.getBonus()
				);
		
		GetterSetterEx member3=new GetterSetterEx();
		member3.setName("황지윤");
		member3.setTeam("학생부");
		member3.setLevel("학생");
		member3.setSalary(10);
		member3.setBonus(0.1);
//		member3.printAll();
		System.out.println(
				member3.getCodeM()+" "+
				member3.getName()+" "+
				member3.getLevel()+" "+
				member3.getSalary()+" "+
				member3.getBonus()
				);
		
		member1.printAll();
		member2.printAll();
		member3.printAll();
	}

}
