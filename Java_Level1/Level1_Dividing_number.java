// 프로그래머스 - 나누어 떨어지는 숫자 배열

import java.util.*;

public class Level1_Dividing_number {

	public static void main(String[] args) {
		int[] arr = {5,9,7,10};
		int divisor = 5;
		
		
		List<Integer> divided = new ArrayList<>();
		
		for(int i=0;i<arr.length;i++) {
			if((arr[i]%divisor) == 0) {
				divided.add(arr[i]);
			}
		}
		
		Collections.sort(divided);
		
		if(divided.size()==0) {
			int[] answer = {-1};
			System.out.println(answer[0]);
		}
		
		int[] answer = new int[divided.size()];
		
		
		for(int i=0;i<divided.size();i++) {
			answer[i]=divided.get(i);
		}
		
		

	}

}
