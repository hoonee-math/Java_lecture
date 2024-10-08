package com.myobj.run;

import java.util.Arrays;

import com.myobj.vo.Users;

// 실행용 클래스
public class Main {
	
	public static void main(String[] args) {

		Users user1=new Users();
		Users user2=new Users();
		Users user3=new Users();
//		Users u1,u2,u3;
//		u1=new Users(); // u1에는 0x11 주소가 저장되어있음. u1. 으로 점을 찍으면 heap 영역의 해당 주소로 접근함.
//		u1.id="admin";
//		
		
		user1.id="admin";
		user1.pw="1234";
		user1.eMail="admin@admin.com";
		user1.age=55;
//		user1.hobby="운동,코딩";
		user1.hobby=new String[2];
		user1.hobby[0]="운동";
		user1.hobby[1]="코딩";
//		user1.hobby=new String[] {"운동","코딩"};  // 이런식으로 생성할 수도 있음.
		
		System.out.println(user1.id+" "+user1.pw+" "+user1.eMail+" "+user1.age+" "+Arrays.toString(user1.hobby));
		
		user2.id="user01";
		user2.pw="1111";
		user2.eMail="user01@user01.com";
		user2.age=33;
		user2.hobby=new String[] {"코딩"};		

		System.out.println(user2.id+" "+user2.pw+" "+user2.eMail+" "+user2.age+" "+Arrays.toString(user2.hobby));
		
		user3.id="hoon";
		user3.pw="12345";
		user3.eMail="hoon@hoon.com";
		user3.age=21;
		user3.hobby=new String[] {"코딩","체스","볼링","탁구"};

		System.out.println(user3.id+" "+user3.pw+" "+user3.eMail+" "+user3.age+" "+Arrays.toString(user3.hobby));
		
	}

}
