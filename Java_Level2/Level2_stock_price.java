// 프로그래머스 - 주식가격

public class Level2_stock_price {

	public static void main(String[] args) {
		int[] prices = {1,2,3,2,3};
		int[] answer = new int[prices.length];
		int stack = 0;
		int flag = 0;
		for(int i=0;i<prices.length;i++) {
			for(int j=i+1;j<prices.length;j++) {
				if(prices[j] < prices[i]) {
					answer[i] = j-i;
					flag = 1;
					break;
				}else {
					stack++;
				}
			}
			if(flag ==0) {
				answer[i]= stack;
			}
			stack = 0;
			flag = 0;
		}
		
		
		
		for(int i=0;i<prices.length;i++) {
			System.out.println(answer[i]);
		}
		
		System.out.println();
		
		
	}

}
