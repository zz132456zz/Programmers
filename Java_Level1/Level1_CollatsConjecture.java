// 프로그래머스 - 콜라츠 추측

public class Level1_CollatsConjecture {

	public static void main(String[] args) {
		int num = 6;
		int answer = 0;
		
		while(num != 1) {
			if(answer >= 500) {
				answer = -1;
				break;
			}
			if(num % 2 == 1) {
				num *= 3;
				num += 1;
				answer++;
			}else {
				num /= 2;
				answer++;
			}
		}
		
		System.out.println(answer);
	}

}
