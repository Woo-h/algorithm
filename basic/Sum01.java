package com.min.solution;

import java.util.Scanner;

public class Sum01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int sum = 0;
		if (a > 0 && b > 0) {
			if (a < b) {
				for (int i = a; i <= b; i++) {
					sum += i;
				}
			} else {
				System.out.println("아니 처음에 더 작은 수 넣어라");
			}
		} else {
			System.out.println("양수만 넣어라");
		}
		System.out.println(sum);
	}
}
