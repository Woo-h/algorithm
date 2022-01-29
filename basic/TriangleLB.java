package com.min.solution;

import java.util.Scanner;

public class TriangleLB {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
