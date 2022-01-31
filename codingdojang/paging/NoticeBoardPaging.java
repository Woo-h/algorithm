package com.min.codingdojang.paging;

public class NoticeBoardPaging {

	public int paging(int m, int n) {
		int result = 0;

		if (m >= n && m != 0) {
			result = m / n;
		}
		if (m % n != 0) {
			result++;
		}

		return result;
	}
}
