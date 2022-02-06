package com.min.codingdojang;

import java.util.Scanner;

public class Memory {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("몇개 입력할까요?");
		int a = scan.nextInt();
		
		int[] list = new int[a];
		
		for (int i = 0; i < list.length; i++) {
			int b = scan.nextInt();
			list[i] = b;
		}
		int sum = 0;
		
		for (int i = 0; i < list.length; i++) {
			sum += list[i];
		}
		
		System.out.printf("합은 %d 평균은 %d" , sum, sum/list.length);
		
	}
}
