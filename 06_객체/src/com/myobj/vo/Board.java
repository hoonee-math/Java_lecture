package com.myobj.vo;

public class Board {
	public String title;
	public String author;
	public String content;
	public String date;
	
	public Board() {}
	// 1010-3-4
	public Board(String inTitle, String inAutor, String inContent, String inDate) {
		title  = inTitle;
		author = inAutor;
		content= inContent;
		date   = inDate;		

	}
	
	public void printMessage() {
		System.out.println(title+" "+author+" "+content+" "+date);
	}
	
}
