// 프로그래머스 - 가운데 글자 가져오기

public class Level1_middle_letter {

	public static void main(String[] args) {
		
		String s = "abcde";
		
		String str;
		
		if(s.length()%2==1) {
			str = s.substring(s.length()/2, s.length()/2+1);
		} else {
			str = s.substring(s.length()/2-1, s.length()/2+1);
		}
		
		System.out.println(str);
	}

}
