// 프로그래머스 - 카카오프렌즈 컬러링북

import java.util.*;

public class Level2_KakaoFriendsColoring {

	public static void main(String[] args) {
		int m = 6;
		int n = 4;
		int[][] picture= {{1,1,1,0},{1,2,2,0},{1,0,0,1},{0,0,0,1},{0,0,0,3},{0,0,0,3}};
		
		int numberOfArea = 0;
		int maxSizeOfOneArea = 0;
		
		int[] answer = new int[2];
		answer[0] = numberOfArea;
		answer[1] = maxSizeOfOneArea;
		
		boolean[][] check = new boolean[m][n];
		
		Stack<Integer> x = new Stack<>();
		Stack<Integer> y = new Stack<>();
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				int area = 0;
				
				if(picture[i][j] != 0 && !check[i][j]) {
					x.push(i);
					y.push(j);
					answer[0]++;
					area++;
					check[i][j] = true;
				}
				
				while(!x.isEmpty()) {
					int temp_x = x.pop();
					int temp_y = y.pop();
					
					if(temp_x > 0 && picture[temp_x - 1][temp_y] == picture[i][j] && !check[temp_x - 1][temp_y]) {
						x.push(temp_x - 1);
						y.push(temp_y);
						area++;
						check[temp_x - 1][temp_y] = true;
					}
					if(temp_y > 0 && picture[temp_x][temp_y - 1] == picture[i][j] && !check[temp_x][temp_y - 1]) {
						x.push(temp_x);
						y.push(temp_y - 1);
						area++;
						check[temp_x][temp_y - 1] = true;
					}
					if(temp_x < m - 1 && picture[temp_x + 1][temp_y] == picture[i][j] && !check[temp_x + 1][temp_y]) {
						x.push(temp_x + 1);
						y.push(temp_y);
						area++;
						check[temp_x + 1][temp_y] = true;
					}
					if(temp_y < n - 1 && picture[temp_x][temp_y + 1] == picture[i][j] && !check[temp_x][temp_y + 1]) {
						x.push(temp_x);
						y.push(temp_y + 1);
						area++;
						check[temp_x][temp_y + 1] = true;
					}
					
				}
				
				if(answer[1] < area)
					answer[1] = area;
				
			}
		}
		
		System.out.println(answer[0]);
		System.out.println(answer[1]);
	}
	
}
