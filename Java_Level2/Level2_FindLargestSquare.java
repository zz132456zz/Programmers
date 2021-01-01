// 프로그래머스 - 가장 큰 정사각형 찾기

public class Level2_FindLargestSquare {

	public static void main(String[] args) {
		int[][] board = {{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}};
		//int[][] board = {{1,0},{0,0}};
		int answer = 0;
		
		for(int i = 1; i < board.length; i++) {
			for(int j = 1; j < board[0].length; j++) {
				int diagonal = board[i - 1][j - 1];
				int left = board[i][j - 1];
				int above = board[i - 1][j];
				
				if(board[i][j] != 0)
					board[i][j] = Math.min(diagonal, Math.min(left,above)) + 1;
			}
		}
		
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[0].length; j++) {
				if(answer < board[i][j])
					answer = board[i][j];
			}
		}
			
		answer *= answer;
		
		
		/*
		int check = 0;
		int end = 0;
		
		for(int max_len = Math.min(board.length, board[0].length); max_len > 0; max_len--) {			
			for(int x = 0; x < board.length - max_len + 1; x++) {
				for(int y = 0; y < board[0].length - max_len + 1; y++) {	
					for(int i = x; i < x + max_len; i++) {
						for(int j = y; j < y + max_len; j++) {
							if(board[i][j] == 0) {
								check = 1;
								break;
							}
						}
						if(check == 1)
							break;		
					}
					if(check == 0) {
						answer = max_len * max_len;
						end = 1;
						break;
					}
					check = 0;
				}
				if(end == 1)
					break;
			}
			if(end == 1)
				break;
		}
		*/
		
		System.out.println(answer);

	}

}
