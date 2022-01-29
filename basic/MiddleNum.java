package com.min.solution;

import java.util.Scanner;

public class MiddleNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b,c;
		a = scan.nextInt(); // b>a>c, c>a>b
		b = scan.nextInt(); // a>b>c, c>b>a
		c = scan.nextInt(); // a>c>b, b>c>a
		int middle = 0;
		if((b>=a && a>=c) || (c>=a && a>=b)) {
			middle = a;
		}else if((a>=b && b>=c) || (c>=b && b>=a)) {
			middle = b;
		}else {
			middle = c;
		}
		System.out.println(middle);
		
	}
}
