package com.min.solution;

import java.util.Scanner;

public class Check01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		if(a>0) {
			System.out.println("a는 양수입니다.");
		} else if(a<0) {
			System.out.println("a는 음수입니다.");
		} else if(a==0) {
			System.out.println("a는 0입니다.");
		}
	}
}
