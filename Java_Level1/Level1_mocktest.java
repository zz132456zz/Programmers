// 프로그래머스 - 모의고사

import java.util.*;

public class Level1_mocktest {

	public static void main(String[] args) {
		int[] answers = {1,2,3,4,5};
		List<Integer> first = new ArrayList<Integer>();
		
		int[] student1 = {1,2,3,4,5};
		int[] student2 = {2,1,2,3,2,4,2,5};
		int[] student3 = {3,3,1,1,2,2,4,4,5,5};

		int[] check = new int[3];
		int max=0;
		
		for(int i = 0; i < answers.length; i++) {
			if(answers[i]==student1[i%5]) {
				check[0]++;
			}
			if(answers[i]==student2[i%8]) {
				check[1]++;
			}
			if(answers[i]==student3[i%10]) {
				check[2]++;
			}   
		}
		
		for(int i=0;i<3;i++){
			if(check[i]>max){
				max=check[i];
			}
		}

		for(int i=0;i<3;i++){
			if(max==check[i]){
				first.add(i+1);
			}
		}
		int[] answer = new int[first.size()];

		for(int i=0;i<first.size();i++){
			answer[i]=first.get(i);
		}

		//return answer;

	}

}
