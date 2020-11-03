// 프로그래머스 - 자릿수 더하기

public class Level1_digit_plus {

	public static void main(String[] args) {
		
		int n = 123;
		int answer = 0;
		
		while(n != 0) {
			answer += n % 10;
			n = n / 10;
		}
		
		System.out.println(answer);

	}

}
