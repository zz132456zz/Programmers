// 프로그래머스 - 이진 변환 반복하기

public class Level2_ToBinaryRepeat {

	public static void main(String[] args) {
		String s = "110010101001";
		int[] answer = {0, 0};
		
		while(!s.equals("1")) {
			String temp = "";
			for(int i = 0; i < s.length(); i++) {
				if(s.charAt(i) == '1')
					temp += 1;
				else
					answer[1]++;
			}
			s = Integer.toBinaryString(temp.length());
			
			answer[0]++;
		}
		
		for(int i : answer) {
			System.out.println(i);
		}

	}

}
