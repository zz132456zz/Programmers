// ���α׷��ӽ� - ��� ���ϱ�

public class Level1_FindAverage {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		double answer = 0;
		
		for(int i = 0; i < arr.length; i++) {
			answer += arr[i];
		}
		answer /= arr.length;
		
		
		System.out.println(answer);
	}

}
