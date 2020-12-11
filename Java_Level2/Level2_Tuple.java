// 프로그래머스 - 튜플

import java.util.*;

public class Level2_Tuple {

	public static void main(String[] args) {
		//String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
		String s = "{{1,2,3},{2,1},{1,2,4,3},{2}}";
		
		ArrayList<Integer> _answer = new ArrayList<>();
		
		String[] str = s.replace("{{","").replace("}}","").split("},\\{");
		
		int[] sequence = new int[str.length];
		for(int i = 0; i < str.length; i++) {
			String[] temp = str[i].split(",");
			sequence[temp.length - 1] = i;
		}
		
		for(int i = 0; i < sequence.length; i++) {
			String[] temp = str[sequence[i]].split(",");
			ArrayList<Integer> arr = new ArrayList<>();
			
			for(int j = 0; j < temp.length; j++) {
				arr.add(Integer.parseInt(temp[j]));
			}
			for(int k = 0; k < _answer.size(); k++) {
				arr.remove(_answer.get(k));
			}
			_answer.add(arr.get(0));
		}
		
		int[] answer = new int[_answer.size()];
		for(int i = 0; i < _answer.size(); i++) {
			answer[i] = _answer.get(i);
		}	
		
		for(int i = 0; i < answer.length; i++) {
			System.out.print(answer[i]);
		}

	}

}
