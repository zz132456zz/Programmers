// 프로그래머스 - [3차] n진수 게임

public class Level2_Base_n_game {

	public static void main(String[] args) {
		int n = 2;
		int t = 4;
		int m = 2;
		int p = 1;
		String answer = "";
		
		int len = (t - 1) * m + p;
		int num = 0;
		String str = "0";
		
		while(true) {
			int temp_num = num++;
			StringBuffer temp_str = new StringBuffer();
			
			while(temp_num != 0) {
				int remainder = temp_num % n;
				
				if(remainder >= 0 && remainder < 10)
					temp_str.append(remainder);
				else if(remainder == 10)
					temp_str.append('A');
				else if(remainder == 11)
					temp_str.append('B');
				else if(remainder == 12)
					temp_str.append('C');
				else if(remainder == 13)
					temp_str.append('D');
				else if(remainder == 14)
					temp_str.append('E');
				else if(remainder == 15)
					temp_str.append('F');
				
				temp_num /= n;
			}
			
			str += temp_str.reverse();
			
			if(str.length() >= len)
				break;
		}
		
		for(int i = p - 1; answer.length() < t; i += m) 
			answer += str.charAt(i);
		
		System.out.println(answer);

	}

}
