// 프로그래머스 - 크레인 인형뽑기 게임

public class Level1_doll_game {

	public static void main(String[] args) {
		
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		
		int[] moves = {1,5,3,5,1,2,1,4};
		
		int[] basket = new int[1000];
		int index = 0;
		
		int result = 0;
		
		int arr_len = board.length;
		int mov_len = moves.length;
		
		for(int i=0;i<mov_len;i++) {
			for(int j=0;j<arr_len;j++) {
				if(board[j][moves[i]-1] != 0) {
					basket[index] = board[j][moves[i]-1];
					board[j][moves[i]-1] = 0;
					index++;
					break;
				}
			}
			if(index >= 2 && basket[index-1]==basket[index-2]) {
				basket[index-1] = 0;
				basket[index-2] = 0;
				result += 2;
				index -= 2;
			}
		}
		
		
		// check
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board.length;j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
		// check
		int i=0;
		System.out.println("\nBasket");
		while(basket[i]!=0) {
			System.out.print(basket[i]+" ");
			i++;
		}
		
		System.out.println("\n\nresult : " + result);
		

	}

}
