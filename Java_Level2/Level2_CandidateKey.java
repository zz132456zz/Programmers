// 프로그래머스 - 후보키

import java.util.*;

public class Level2_CandidateKey {

	public static void main(String[] args) {
		String[][] relation = {{"100","ryan","music","2"},{"200","apeach","math","2"},{"300","tube","computer","3"},{"400","con","computer","4"},{"500","muzi","music","3"},{"600","apeach","music","2"}};
		int answer = 0;
		
		int check = 0;
		ArrayList<Integer> candidate = new ArrayList<Integer>();
		
		for(int i = 1; i < (1 << relation[0].length); i++) {
			Set<String> set = new HashSet<String>();
			
			for(int j = 0; j < relation.length; j++) {
				String temp = "";
				
				for(int k = 0; k < relation[0].length; k++) {
					if((i & (1 << k)) > 0) 
						temp += relation[j][k] + "_";
				}
				set.add(temp);
			}
			
			if(set.size() == relation.length) {
				for(int a = 0; a < candidate.size(); a++) {
					if((candidate.get(a) & i) == candidate.get(a))
						check = 1;
				}
				if(check == 0)
					candidate.add(i);
				check = 0;
			}
		}
	
		answer = candidate.size();
		
		for(int i = 0; i < candidate.size(); i++)
		{
			System.out.println(candidate.get(i));
		}
		
		System.out.println(answer);
	}

}
