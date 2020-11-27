// 프로그래머스 - 123 나라의 숫자

public class Level2_124_world {

	public static void main(String[] args) {
		int n = 15;
		String answer = "";
		
		int share = 0;
		int rest = 0;
		
		while(n!=0) {
			share = (n-1)/3;
			rest = (n-1)%3;
			if(rest == 0) {
				answer+="1";
			}else if(rest == 1) {
				answer+="2";
			}else if(rest == 2) {
				answer+="4";
			}
			n = share;
		}
		
		String a = (new StringBuffer(answer)).reverse().toString();
		
		
		System.out.println(a);

	}

}
