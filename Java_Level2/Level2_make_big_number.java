// 프로그래머스 -  큰 수 만들기

public class Level2_make_big_number {
	
	public static void main(String[] args) {
		String number = "987654321";
		int k = 8;
		
		StringBuilder answer = new StringBuilder();
		answer.append(number);
		
		int i = 0;
		while(k != 0) {	
			if(answer.charAt(i) < answer.charAt(i + 1)) {
				answer.deleteCharAt(i);
				k--;
				i = 0;
				continue;
			}	
			i++;
			
			if(i >= answer.length() - 1) {
				int j = answer.length() - (number.length() - k);
				while(j != 0) {
					answer.deleteCharAt(answer.length() - 1);
					j--;
				}
				break;
			}
			
		}
		
		System.out.println(answer.toString());		
	}

}
