// 프로그래머스 - 괄호 변환

public class Level2_parenthesis_conversion {

	public static boolean correct_string(String str) {
		int left = 0;
		int right = 0;
		boolean correct = true;
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '(')
				left++;
			else if(str.charAt(i) == ')')
				right++;
			
			if(left < right)
				correct = false;
		}
		
		if(left == right && correct)
			return true;
		else 
			return false;
	}
	
	public static String conversion(String str) {
		if(str.equals("")) 
			return "";	
		
		String u = str.substring(0, checkpoint(str)+1);;
		String v = str.substring(checkpoint(str)+1, str.length());;
		
		if(correct_string(u)) {			
			return u + conversion(v);
		}else {
			String temp = "";
			temp = "(" + temp;
			temp = temp + conversion(v);
			temp = temp + ")";
			
			String temp2 = u.substring(1, u.length()-1);
			String temp3 = "";
			for(int i = 0; i < temp2.length(); i++) {
				if(temp2.charAt(i) == '(')
					temp3 = temp3 + ')';
				else
					temp3 = temp3 + '(';
			}		
			
			return temp + temp3;	
		}
	}
	
	public static int checkpoint(String str) {
		int left = 0;
		int right = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '(')
				left++;
			else if(str.charAt(i) == ')')
				right++;
			
			if(left == right) {
				return i;
			}
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		String p = "()))((()";
		String answer = "";
		
		if(correct_string(p)) {
			System.out.println("그대로 리턴");
		}else {
			System.out.println(conversion(p));
		}
		
		System.out.println(answer);

	}

}
