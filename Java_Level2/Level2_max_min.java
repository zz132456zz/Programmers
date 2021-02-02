// 프로그래머스 - 최댓값과 최솟값

public class Level2_max_min {

	public static void main(String[] args) {
		String s = "-1 -2 -3 -4";
		String answer = "";
		
		String[] str = new String[s.length()];
		str = s.split(" ");
		
		int[] arr = new int[str.length];
		
		for(int i=0;i<str.length;i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		
		int max=arr[0], min = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(max < arr[i]) {
				max = arr[i];
			}else if(min > arr[i]) {
				min = arr[i];
			}
		}
		
		answer += min +" "+max;
		
		for(int i=0;i<str.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println(answer);

		
		
	}

}
