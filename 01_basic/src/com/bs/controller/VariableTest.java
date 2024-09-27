package com.bs.controller;

public class VariableTest {
	public static void main(String[] args) {
		// 변수 선언하기
		// 자료형 변수명;
		
		// 진위형
		boolean isCompleted; // 통상 불리언 변수명은 is변수명;
		isCompleted = true;
		isCompleted = false;
//		isCompleted = 1; 불가능
		
		// 단일 문자
		char alpha;
		alpha = 'a';
		alpha = '1'; // 얘는 litereal 이 char 임!
		
		// 문자열
		String name;
		name = "최광훈";
//		name = '최' 불가능!
		
		// 숫자
		int age;
		age=20;
		long account$;
		account$ = 2200000000L; // 숫자 뒤에 L을 붙이지 않으면 아무리 long형 변수에 저장된 값이라도 int로 인식하기 때문에 오류가 발생함. 
		double height;
		height = 180.5;
		float height_;
		height_ = 180.5f;
		
		
		// 변수 명명 규칙 관례
		// 1. 대소문자 구분, 길이의 제한이 없음
		// 2. 예약어는 사용 불가능
		// 3. 숫자로 시작하면 안 된다.
		// 4. 특수기호는 '_', '$' 만 사용할 수 있다.
		double _weight;
		long $account;
		// 이런것도 가능
		// 5. 변수명에 한글 작성가능 but 사용하지 않기!
		
		// 변수 선언시 주의사항
		// 변수를 선언할 때 같은 영역에서는 동일한 변수명으로 선언할 수 없다.
		// 영역? 중괄호로 표시! 같은 중괄호 내에 동일한 변수명을 사용할 수 없다는 이야기임.
		
//		String name;
		
		
		
		// 변수 호출하기
		// 변수명을 작성하면 호출
		System.out.println(height);
		
		// 변수에는 한개의 값만 저장이 가능하다.
		
		// 변수는 선언과 동시에 초기화를 할 수 있다.
		String hobby = "볼링";
		
		// 동일한 자료형의 여러변수를 선언하기
		int age1=19, age2=20, age3=30;
		
		
		
		// 상수 선언하기
		// 변경할 수 없는 변수(저장공간)
		// final 자료형 변수명;
		final int AGE = 19;
//		AGE = 20;
		final String STUDENT_NAME="최광훈";	// final 변수명은 언더바를 이용해서 카멜 케이스로 명명한다.
		final int errorCode1=404, errorCode2=500;
		
	}
	String name; //  여기서 변수명 name 을 사용하면 에러가 나지 않는다!
}
