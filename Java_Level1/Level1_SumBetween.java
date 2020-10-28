// 프로그래머스 - 두 정수 사이의 합

public class Level1_SumBetween {

	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		
		long answer = 0;
		int temp;
		
		if(a > b) {
			temp = a;
			a = b;
			b = temp;
		}
		for(int i = a; i <= b; i++) {
			answer += i;
		}
		
		System.out.println(answer);
	}

}
