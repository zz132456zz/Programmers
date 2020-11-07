// 프로그래머스 - 짝수와 홀수

public class Level1_EvenAndOdd {

	public static void main(String[] args) {
		int num = 3;
		String answer = "";
		
		if(num % 2 == 0)
			answer = "Even";
		else
			answer = "Odd";
		
		System.out.println(answer);
	}

}
