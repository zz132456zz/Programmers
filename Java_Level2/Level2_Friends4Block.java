// 프로그래머스 - [1차] 프렌즈4블록

public class Level2_Friends4Block {

	public static void main(String[] args) {
		int m = 4;
		int n = 5;
		String[] board = {"CCBDE","AAADE","AAABF","CCBBF"};
		//int m = 6;
		//int n = 6;
		//String[] board = {"TTTANT","RRFACC","RRRFCC","TRRRAA","TTMMMF","TMMTTJ"};
		int answer = 0;
		
		boolean[][] check = new boolean[m][n];
		
		char[][] arr_board = new char[m][n];
		for(int i = 0; i < m; i++) {
			arr_board[i] = board[i].toCharArray();
		}
		
		boolean flag = true;
		while(true) {
			for(int i = 0; i < m-1; i++) {
				for(int j = 0; j < n-1; j++) {
					char temp = arr_board[i][j];
					if(temp != 0 && temp == arr_board[i][j+1] && temp == arr_board[i+1][j] && temp == arr_board[i+1][j+1]) {
						check[i][j] = true;
						check[i][j+1] = true;
						check[i+1][j] = true;
						check[i+1][j+1] = true;
						flag = false;
					}
				}
			}
			
			for(int i = 0; i < m; i++) {
				for(int j = 0; j < n; j++) {
					if(check[i][j]) {
						answer++;
						check[i][j] = false;
					
						for(int k = i; k > 0 ; k--) {
							arr_board[k][j] = arr_board[k-1][j]; 
							arr_board[k-1][j] = 0;
						}	
					}
				}
			}
				
			if(flag)
				break;
			
			flag = true;
		}
		
		System.out.println(answer);
	}

}
