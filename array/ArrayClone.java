package com.min.array;

import java.util.Arrays;

public class ArrayClone {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[] b = a.clone();
		
		b[1] = 5;
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}
}
