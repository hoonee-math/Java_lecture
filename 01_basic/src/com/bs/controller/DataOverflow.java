package com.bs.controller;

public class DataOverflow {
	public static void main(String[] args) {
		// 데이터 오버플로우
		byte bnum=120;
		for(int i=0; i<1000; i++) {
			System.out.println(bnum++);
		}
	}
}
