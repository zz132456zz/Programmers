// 프로그래머스 - 문자열 압축

public class Level2_string_compression {

	public static void main(String[] args) {
		String s = "ababcdcdababcdcd";
		int answer = s.length();
		
		for(int i = 1; i <= s.length() / 2; i++) {
			String[] arr = new String[s.length() / i];
			String temp = "";
			int num = 1;
			
			for(int j = 0; j < s.length() / i; j++) {
				arr[j] = s.substring(j * i, j * i + i);
			}
			
			for(int a = 0 ; a < s.length() / i; a++) {
				if(a == s.length() / i -1 && num != 1) {
					temp = temp + Integer.toString(num) + arr[a];
					break;
				}else if(a == s.length() / i - 1) {
					temp = temp + arr[a];
					break;
				}
				
				if(arr[a].equals(arr[a + 1])) {
					num++;
				}else if(num != 1) {
					temp = temp + Integer.toString(num) + arr[a];
					num = 1;
				}else {
					temp = temp + arr[a];
				}
			}
			
			int result = temp.length() + s.length() % i;
			
			if(result < answer) {
				answer = result;
			}
			
		}
		
		
		
		System.out.println(answer);
	}

}
