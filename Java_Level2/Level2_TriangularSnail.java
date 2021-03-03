// 프로그래머스 - 삼각 달팽이

public class Level2_TriangularSnail {

	public static void main(String[] args) {
		int n = 10;
		
		int sum = 0;
		for(int i = n; i > 0 ; i--)
			sum += i;
		int[] answer = new int[sum];
		
		int index = 0;
		int direction = 0; // 0:down ,1:right, 2:up 
		int num = 1;
		
		int down = 0;
		int down_stack = 0;
		
		int up = n;
		int up_stack = 0;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n-i; j++) {
				if(direction == 0) {
					index = index + down + down_stack;
					answer[index] = num;
					down++;
				}else if(direction == 1) {
					index += 1;
					answer[index] = num;
				}else if(direction == 2) {
					index = index - up + up_stack;
					answer[index] = num;
					up--;
				}
				num++;
			}
			
			if(direction == 0) {
				down_stack += 2;
			}else if(direction == 2) {
				up_stack++;
			}
			down = 0;
			up = n;
			direction += 1;
			direction %= 3;
		}
		
		int check = 0;
		int check2 = 1;
		for(int i=0;i<answer.length;i++) {
			System.out.print(answer[i] + " ");
			check++;
			if(check == check2) {
				System.out.println();
				check = 0;
				check2+=1;
			}
		}

	}

}
