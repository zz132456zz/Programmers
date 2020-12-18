// 프로그래머스 - [3차] 압축

import java.util.*;

public class Level2_Compression {

	public static void main(String[] args) {
		String msg = "THATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITIS";
		
		int max_len = 1;
		int check = 0;
		
		ArrayList<String> dictionary = new ArrayList<String>(Arrays.asList("A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"));
		ArrayList<Integer> answer_list = new ArrayList<Integer>();
		
		while(true) {
			for(int i = max_len; i > 0; i--) {
				String temp = "";
				if(msg.length() >= i)
					temp = msg.substring(0, i);
				else
					continue;
				
				if(dictionary.contains(temp)) {
					answer_list.add(dictionary.indexOf(temp) + 1);
					
					if(msg.length() > i) {
						dictionary.add(temp + msg.charAt(i));
						max_len = Math.max(max_len, (temp + msg.charAt(i)).length());
						msg = msg.substring(i);
						break;
					}
					else {
						check = 1;
						break;
					}
				}	
			}
			
			if(check == 1)
				break;
		}
		
		int[] answer = new int[answer_list.size()];
		for(int i = 0; i < answer_list.size(); i++) {
			answer[i] = answer_list.get(i);
		}
		
		
		for(int i :answer) {
			System.out.println(i);
		}

	}

}
