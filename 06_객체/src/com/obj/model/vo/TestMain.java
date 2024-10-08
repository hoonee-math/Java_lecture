package com.obj.model.vo;

public class TestMain {

	public static void main(String[] args) {
		new DefaultTestClass(); // 같은 페이지에 있기 때문에 이용이 가능하다!
		// 경험이 많아지다보면 >>> "어?! 이 클래스는 다른데서 사용하면 안되는데.."
		// 같은 패키지에서 필드에 직접 접근 하기
		FieldTest ft=new FieldTest();
		// FieldMain.java 에서 했던걸 여기서 또 해보자!
//		ft.num=200;
		System.out.println(ft.num);
		ft.name="최광훈"; // name은 default 로 선언 되어있기 때문에 같은 패키지에 있으면 접근 가능
		System.out.println(ft.name);
//		ft.weight=516.1; // weight 는 직접 접근 불가능하다. private 로 선언한 것은 클래스 안에서만 사용
	}

}
