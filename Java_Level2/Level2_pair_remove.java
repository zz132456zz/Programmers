// 프로그래머스 - 짝지어 제거하기

import java.util.Stack;

public class Level2_pair_remove {

	public static void main(String[] args) {
		String s = "baabaa";
		Stack<Character> st = new Stack<Character>();
		int answer = 0;
		st.push(s.charAt(0));		
		int i = 1;
		while(i < s.length()) {
			if(st.isEmpty()) {
				st.push(s.charAt(i));
				i++;
				continue;
			}
			if(s.charAt(i) == st.peek()) {
				st.pop();
			}else {
				st.push(s.charAt(i));
			}
			
			i++;
		}
		
		if(st.isEmpty()) {
			answer = 1;
		}
		
		System.out.println(answer);
		
//			for(int i = 0; i < s.length() - 1; i++) {
//				if(s.charAt(i) == s.charAt(i + 1)) {
//					s = s.substring(0, i) + s.substring(i + 2);
//					i = -1;
//				}
//				
//			}
			
		
		
//		if(s.equals(""))
//			answer = 1;
		
	
	}

}
