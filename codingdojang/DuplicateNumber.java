package com.min.codingdojang;


public class DuplicateNumber {
	public static void main(String[] args) {
		String[] sample = { "0123456789", "01234", "01234567890", "6789012345", "012322456789"};
		for (int i = 0; i < sample.length; i++) {
			if (isCheck(sample[i].split("")) == true) {
				System.out.print(true + " ");
			} else {
				System.out.print(false + " ");
			}
		}

	}

	public static boolean isCheck(String[] arr) {
		boolean isc = false;
		if (arr.length == 10 && isCheckNum(arr) != true) {
			isc = true;
		}
		return isc;
	}
	
	public static boolean isCheckNum(String[] arr) {
		boolean isc = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					isc = true;
					break;
				}
			}
		}
		return isc;
	}
}
