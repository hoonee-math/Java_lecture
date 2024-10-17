package com.api.controller;

import java.nio.charset.Charset;

public class StringController {
	public static void main(String[] args) {
		//1017-9-1
		//자바에서 문자열을 관리하는 클래스
		// 3가지가 있다 -> String, StringBuffer, StringBuilder
		
		// String : 기본자료형 처럼 사용, ""리터럴사용, = 연산 사용 / 불변(변경 불가능하다!) - 내부적으로 이 값을 바꿀수가 없음.
		
		// StringBuffer, StringBuilder : 객체사용 방식대로 사용 - 클래스가 제공하는 메소드(instance 메소드-new 로 생성해서 사용해야함)로 데이터를 저장, 수정 / 가변(변경 가능하다!)
		
		//1017-9-2
		// 빌더나 버퍼는 원본값에 직접 접근해서 자료를 수정하게 함.
		// 웹에서 데이터를 사용할때 String 을 사용하면 계속 데이터를 새로 저장하지만, 빌더나 버퍼를 사용하면 메모리 사용 효율을 높일 수 있음.
		
		String data = "유병승"; // 스레드 세이프티? 15:33 youtube 스레드 기능을 내부적으로 이용하지 않는다면 빌더 사용. 이용하지 않는다면 버퍼를 사용하는게 좋음...???? 15:34 youtube
		StringBuilder sb=new StringBuilder("유병승");
		System.out.println(data+data.hashCode());
		System.out.println(sb.toString()+sb.hashCode());
		
		//1017-9-3
		data+="강사";
		System.out.println(data+data.hashCode());
		sb.append("강사");
		System.out.println(sb.toString()+sb.hashCode());
		
		//String 은 변경하지 않는 문자열을 저장할 때 사용하면 됨!
		//StringBuilder 나 StringBuffer 는 자주 변경되는 문자열을 저장할때 사용하면됨. -> 외부에서 데이터를 누적해서 가져온다거나, 데이터를 가공해서 사용할때 사용.
		
		//1017-9-4
		//String 클래스가 제공하는 클래스 (String 은 불변)
		//1.문자열을 합치는 기능 : concat() == '+='
		String test = "풀스택 8기";
//		test.concat("화이팅"); // String 은 반환형이 존재함..?!
		test = test.concat(" 화이팅").concat(" 졸면 안돼요!"); // 그래서 이렇게 사용해야함!
		System.out.println(test);
		
		//2.문자열에서 특정 문자의 포함여부를 확인해주는 기능
		// contains("문자열") : boolean
		boolean result = test.contains("8기");
		System.out.println("test.contains(\"8기\") 결과 : "+result);
		if(test.contains("풀스택")) {
			System.out.println("\'풀스택\'이라는 단어를 포함함!");
		}
			
		//3-1.문자열에서 특정 문자의 index 번호를 찾는 기능
		// indexOf("찾을문자") : 반환형은 int
		System.out.println(test);
		System.out.println(test.indexOf("8"));
		System.out.println(test.indexOf("병승")); // 텍스트를 포함하고 있지 않으면 -1 이 출력됨. 있는지 없는지 확인 가능!
		if(test.indexOf("병승")==-1) {
			System.out.println("아쉽네...");
		}
		
		//3-2.문자열의 뒤에서부터 문자를 찾는 기능 - 파일 확장자를 찾을때!
		// lastIndexOf() : 반환형은 int
		test = "광훈광훈하하하하광훈";
		System.out.println(test.indexOf("광훈"));
		System.out.println(test.lastIndexOf("광훈"));
		
		//3-3.IndexOf 는 그냥쓸 수도 있지만, 시작할 위치를 선언해서 사용할 수 있음.
		// indextOf("문자",시작한인덱스번호) '오버로딩'??
		System.out.println(test.indexOf("광훈",3));
		
		test = "banana";
		System.out.println(test.indexOf("a",test.indexOf("n"))); // 나중에는 subString 을 이용.
		
		//4.문자열을 특정 문자를 기준으로 배열로 변경하는 기능
		// split("특정문자") : String[]
		test="최광훈,유병승,오민현,우민혁,양성준,김민호,이예진,정다인,강성민,";
		String[] names = test.split(",");
		for(String n:names)
			System.out.println(n);
		test="오민혁,19,남,경기도시흥시\n우민혁,31,남,인천시부평구\n김민호,31,남,서울시";
		String[] persons = test.split("\n");
		for(String p:persons) {
			String[] info = p.split(",");
//			new Person(info[0],Integer.parseInt(info[1]),info[2].charAt(0),info[3]); // Person 객체를 만들어놓는다면 이런식으로 사용할 수 있음.
		}
		
		//5.문자열의 특정 문자를 원하는 문자로 변경하는 기능
		// replace("찾을문자","변경문자") : String
		test = "나는 코딩 안맞나봐.. 안 안 안";
		test = test.replace("안","잘");
		System.out.println(test);
		
		//6.배열을 특정문자를 기준으로 문자열로 변경해주는 기능
		// 얘는 String 에 있는 static 메소드임.  static 메소드는 insert 없이 바로 사용 가능!
		// static join("특정문자",배열) : String
		String[] hobby = {"운동","등산","러닝","수영","코딩"};
		test = String.join("=>", hobby);
		System.out.println(test);
		
		//7.문자열을 자르는 기능. 원하는 위치의 문구만 가져오는 기능
		// substring(시작인덱스번호[,끝인덱스번호]) : String //끝인덱스 미만!
		test="오늘 수업 끝";
		System.out.println(test.length());
		System.out.println(test.substring(0,7)); // 7 미만!
		test=test.substring(0,test.length()-1);
		System.out.println(test+" 열심히 하자");
		test=test.substring(3);
		System.out.println(test);
		
		test="test.png";
		String ext=test.substring(test.lastIndexOf("."));
		System.out.println(ext);
		String fileName=test.substring(0,test.indexOf("."));
		System.out.println(fileName);
		
		//8.영문자를 대문자, 소문자로 변경해주는 기능
		// toUpperCase/toLowerCase
		test="abCdEfgHIj";
		System.out.println(test.toUpperCase());
		System.out.println(test.toLowerCase());
		
		//9.문자열의 양쪽 공백을 제거해주는 기능
		// trim
		test="         오늘 참 쉽죠 잉~~          ";
		System.out.println(test);
		System.out.println(test.trim());
		
		//10.기본타입을 문자열로 변경해주는 기능. static 메소드!
		// static valueOf(기본값) : String
		int num=19;
		double dnum=76.4;
		test=String.valueOf(num);
		System.out.println(test);
		System.out.println((int)num);
		test=String.valueOf(dnum);
		System.out.println(test);
		
		//11.문자열에 시작이나 끝문자를 확인해주는 기능
		// startsWith, endsWith : boolean
		test="김민호병승";
		test.startsWith("김"); // "김" 으로 시작하니?
		System.out.println("'김민'으로 시작하니? "+test.startsWith("김민")); // 서버에서 파일 저장할때 조심해야됨!!! 조심해!! 
		System.out.println("'유'로 시작하니? "+test.startsWith("유"));
		
		//12.문자열을 byte 배열로 반환하는 기능
		// 문자열을 잘 쪼갰을 때 인코딩값을 넣어줘야함.
		// getBytes() : byte[]
		test = "두개만 더 하고 끝!";
		byte[] barr1 = test.getBytes(); // 이렇게만 하면 인코딩 방식을 알지 못하기때문에 깨질 수 있음
		byte[] barr2 = test.getBytes(Charset.forName("UTF-8")); // Charset...
		for(byte b : barr1 ) {
			System.out.print(b+",");
		}
		System.out.println();
		for(byte b : barr2 ) {
			System.out.print(b+",");
		}
		String newStr=new String(barr2);
		System.out.println(newStr);
		
		// 주민등록 번호, 계좌번호, 비밀번호 등 양방향 암호화가 필요한지 필요없는지 확인해야함.
		// 비밀번호는 저장하고 끝! 단방향 암호화.
		
		//13.isBlank() / isEmpty()
		test = "";
		System.out.println("test = \"\" 결과: "+test.isEmpty());
		test = " ";
		System.out.println("test = \" \" 결과: "+test.isBlank());
		System.out.println("test = \" \" 결과: "+test.isEmpty());
		test = "안비어있음";
		System.out.println("test = \"안비어있음\" 결과: "+test.isBlank());
		System.out.println("test = \"안비어있음\" 결과: "+test.isEmpty());
		
		//14. formatted() 문자열에 있는 패턴값을 대입해주는 기능, 똑같이 출력가능하게 하는거, 개행, 들여쓰기 등의 문자열에 대한 표시를 해줄 수 있음.
		test = """
				<html>
					<head>
					</head>
					<body>
						<h2>안녕 나는 %s야</h2>
						<p>나는 %d살이야</p>
					</body>
				</html>
				""";
		System.out.println(test);
		
		test = """
				<html>
					<head>
					</head>
					<body>
						<h2>안녕 나는 %s야</h2>
						<p>나는 %d살이야</p>
					</body>
				</html>
				""".formatted("최광훈",19);
		System.out.println(test);
	}
}
















