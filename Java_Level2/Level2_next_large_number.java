// 프로그래머스 - 다음 큰 숫자

public class Level2_next_large_number {

	public static void main(String[] args) {
		int n = 78;
		int answer = 0;
		
		String bin = Integer.toBinaryString(n);
		
		int bin_1 = 0;
		for(int i=0;i<bin.length();i++) {
			if(bin.charAt(i)=='1') {
				bin_1++;
			}
		}
		
		int answer_1 = 0;
		
		while(bin_1 != answer_1) {
			answer_1 = 0;
			n++;
			String bin2 = Integer.toBinaryString(n);
			
			for(int i=0;i<bin2.length();i++) {
				if(bin2.charAt(i)=='1') {
					answer_1++;
				}
			}
			
			
		}
		
		answer = n;
		System.out.println(answer);
	}

}
