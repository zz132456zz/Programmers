// 프로그래머스 - 카펫

public class Level2_carpet {

	public static void main(String[] args) {
		int brown = 24;
		int yellow = 24;
		int[] answer = new int[2];
		
		int x;
		int y;
//		x-2 * y-2 = yellow;
//		xy -2x -2y +4
//				
//		x*2 + y*2 - 4 = brown
//		2x + 2y - 4
		
		int sum = brown + yellow;
		for(int i = 3; i <= sum; i++) {
			if(sum % i == 0) {
				if(((sum / i) - 2) * (i - 2) == yellow && (sum / i)*2 +i*2 - 4 == brown) { 
					answer[0] = sum/i;
					answer[1] = i;
					break;
				}
			}
		}
		
		
		
		System.out.println(answer[0]);
		System.out.println(answer[1]);

	}

}
