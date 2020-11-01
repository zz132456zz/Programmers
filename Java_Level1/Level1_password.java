// 프로그래머스 - 시저 암호

public class Level1_password {

	public static void main(String[] args) {
		
		String s = "a B z";
		int n = 4;
		
		String answer = "";
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c == 32) {
				answer = answer + c;
				continue;
			}
			for(int j = 0; j < n;j++) {
				if(c == 90) {
					c = 65;
					continue;
				}else if(c == 122) {
					c = 97;
					continue;
				}
				c++;
			}
			answer = answer + c;
		}
		
		System.out.println(answer);

	}

}
