package com.min.int2darray;

import java.util.Arrays;

public class Int2DArray {
	public static void main(String[] args) {
		int[][] array = new int[5][5];
		int cnt = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = cnt;
				cnt++;
			}
		}
		System.out.println(Arrays.deepToString(array));
	}
}
