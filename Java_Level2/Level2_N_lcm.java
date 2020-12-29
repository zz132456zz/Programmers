// 프로그래머스 - N개의 최소공배수

public class Level2_N_lcm {

	public static void main(String[] args) {
		int[] arr = {2,6,8,14};
		int answer = 0;
		
		int check = 0;
		
		while(true) {
			answer++;
			for(int i = 0; i < arr.length; i++) {
				if(answer % arr[i] == 0)
					check++;
			}
			if(check == arr.length)
				break;
			check = 0;
		}
		
		System.out.println(answer);
		
	}

}
