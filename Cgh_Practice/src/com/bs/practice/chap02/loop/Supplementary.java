package com.bs.practice.chap02.loop;

import java.util.Random;
import java.util.Scanner;

public class Supplementary {

	public void rockScissorsPaper() {
		Scanner sc=new Scanner(System.in);
		int userType=0;

		Random ran=new Random();
		int comType=0;

		int userV=0, comV=0, same=0;
		String result="";

		do{
			System.out.print("가위바위보 게임입니다. \n가위:1 바위:2 보:3 게임종료:0\n숫자를 입력하세요: ");
			userType=sc.nextInt();
			comType=ran.nextInt(3)+1;

			if(userType==0) {
				System.out.println("\n\n====== 가위 바위 보 게임 최종 결과 ======");
				System.out.printf("컴퓨터 승: %d번,  사용자 승: %d번, 무승부: %d번",comV,userV,same);
				break;
			}
			else if(userType==1){
				switch(comType) {
				    case 1 : result = "비겼습니다."; same++; break;
				    case 2 : result = "컴퓨터가 이겼습니다."; comV++; break;
				    case 3 : result = "사용자가 이겼습니다."; userV++; break;
				    default : result = "결과에 문제가 발생했습니다.";
				}
			}
			else if(userType==2){
				switch(comType) {
				    case 2 : result = "비겼습니다."; same++; break;
				    case 3 : result = "컴퓨터가 이겼습니다."; comV++; break;
				    case 1 : result = "사용자가 이겼습니다."; userV++; break;
				    default : result = "결과에 문제가 발생했습니다.";
				}
			}
			else if(userType==3){
				switch(comType) {
				    case 3 : result = "비겼습니다."; same++; break;
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
}
