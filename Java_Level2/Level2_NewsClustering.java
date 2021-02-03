// 프로그래머스 - [1차] 뉴스 클러스터링

import java.util.*;

public class Level2_NewsClustering {

	public static void main(String[] args) {
		//String str1 = "handshake";
		//String str2 = "shake hands";
		//String str1 = "FRANCE";
		//String str2 = "french";
		//String str1 = "aa1+aa2";
		//String str2 = "AAAA12";
		String str1 = "E=M*C^2";
		String str2 = "e=m*c^2";
		
		String str1_Lower = str1.toLowerCase();
		String str2_Lower = str2.toLowerCase();
		
		Map<String, Integer> map1 = new HashMap<>();
		Map<String, Integer> map2 = new HashMap<>();
		
		Map<String, Integer> union = new HashMap<>();
		Map<String, Integer> intersection = new HashMap<>();

		for(int i = 0; i < str1_Lower.length() - 1; i++) {
			if(96 < str1_Lower.charAt(i) && str1_Lower.charAt(i) < 123 && 96 < str1_Lower.charAt(i+1) && str1_Lower.charAt(i+1) < 123) {
				String temp = str1_Lower.substring(i, i+2);
				if(map1.containsKey(temp))
					map1.put(temp, map1.get(temp)+1);
				else
					map1.put(temp, 1);
			}
		}
		for(int i = 0; i < str2_Lower.length() - 1; i++) {
			if(96 < str2_Lower.charAt(i) && str2_Lower.charAt(i) < 123 && 96 < str2_Lower.charAt(i+1) && str2_Lower.charAt(i+1) < 123) {
				String temp = str2_Lower.substring(i, i+2);
				if(map2.containsKey(temp))
					map2.put(temp, map2.get(temp)+1);
				else
					map2.put(temp, 1);
			}
		}
		
		if(map1.size() == 0 && map2.size() == 0) {
			System.out.println(65536);
		}	
		
		for(int i = 0; i < map1.size(); i++) {
			String temp = (String)map1.keySet().toArray()[i];	
			if(map2.containsKey(temp)) {
				intersection.put(temp, Math.min(map1.get(temp), map2.get(temp)));
				union.put(temp, Math.max(map1.get(temp), map2.get(temp)));
			}else
				union.put(temp, map1.get(temp));
		}	
		for(int i = 0; i < map2.size(); i++) {
			String temp = (String)map2.keySet().toArray()[i];
			if(!map1.containsKey(temp))
				union.put(temp, map2.get(temp));
		}
			
		double uni = 0;
		double inter = 0;
		
		for(int i = 0; i < union.size(); i++) {
			uni += union.get(union.keySet().toArray()[i]);
		}
		for(int i = 0; i < intersection.size(); i++) {
			inter += intersection.get(intersection.keySet().toArray()[i]);
		}
		
		int answer = (int)(inter / uni * 65536);
		
		System.out.println(answer);
	}

}
