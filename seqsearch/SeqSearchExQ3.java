package com.min.seqsearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SeqSearchExQ3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		System.out.println(Arrays.toString(a));
		
		int key = scan.nextInt();
		ArrayList<Integer> idx = new ArrayList<Integer>();
		
		for (int i = 0; i < a.length; i++) {
			if(a[i] == key) {
				idx.add(i);
			}
		}
		System.out.println(idx.toString());
		System.out.println(idx.size());
		
	}
}
