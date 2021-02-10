// 프로그래머스 - 숫자의 표현

public class Level2_represent_number {

	public static void main(String[] args) {
		int n = 15;
		int answer = 0;
		
		int sum=0;
		
		for(int i=1;i<=n;i++) {
			int j=i;
			while(sum<n) {
				sum+=j;
				j++;
			}
			if(sum==n) {
				answer++;
			}
			sum=0;
		}
		
		
		
		
		
		
		
		System.out.println(answer);
	}

}
