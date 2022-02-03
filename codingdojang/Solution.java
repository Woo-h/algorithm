package com.min.edu;

public class Solution {

	/**
	 * 물건의 가격과 갯수, 쿠폰의 할인율과 갯수를 비교하여
	 * 가장 할인을 많이 받았을때의 total값을 뱉는다.
	 * @param goods 물건의 가격과 갯수가 담긴 2차원배열
	 * @param coupons 쿠폰의 할인률과 갯수가 담긴 2차원 배열
	 * @return 할인받은 물건들의 총 가격
	 */
	public int solution(int[][] goods, int[][] coupons) {
		int sum = 0;
		int good = 0;
		int coupon = 0;

		goods = sort(goods);
		coupons = sort(coupons);

		while (true) {
			if (goods[good][1] == 0) {
				good++;
			} else if (coupons[coupon][1] == 0) {
				coupon++;
			} else {
				sum += goods[good][0] - (goods[good][0] * coupons[coupon][0] / 100);
				goods[good][1] -= 1;
				coupons[coupon][1] -= 1;
			}
			if (good > goods.length -1) {
				break;
			}
		}
		
		for(int i = 0; i<goods.length; i++) {
			if(goods[i][1] != 0) {
				sum += goods[i][0] * goods[i][1];
			}
		}
		
		return sum;
	}

	/**
	 * 버블정렬을 사용해 큰 값을 index 0번으로 보낸다.
	 * @param value goods와 coupons 2차원배열이 들어옴
	 * @return 정렬된 goods와 coupons 2차원배열
	 */
	public int[][] sort(int[][] value) {
		for (int i = 0; i < value.length; i++) {
			for (int j = i + 1; j < value.length; j++) {
				if (value[i][0] < value[j][0]) {
					int[] temp = value[i];
					value[i] = value[j];
					value[j] = temp;
				}
			}
		}
		return value;
	}
}
