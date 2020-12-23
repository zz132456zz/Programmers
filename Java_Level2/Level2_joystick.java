// 프로그래머스 -  조이스틱

public class Level2_joystick {
	
	public static void main(String[] args) {
		String name = "JEROEN";
		int name_len = name.length();
		int answer = 0;	
		int minmove = name_len - 1;
		
		for(int i = 0; i < name_len; i++) {
			answer += 13 - Math.abs(name.charAt(i) - 'N');
			
			int next = i + 1;
			while(next <= name_len - 1 && name.charAt(next) == 'A') {
				next++;
			}
			
			minmove = Math.min(minmove, i + name_len - next + Math.min(i,  name_len - next));	
		}		
		
		System.out.println(answer + minmove);

	}

}
