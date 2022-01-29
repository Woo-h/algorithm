package com.min.array;

import java.util.Arrays;

public class ArrayMax {
	public static void main(String[] args) {
		int[] a = new int[5];
		int[] b = a.clone();
		int max = 0;
		int random = 0;
		for (int i = 0; i < a.length; i++) {
			random = (int)(Math.random()*10)+1;
			a[i] = random;
			b[b.length-1-i] = random;
		}
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(max);
	}
}
