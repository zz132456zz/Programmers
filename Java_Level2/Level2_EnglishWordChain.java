// 프로그래머스 - 영어 끝말잇기

import java.util.*;

public class Level2_EnglishWordChain {

	public static void main(String[] args) {
		int n = 3;
		String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		int[] answer = {0,0};
		
		ArrayList<String> used = new ArrayList<>();
		used.add(words[0]);
		
		for(int i = 1; i < words.length; i++) {
			if(used.get(i-1).charAt(used.get(i-1).length()-1) != words[i].charAt(0)) {
				answer[0] = i % n + 1;
				answer[1] = i / n + 1;
				break;
			}
			if(used.contains(words[i])) {
				answer[0] = i % n + 1;
				answer[1] = i / n + 1;
				break;
			}
			
			used.add(words[i]);
		}
		
		
		for(int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}

	}

}
