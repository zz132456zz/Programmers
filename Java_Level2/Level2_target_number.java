// 프로그래머스 - 타겟 넘버

import java.util.*;

public class Level2_target_number {

	public static int dfs(int[] numbers, int n, int sum, int target) {
		if(n == numbers.length) {
			if(sum == target) {
				return 1;
			}
			return 0;
		}
		return dfs(numbers,n+1,sum+numbers[n],target) + dfs(numbers,n+1,sum-numbers[n],target);
	}
	
	public static void main(String[] args) {
		int[] numbers = {1,1,1,1,1};
		int target = 3;
		int answer = 0;
		
		answer = dfs(numbers,0,0,target);
		
//		int check=0;
//		int index = 0;
//		int max = (int) Math.pow(2, numbers.length);
//		
//		while(max > index) {
//			String s = Integer.toBinaryString(index);
//			int len = s.length();
//			for(int i=0;i<numbers.length-len;i++) {
//				s = "0" + s;
//			}
//			for(int i=0;i<numbers.length;i++) {
//				if(s.charAt(i)=='0') {
//					check += numbers[i];
//				}else {
//					check -= numbers[i];
//				}
//			}
//			if(check == target) {
//				answer++;
//			}
//			check=0;
//			index++;
//		}
		
		
		System.out.println(answer);
	}

}
