// 프로그래머스 - 두 개 뽑아서 더하기

import java.util.*;

public class Level1_SumOfTwo {

	public static void main(String[] args) {
		int[] numbers = {2,1,3,4,1};
		
		ArrayList<Integer> sum = new ArrayList<Integer>();
		
		for(int i = 0; i < numbers.length - 1; i++) {
			for(int j = i + 1; j < numbers.length; j++) {
				int temp = numbers[i] + numbers[j];
				
				if(sum.indexOf(temp) == -1) {
					sum.add(temp);
				}
			}
		}
	
		Collections.sort(sum);
		
		int[] answer = new int[sum.size()];
		for(int i = 0; i < sum.size(); i++) {
			answer[i] = sum.get(i);
		}
		
		for(int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
	}

}
