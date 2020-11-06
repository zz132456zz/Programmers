// 프로그래머스 - 최대공약수와 최소공배수

public class Level1_gcd_lcm {

	public static void main(String[] args) {
		int[] answer = new int[2];
		int n = 3;
		int m = 12;
		
		int gcd = 1;
		for(int i = 1 ;i <= Math.min(n, m); i++) {
			if(n % i == 0 && m % i == 0) {
				gcd = i;
			}
		}
		answer[0] = gcd;
		answer[1] = (n / gcd) * (m / gcd) * gcd;
		System.out.println(answer[0]);
		System.out.println(answer[1]);

	}

}
