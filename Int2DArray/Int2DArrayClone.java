package com.min.int2darray;

import java.util.Arrays;

public class Int2DArrayClone {
	public static void main(String[] args) {
		int[][] array = {{1,2,3,4},{5,6}};
		System.out.println(Arrays.deepToString(array));
		
		int[][] arrayClone = array.clone();
		System.out.println(Arrays.deepToString(arrayClone));
	}
}
