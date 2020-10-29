// 프로그래머스 - 문자열 내 p와 y의 개수

public class Level1_p_y_num {

	public static void main(String[] args) {
		String s = "Pyy";
		boolean answer = true;
		
		int p_num = 0;
		int y_num = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'p' || s.charAt(i) == 'P') {
				p_num++;
			}else if(s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
				y_num++;
			}
		}
		
		if(p_num != y_num) {
			answer = false;
		}
		
		
		System.out.println(answer);
	}

}
