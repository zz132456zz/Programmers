// 프로그래머스 - 문자열 내 마음대로 정렬하기

import java.util.*;

public class Level1_String_sort {

	public static void main(String[] args) {
		
		String[] strings = {"abce","abcd","cdx"};
		int n = 2;
		
		Arrays.sort(strings);
		
		List<String> arr = new ArrayList<String>();
		
		for(int i='a';i<='z';i++) {
			for(int j=0;j<strings.length;j++) {
				if(strings[j].charAt(n)==i) {
					arr.add(strings[j]);
				}
			}
		}
		
		String[] answer = arr.toArray(new String[arr.size()]);
		
		for(int i=0;i<strings.length;i++) {
			System.out.println(answer[i]);
		}
		

	}

}
