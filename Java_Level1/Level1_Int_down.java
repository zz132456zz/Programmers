// 프로그래머스 - 정수 내림차순으로 배치하기

import java.util.Arrays;

public class Level1_Int_down {

	public static void main(String[] args) {
		
		long n = 118372;
		
		String n_to_s = Long.toString(n);
		char[] str = new char[n_to_s.length()];
		String reverse = "";	
		
		
		for(int i = 0; i < n_to_s.length(); i++) {
			str[i] = n_to_s.charAt(i);
		}
		
		Arrays.sort(str);
		
		for(int i = str.length - 1; i >= 0; i--) {
			reverse += str[i];
		}
		
		Long.parseLong(reverse);
		
		System.out.println(reverse);
	}

}
