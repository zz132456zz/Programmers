// 프로그래머스 - 기능개발

import java.util.*;

public class Level2_function_development {

	public static void main(String[] args) {
		int[] progresses = {93,30,55};
		int[] speeds = {1,30,5};
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		int distribute = 0;
		int index = 0;
		
		while(index < progresses.length) {
			for(int i=0;i<progresses.length;i++) {
				progresses[i] += speeds[i];
			}
			
			while(progresses[index]>=100) {
				distribute++;
				index++;
				if(index == progresses.length) {
					break;
				}
			}
			if(distribute!=0) {
				arr.add(distribute);
				distribute=0;
			}
			
			
		}
		int[] answer = {};
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		for(int i=0;i<answer.length;i++) {
			System.out.println(answer[i]);
		}

	}

}
