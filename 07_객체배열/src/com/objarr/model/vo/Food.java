package com.objarr.model.vo;

import java.util.Arrays;

public class Food {
	private String name;
	private int price;
	private String type;
	private String[] ingredient;
	
	public Food() {
		// TODO Auto-generated constructor stub
	}

	public Food(String name, int price, String type, String[] ingredient) {
		super();
		this.name = name;
		this.price = price;
		this.type = type;
		this.ingredient = ingredient;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String[] getIngredient() {
		return ingredient;
	}

	public void setIngredient(String[] ingredient) {
		this.ingredient = ingredient;
	}
	
	public String infoFood() {
		return name+" "+price+" "+type+" "+Arrays.toString(ingredient);
	}
}
