// 프로그래머스 - 하샤드 수

public class Level1_HarshadNumber {

	public static void main(String[] args) {
		int x = 10;
		boolean answer = true;
		
		int sum = 0;
		int temp = x;
		
		for(int i = 0; i < 5; i++) {
			sum += temp % 10;
			temp /= 10;
		}
		if(x % sum == 0)
			answer = true;
		else
			answer = false;
		
		
		System.out.println(answer);

	}

}
