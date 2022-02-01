package com.min.codingdojang;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int cnt1 = 0;
		int cnt2 = 1;
		int breakNum = scan.nextInt();
		
		for (int i = 0; i < 2; i++) {
			arr.add(i);
		}
		
		while (true) {
			sum = 0;
			sum = arr.get(cnt1++)+arr.get(cnt2++);
			
			if(sum > breakNum) {
				break;
			}
			
			arr.add(sum);
		}
		System.out.println(arr.toString());
	}
}
