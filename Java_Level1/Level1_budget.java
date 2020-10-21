// 프로그래머스 - 예산

import java.util.*;

public class Level1_budget {

	public static void main(String[] args) {
		int[] d = {1,3,2,5,4};
		int budget = 9;
		int answer = 0;

		Arrays.sort(d);

		for(int i=0;i<d.length;i++) {
			budget -= d[i];
			if(budget < 0) {
				//return answer;
			}
			answer++;
		}

		for(int i=0;i<d.length;i++) {
			System.out.println(d[i]);
		}


		System.out.println(answer);
	}

}
