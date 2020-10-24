// 프로그래머스 - K번째수

import java.util.*;

public class Level1_Kth_number {

	public static void main(String[] args) {
		
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		
		int[] answer = new int[commands.length];
		
		for(int i = 0;i<commands.length;i++) {
			int[] arr = Arrays.copyOf(array, array.length);
			Arrays.sort(arr,commands[i][0]-1,commands[i][1]);
			answer[i] = arr[commands[i][2]+commands[i][0]-2];
		}
		
		
		System.out.println(answer[0]);
		System.out.println(answer[1]);
		System.out.println(answer[2]);
	

	}

}
