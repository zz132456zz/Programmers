// 프로그래머스 - 정수 제곱근 판별

public class Level1_IntSquareRoot {

	public static void main(String[] args) {
		long n = 121;
		long answer = 0;
		
		double a = Math.sqrt(n) - (long)Math.sqrt(n);
		
		if(a > 0)
			answer = -1;
		else 
			answer = (long)Math.pow(Math.sqrt(n) + 1, 2);
		
		
		System.out.println(answer);
	}

}
