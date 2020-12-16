
public class Level2_ironbar {
	
	public static void main(String[] args) {
		String arrangement = "()(((()())(())()))(())";
		//String arrangement = "(()())";
		int answer = 0;
		
		int bar_num = 0;
		int laser = 0;
		for(int i=0;i<arrangement.length();i++) {
			if(arrangement.charAt(i)=='(') {
				bar_num++;
				laser = 1;
			}else if(laser == 1){
				bar_num--;
				answer += bar_num;
				laser=0;
			}else {
				bar_num--;
				answer++;
				laser = 0;
			}
		}
		
		System.out.println(answer);

	}

}
