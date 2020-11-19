// 프로그래머스 - 수박수박수박수박수박수?

public class Level1_watermelon {

	public static void main(String[] args) {
		int n = 3;
		
		String answer = "";
		for(int i = 0; i < n; i++) {
			if(i % 2 == 0) {answer += "수";}
			else {answer += "박";}
		}
		
		System.out.println(answer);
	}

}
