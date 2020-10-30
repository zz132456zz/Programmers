// 프로그래머스 - 문자열 다루기 기본

public class Level1_string_control {

	public static void main(String[] args) {
		String s = "1234";
		boolean answer = true;
		
		if(s.length() != 4 && s.length() !=6) {
			answer = false;
		}
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) < '0' || s.charAt(i) > '9') {
				answer = false;
			}
		}
		
		
		System.out.println(answer);

	}

}
