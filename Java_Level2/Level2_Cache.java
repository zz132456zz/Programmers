// 프로그래머스 - [1차] 캐시

import java.util.*;

public class Level2_Cache {

	public static void main(String[] args) {
		int cacheSize = 3;
		String[] cities = {"Jeju","Pangyo","Seoul","NewYork","LA","Jeju","Pangyo","Seoul","NewYork","LA"};
		int answer = 0;
		
		if(cacheSize == 0) {
			answer = cities.length * 5;
			//return answer;
		}
		
		String[] Lower = new String[cities.length];
		for(int i = 0; i < cities.length; i++) {
			Lower[i] = cities[i].toLowerCase();
		}
		
		Queue q = new LinkedList();
		
		for(int i = 0; i < Lower.length; i++) {
			if(q.contains(Lower[i])) {
				answer += 1;
				q.remove(Lower[i]);
				q.add(Lower[i]);
			}else if(q.size() < cacheSize){
				answer += 5;
				q.add(Lower[i]);
			}else {
				answer += 5;
				q.poll();
				q.add(Lower[i]);
			}
		}
		
		System.out.println(answer);

	}

}
