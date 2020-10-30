// 프로그래머스 - 문자열 내림차순으로 배치하기

import java.util.ArrayList;

public class Level1_string_down {

	public static void main(String[] args) {
		
		String s = "Zbcdefg";
		
		String answer = "";
		
		ArrayList<Character> arr = new ArrayList<>();
		
		for(int i='z';i>='a';i--) {
			for(int j=0;j<s.length();j++) {
				if(s.charAt(j)==i) {
					arr.add(s.charAt(j));
				}
			}
		}
		for(int i='Z';i>='A';i--) {
			for(int j=0;j<s.length();j++) {
				if(s.charAt(j)==i) {
					arr.add(s.charAt(j));
				}
			}
		}
		
		for(int i=0;i<s.length();i++) {
			answer += arr.get(i);
		}
		
		System.out.println(s);
		System.out.println(answer);

	}

}
