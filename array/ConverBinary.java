package com.min.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConverBinary {
	public static void main(String[] args) {
		List<Integer> num = new ArrayList<Integer>();
		int n = (int)(Math.random()*100)+1;
		System.out.println(n);
		
		while(true) {
			int y = n%2;
			n = n/2;
			num.add(y);
			if(n == 0 || n == 1) {
				num.add(n);
				break;
			}
		}
		int[] solt = new int[num.size()];
		
		for (int i = 0; i < solt.length; i++) {
			solt[solt.length-i-1] = num.get(i);
		}
		System.out.println(Arrays.toString(solt));
		
	}
}
