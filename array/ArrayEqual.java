package com.min.array;

public class ArrayEqual {
	public static void main(String[] args) {
		boolean lenCheck = false;
		boolean numCheck = false;
		int[] a = new int[5];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random()*100)+1;
		}
		
		int[] b = a.clone();
		
		if(a.length == b.length) {
			lenCheck = true;
		}
		
		int cnt = 0;
		for (int i = 0; i < b.length; i++) {
			if(a[i] == b[i]) {
				cnt++;
			}
		}
		
		if(cnt ==5) {
			numCheck = true;
		}
		
		if(lenCheck && numCheck) {
			System.out.println("같다");
		}
		
	}
}
