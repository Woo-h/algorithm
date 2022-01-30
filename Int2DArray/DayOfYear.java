package com.min.int2darray;

import java.util.Scanner;

public class DayOfYear {
	
	final static int[][] mday = {
			{31,28,31,30,31,30,31,31,30,31,30,31},
			{31,29,31,30,31,30,31,31,30,31,30,31}
			};
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		int month = scan.nextInt();
		int day = scan.nextInt();
		int result = 0;
		
//		for (int i = 0; i < month-1; i++) {
//			if(isCheck(year) ==1 ) {
//				result += mday[1][i];
//			} else {
//				result += mday[0][i];
//			}
//		}
		int i = 0;
		while (i != month-1) {
			
			if(isCheck(year) ==1 ) {
				result += mday[1][i];
			} else {
				result += mday[0][i];
			}
			i++;
		}
		
		result += day;
		
		if(isCheck(year) == 1) {
			System.out.println("윤년입니다");
		} else {
			System.out.println("평년입니다");
		}
		System.out.println("총 일수는 "+result);
	}
	
	public static int isCheck(int year) {
		return (year%4 == 0 && year%100!=0 || year%400==0)? 1 : 0;
	}
	
}
