package com.min.codingdojang;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 김씨와 이씨는 각각 몇 명 인가요? 
 * "이재영"이란 이름이 몇 번 반복되나요? 
 * 중복을 제거한 이름을 출력하세요. 
 * 중복을 제거한 이름을 오름차순으로 정렬하여 출력하세요.
 * @author rladn
 *
 */
public class Ex01 {
	public static void main(String[] args) {
		String[] str = { "이유덕", "이재영", "권종표", "이재영", "박민호", "강상희", "이재영", "김지완", "최승혁", "이성연", "박영서", "박민호", "전경헌",
				"송정환", "김재성", "이유덕", "전경헌" };
		Set<String> str2 = new HashSet<String>();
		for (int i = 0; i < str.length; i++) {
			str2.add(str[i]);
		}

		int kimCnt = 0;
		int leeCnt = 0;
		int leejaeyung = 0;
		for (int i = 0; i < str.length; i++) {
			if (str[i].contains("김") == true) {
				kimCnt++;
			} else if (str[i].contains("이") == true) {
				leeCnt++;
			}
			if (str[i].contains("이재영") == true) {
				leejaeyung++;
			}
		}
		String[] arr = str2.toArray(new String[0]);
		Arrays.sort(arr);
		System.out.printf("김씨는 %d명 , 이씨는 %d명\n", kimCnt, leeCnt);
		System.out.printf("이재영은 %d명 입니다\n", leejaeyung);
		System.out.println("중복을 제거한 이름" + str2.toString());
		System.out.println("중복 제거 후 정렬" + Arrays.toString(arr));
	}
}
