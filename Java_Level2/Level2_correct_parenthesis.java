// ���α׷��ӽ� - �ùٸ� ��ȣ

public class Level2_correct_parenthesis {

	public static void main(String[] args) {
		String s = "()()";
		boolean answer = true;
		
		int left = 0;
		int right = 0;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(') {
				left++;
			}else if(s.charAt(i)==')') {
				right++;
			}
			
			if(left < right) {
				answer= false;
				break;
			}
			
			
		}
		if(left != right) {
			answer = false;
		}
		
		
		
		
		System.out.println(answer);
	}

}
