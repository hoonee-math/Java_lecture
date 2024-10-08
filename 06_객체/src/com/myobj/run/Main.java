package com.myobj.run;

import java.util.Arrays;
import java.util.Scanner;

import com.myobj.vo.Board;
import com.myobj.vo.Employee;
import com.myobj.vo.Users;

// 실행용 클래스
public class Main {
	
	public static void main(String[] args) {

//		myobject프로젝트를 생성하고
//		com.myobj.run.Main -> 1, 2, 3 객체를 생성하고 출력하기
//		com.myobj.vo.Member
//		1. 우리는 커뮤니티사이트를 만들기 위해
//		회원가입을 받으려고한다. 회원에 대한
//		정보를 저장할 객체를 만드세요!
//		 아이디, 비밀번호, 이메일, 나이, 취미의 정보가
//		필요하다 * 객체를 생성해서 직접접근해서 데이터를 저장 2개
//		admin 1234 admin@admin.com 55 운동,코딩
//		user01 1111 user01@user01.com 33 코딩
//		생성 후 출력하기
		
		System.out.println("====== 1.회원가입 받기 ======");
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
		
		
//		com.myobj.vo.Board
//		2. 커뮤니티사이트에서 게시판을 운영
//		할예정이다 게시판 정보를 받을 객체를
//		생성하세요!
//		게시판에는 제목, 글쓴이, 내용, 날짜가
//		들어가야한다.
//		첫번째 글 나야나 첫번째 글쓰다 23/03/10
//		두번째 글 너야나 두번째 글쓰다 23/03/20
//		생성 후 출력하기
		
		System.out.println("\n====== 2.커뮤니티 사이트 게시판 ======");
		Board bd1=new Board();
		Board bd2=new Board();
		
		bd1.title="첫번째 글";
		bd1.author="나냐나";
		bd1.content="첫번째 글쓰다";
		bd1.date="24/10/07";
		
		bd2.title="두번째 글";
		bd2.author="너야너";
		bd2.content="두번째 글쓰다";
		bd2.date="24/10/08";
		
		System.out.printf("%s %s %s %s \n",bd1.title,bd1.author,bd1.content,bd1.date);
		System.out.printf("%s %s %s %s \n",bd2.title,bd2.author,bd2.content,bd2.date);
		System.out.println();
		

//		com.myobj.vo.Employee
//		3. 사원클래스를 생성하여 사용자에게 입력받은 데이터로 생성하기
//		  - 이름, 부서명, 급여, 전화번호, 인센티브(0.00)
//		  - 외부에서 수정할 수 있게 선언
//		  - 5명의 사원을 사용자가 입력한 값으로 생성하여 출력할 것
//		  - 생성 후 입력 순으로 데이터 출력할 것
		
		System.out.println("\n====== 3.사원클래스를 생성 ======");
		
		System.out.println("사용자 정보를 입력해 주세요.");
		Scanner sc=new Scanner(System.in);
		
//		String[] em=new String[5];
		Employee[] em = new Employee[5];
		System.out.print("등록할 사원 수: ");
		int members=sc.nextInt(); //사원수 결정 상수
		
		for(int i=0;i<members;i++) {
//			Employee em[i] = new Employee();
			em[i] = new Employee();
			System.out.printf("%d.이름: ",i+1);	
			em[i].name=sc.next();
			System.out.printf("%d.부서: ",i+1);
			em[i].teamName=sc.next();
			System.out.printf("%d.연봉: ",i+1);
			em[i].income=sc.nextInt();
			System.out.printf("%d.전화: ",i+1);
			em[i].call=sc.next();
			System.out.printf("%d.인센티브(0.00): ",i+1);
			em[i].incentives=sc.nextDouble();
		}
		
		for(int i=0;i<members;i++) {
			System.out.printf(
					"%d번째 사원: %5s %5s %5d %5s %6.1f \n",
					i+1,
					em[i].name,
					em[i].teamName,
					em[i].income,
					em[i].call,
					em[i].incentives
					);
		}
	}

}
