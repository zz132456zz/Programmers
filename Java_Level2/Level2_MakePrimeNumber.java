// 프로그래머스 - 소수 만들기

public class Level2_MakePrimeNumber {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		
		int answer = 0;
		int sum = 0;
		int check = 0;
		
		for(int i = 0; i < nums.length - 2; i++) {
			for(int j = i + 1; j < nums.length - 1; j++) {
				for(int k = j + 1; k < nums.length; k++) {
					sum = nums[i] + nums[j] + nums[k];
					for(int l = 1; l <=sum; l++) {
						if(sum % l == 0) {
							check++;
						}
					}
					if(check == 2) {
						answer++;
					}
					check = 0;
				}
			}
		}
		
		System.out.println(answer);
	}

}
