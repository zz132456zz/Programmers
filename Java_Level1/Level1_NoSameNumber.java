// 프로그래머스 - 같은 숫자는 싫어

import java.util.*;

public class Level1_NoSameNumber {

	public static void main(String[] args) {
		
		int[] arr = {1,1,3,3,0,1,1};
		
		int[] answer = {};
		
		List<Integer> number = new ArrayList<>();
		
		int check = arr[0];
		number.add(check);
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!=check) {
				number.add(arr[i]);
				check=arr[i];
			}
		}
		answer = new int[number.size()];
		
		for(int i = 0;i<number.size();i++) {
			answer[i]=number.get(i);
		}
		
		

	}

}
