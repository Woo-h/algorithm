package com.min.solution;

import java.util.Scanner;

public class Max04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a, b, c, d;
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		d = scan.nextInt();
		int max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		if (d > max) {
			max = d;
		}
		System.out.println(max);

	}
}
