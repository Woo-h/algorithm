package com.min.array;

import java.util.Arrays;

public class ArrayReverse {
	public static void main(String[] args) {
		int[] a = new int[5];
		
		int max = 0;
		int random = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random()*10)+1;
		}
		System.out.println(Arrays.toString(a));
		int tmp;
		for (int i = 0; i < (int)(a.length/2); i++) {
			System.out.printf("요소 : %d 와 요소 : %d 를 교환하였습니다.%n", a[i],a[a.length-1-i]);
			tmp = a[i];
			a[i] = a[a.length-1-i];
			a[a.length-1-i] = tmp;
			System.out.println(Arrays.toString(a));
		} 
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println("모든 요소의 합은 : " + sum);
	}
}
