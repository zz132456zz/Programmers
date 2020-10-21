// 프로그래머스 - 키패드 누르기

import java.util.*;

public class Level1_PressKeypad {

	public static void main(String[] args) {
		int[] numbers = {1,3,4,5,8,2,1,4,5,9,5};
		String hand = "right";
		String answer = "";		
		
		int L_thumb = 10; // 10 = *
		int R_thumb = 12; // 12 = #
		
		for(int i = 0; i < numbers.length; i++) {
			int num = numbers[i];
			
			if(num == 1 || num == 4 || num == 7) {
				answer += 'L';
				L_thumb = num;
			}else if(num == 3 || num == 6 || num == 9) {
				answer += 'R';
				R_thumb = num;
			}else {
				if(num == 0)
					num = 11;
				
				int L_length = (Math.abs(L_thumb - num) / 3) + (Math.abs(L_thumb - num) % 3);
				int R_length = (Math.abs(R_thumb - num) / 3) + (Math.abs(R_thumb - num) % 3);
				
				if(L_length < R_length) {
					answer += 'L';
					L_thumb = num;
				}else if(L_length > R_length) {
					answer += 'R';
					R_thumb = num;
				}else {
					if(hand.equals("left")) {
						answer += 'L';
						L_thumb = num;
					}else if(hand.equals("right")) {
						answer += 'R';
						R_thumb = num;
					}
				}
			}
		}
		
		
		System.out.println(answer);
		
	}

}
