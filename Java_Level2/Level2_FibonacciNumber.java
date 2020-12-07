// 프로그래머스 - 피보나치 수

public class Level2_FibonacciNumber {

	public static void main(String[] args) {
		int n = 3;
		
		int[] fib = new int[n+1];
		fib[0] = 0;
		fib[1] = 1;
		for(int i = 2; i <= n; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
			fib[i] %= 1234567;
		}
		
		System.out.println(fib[n]);
	}

}
