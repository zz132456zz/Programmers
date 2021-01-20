// 프로그래머스 - 구명보트

import java.util.Arrays;

public class Level2_lifeboat {

	public static void main(String[] args) {
		int[] people = {70,80,50};
		int limit = 100;
		int answer = 0;
		
		Arrays.sort(people);
		
		int j = 0;
		for(int i = people.length - 1; i >= 0; i--) {
			if(people[i] > limit - 40) {
				answer++;
			}else {
				if(j < i) {
					if(people[i] + people[j] <= limit) {
						j++;
						answer++;
					}else {
						answer++;
					}
				}else if(i == j) {
					answer++;
					break;
				}else {
					break;
				}
				
				
				
			}
			
			
			
		}
		
		
		System.out.println(answer);

	}

}
