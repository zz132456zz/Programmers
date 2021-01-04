// 프로그래머스 - 예상 대진표

import java.util.*;

public class Level2_ExpectedListOfMatch {

	public static void main(String[] args) {
		int n = 8;
		int a = 4;
		int b = 7;
		int answer = 1;
		
		while(true) {
			if((a + 1) / 2 == (b + 1) / 2)
				break;
			
			a = (a+1)/2;
			b = (b+1)/2;
			answer++;
		}
		
		System.out.println(answer);

	}

}
