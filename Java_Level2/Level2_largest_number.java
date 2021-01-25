// 프로그래머스 - 가장 큰 수

import java.util.*;

public class Level2_largest_number {

	public static void main(String[] args) {
		int[] numbers = {0,0,0};
		
		String answer = "";
		
		ArrayList<String> arr = new ArrayList<String>();
		for(int i=0;i<numbers.length;i++) {
			arr.add(Integer.toString(numbers[i]));
		}
		
		Collections.sort(arr, new Comparator<String>() {
			public int compare(String s1, String s2) {
				return (s2+s1).compareTo(s1+s2);
			}
		});
		
		if(arr.get(0).equals("0")) {
			System.out.println(0);
		}
		
		for(int i=0;i<numbers.length;i++) {
			answer += arr.get(i);
		}
		
		for(int i=0;i<numbers.length;i++) {
			System.out.println(arr.get(i));
		}
		
		System.out.println(answer);

	}

}
