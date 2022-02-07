package com.min.codingdojang;

public class Gobsam {
	public static void main(String[] args) {
		
		int cnt = 0;
		int sum = 0;
		for (int i = 1; i < 1000; i++) {
			if (i%3 == 0 || i%5 == 0) {
				cnt++;
				sum += i;
			}
		}
		System.out.println(cnt);
		System.out.println(sum);
	}
}
