// 프로그래머스 - 실패율

import java.util.*;

public class Level1_fail_rate {

	public static void main(String[] args) {
		
		int N = 5;
		int[] stages = {2,1,2,6,2,4,3,3};
		int[] answer = new int[N];
		
		int[] reach = new int[N+1];
		int[] fail = new int[N+1];
		for(int i = 1; i <= N; i++) {
			for(int j = 0; j < stages.length; j++) {
				if(stages[j] >= i) {
					reach[i]++;
				}
				if(stages[j] == i) {
					fail[i]++;
				}
			}
		}
		
		double[] rate1 = new double[N+1];
		for(int i = 1; i <= N; i++) {
			if(reach[i]==0) {
				rate1[i] = 0;
				continue;
			}
			rate1[i] = (double)fail[i] / (double)reach[i];
		}
		double[] rate2 = new double[N+1];
		System.arraycopy(rate1, 0, rate2, 0, rate1.length);
		
		Arrays.sort(rate2);

		int index = 0;
		int[] check = new int[N+1];
		
		for(int i = N; i >= 1; i--) {
			for(int j = 1; j <= N; j++) {
				if(rate2[i]==rate1[j]) {
					if(check[j]==1) {
						continue;
					}
					answer[index] = j;
					check[j] = 1;
					index++;
					break;
				}
			}
		}
		
		for(int i = 0; i< N; i++) {
			System.out.println(answer[i]);
		}
		

	}
	

}
