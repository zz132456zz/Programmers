// ���α׷��ӽ� - ��� ���� ��������

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
