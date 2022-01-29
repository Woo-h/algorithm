package com.min.array;

public class ArrayEqual02 {
	public static void main(String[] args) {
		int[] a = new int[5];

		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100) + 1;
		}

		int[] b = a.clone();

		if (a.length == b.length) {
			
		}
	}
}
