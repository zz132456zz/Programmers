// 프로그래머스 - 이상한 문자 만들기

public class Level1_strange_string {

	public static void main(String[] args) {
		
		String s = "try hello world";

		StringBuilder arr = new StringBuilder(s);
		
		String answer = "";
		
		int index=0;
		
		char ch;
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i)==' ') {
				index=0;
				continue;
			}
			if(index % 2 == 0) { //대문자로
				ch = s.charAt(i);
				if(ch>='a'&&ch<='z') {
					ch += 'A'-'a';
				}
				arr.setCharAt(i, ch);				
			}else { //소문자로
				ch = s.charAt(i);
				if(ch>='A'&&ch<='Z') {
					ch -= 'A'-'a';
				}
				arr.setCharAt(i, ch);
			}
			index++;
		}
		
		answer = arr.toString();
		
		System.out.println(answer);

	}

}
