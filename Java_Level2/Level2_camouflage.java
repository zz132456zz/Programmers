// 프로그래머스 - 위장

import java.util.*;

public class Level2_camouflage {

	public static void main(String[] args) {
		String[][] clothes = {{"yellow_hat","headgear"}, {"blue_sunglasses","eyewear"}, {"green_turban","headgear"}};
		int answer = 1;
		
		Map<String, Integer> a = new HashMap<String, Integer>();
		
		for(int i=0;i<clothes.length;i++) {
			if(a.get(clothes[i][1])==null) {
				a.put(clothes[i][1],1);
			}else {
				int j = a.get(clothes[i][1]);
				a.put(clothes[i][1],j+1);
			}
			
		}
		for(int i=0;i<clothes.length;i++) {
			if(a.get(clothes[i][1]) != null) {
				answer *= (a.get(clothes[i][1]) + 1);
				a.remove(clothes[i][1]);
			}
		}
		
		
		
		
		
		System.out.println(answer);
		
	}

}
