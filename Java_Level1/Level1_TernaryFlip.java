// 프로그래머스 - 3진법 뒤집기

public class Level1_TernaryFlip {

	public static void main(String[] args) {
		int n = 45;
		int answer = 0;
		
		String ternary = "";
		
		while(n > 0) {
			int temp = n % 3;
			ternary += Integer.toString(temp);
			n /= 3;
		}
		
		int three = 1;
		for(int i = ternary.length() - 1; i >= 0; i--) {
			answer += Integer.parseInt(Character.toString(ternary.charAt(i))) * three;
			three *= 3;
		}
		
		System.out.println(answer);

	}

}
