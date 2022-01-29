package com.min.solution;

import java.util.Scanner;

public class Min03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, c;
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		int min = a;
		if(b<min) {
			min = b;
		}
		if(c<min) {
			min = c;
		}
		System.out.println(min);
	}
}
