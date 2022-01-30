package com.min.seqsearch;

import java.util.Arrays;
import java.util.Scanner;

public class SeqSearch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		int[] seq = new int[a];
		
		for (int i = 0; i < seq.length; i++) {
			seq[i] = (int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(seq));
		
		int search = scan.nextInt();
		
		for (int i = 0; i < seq.length; i++) {
			if(seq[i] == search) {
				System.out.printf("일치하는 번호는 seq[%d] 번째의 %d 입니다.", i, seq[i]);
				break;
			}
		}
	}
}
