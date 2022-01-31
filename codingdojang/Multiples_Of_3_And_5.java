package com.min.codingdojang;

import java.util.stream.IntStream;

public class Multiples_Of_3_And_5 {
	public static void main(String[] args) {
		
//		int n = 0;
//		int sum = 0;
//		while(n !=1000) {
//			if(n%3==0 || n%5==0) {
//				sum += n;
//			}
//			n++;
//		}
//		System.out.println(sum);
		
		System.out.println(lambdaSum());
		
	}
	
	public static int lambdaSum() {
		return IntStream.range(1, 1000).filter(f -> f%3==0 || f%5==0).sum();
	}
}
