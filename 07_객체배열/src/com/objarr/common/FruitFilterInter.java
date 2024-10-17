package com.objarr.common;

import com.objarr.model.vo.Fruit;

//1017-8-2
@FunctionalInterface
public interface FruitFilterInter {
//	boolean checkFruit(Fruit fruit, int value);
	boolean checkFruit(Fruit fruit, Object value);  //1017-8-5 무엇이든 넣을 수 있게 변경
}
