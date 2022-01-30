package com.min.seqsearch;

import java.util.Arrays;
import java.util.Scanner;

public class SeqSearchSen {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();

		int[] seq = new int[a + 1];

		for (int i = 1; i < seq.length; i++) {
			seq[i - 1] = (int) (Math.random() * 100) + 1;
		}
		System.out.println(Arrays.toString(seq));

		int search = scan.nextInt();

		seq[a] = search;

		System.out.println(Arrays.toString(seq));

		for (int i = 0; i < seq.length; i++) {
			if (seq[i] == search) {
				System.out.printf("일치하는 번호는 seq[%d] 번째의 %d 입니다.", i, seq[i]);
				break;
			} else if (seq[seq.length - 1] == search) {
				System.out.println("일치하는 번호가 없습니다.");
				break;
			}
		}
	}
}
