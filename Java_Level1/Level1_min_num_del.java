// 프로그래머스 - 제일 작은 수 제거하기

public class Level1_min_num_del {

	public static void main(String[] args) {
		int[] arr = {4,3,2,1};
		
		int[] answer = new int[arr.length - 1];
		
		int min_index = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < arr[min_index]) {
				min_index = i;
			}
		}
		
		for(int i = 0; i < arr.length - 1; i++) {
			if(i >= min_index) {
				answer[i] = arr[i+1];
			}
			else {
				answer[i] = arr[i];
			}
		}
		
		
		
		System.out.println(answer[0]);
		System.out.println(answer[1]);
		System.out.println(answer[2]);

	}

}
