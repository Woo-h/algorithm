package com.min.codingdojang;

public class TabToWhiteSapce {
	public static void main(String[] args) {
		String hello =  "\t안녕하세요\t하이";
		System.out.println(hello.replaceAll("	", "    "));
	}
}
