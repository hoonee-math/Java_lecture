package com.bs.practice.chap02.loop;

import java.util.Random;
import java.util.Scanner;

public class Supplementary {

	public void rockScissorsPaper() {
		Scanner sc=new Scanner(System.in);
		int userType=0;

		Random ran=new Random();
		int comType=0;

		int userV=0, comV=0;
		String result="";

		do{
			System.out.print("가위바위보 게임입니다. \n가위:1 바위:2 보:3 게임종료:0\n숫자를 입력하세요: ");
			userType=sc.nextInt();
			comType=ran.nextInt(3)+1;

			if(userType==0) {
				System.out.printf("컴퓨터 승: %d번,  사용자 승: %d번\n",comV,userV);
				break;
			}
			else if(userType==1){
				switch(comType) {
				    case 1 : result = "비겼습니다."; break;
				    case 2 : result = "컴퓨터가 이겼습니다."; comV++; break;
				    case 3 : result = "사용자가 이겼습니다."; userV++; break;
				    default : result = "결과에 문제가 발생했습니다.";
				}
			}
			else if(userType==2){
				switch(comType) {
				    case 2 : result = "비겼습니다."; break;
				    case 3 : result = "컴퓨터가 이겼습니다."; comV++; break;
				    case 1 : result = "사용자가 이겼습니다."; userV++; break;
				    default : result = "결과에 문제가 발생했습니다.";
				}
			}
			else if(userType==3){
				switch(comType) {
				    case 3 : result = "비겼습니다."; break;
				    case 1 : result = "컴퓨터가 이겼습니다."; comV++; break;
				    case 2 : result = "사용자가 이겼습니다."; userV++; break;
				    default : result = "결과에 문제가 발생했습니다.";
			    }
			} 
			else{
			  System.out.println("0~3서이의 정수를 입력하세요.");  continue;
			}
	
			System.out.printf("컴퓨터는 %d 를 냈습니다. %s \n\n", comType, result);
		} while(userType!=0);
	}



//            정수두개와연산자를입력받고입력된연산자에따라알맞은결과를출력하세요.
//            단, 해당프로그램은연산자입력에“exit”라는값이들어올때까지무한반복하며
//            exit가들어오면“프로그램을종료합니다.”를출력하고종료합니다.
//            또한연산자가나누기이면서두번째정수가0으로들어오면
//            “0으로나눌수없습니다. 다시입력해주세요.”를출력하며,
//            없는연산자가들어올시“없는연산자입니다. 다시입력해주세요.”라고출력하고
//            두경우모두처음으로돌아가사용자가다시연산자부터입력하도록하세요.
//             [다음장출력예시참고]
//                             
//                             연산자(+, -, *, /, %) : +
//                             정수1 : 10
//                             정수2 : 4
//                              10 + 4 = 14

