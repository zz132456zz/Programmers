// 프로그래머스 - 쿼드압축 후 개수 세기

public class Level2_CountQuadCompression {

	public static void main(String[] args) {
		//int[][] arr = {{1,1,0,0},{1,0,0,0},{1,0,0,1},{1,1,1,1}};
		int[][] arr = {{1,1,1,1,1,1,1,1},{0,1,1,1,1,1,1,1},{0,0,0,0,1,1,1,1},{0,1,0,0,1,1,1,1},{0,0,0,0,0,0,1,1},{0,0,0,0,0,0,0,1},{0,0,0,0,1,0,0,1},{0,0,0,0,1,1,1,1}};
		int[] answer = new int[2];
		
		while(arr.length != 1) {
			int[][] temp = new int[arr.length/2][arr[0].length/2];
			
			for(int i = 0; i < arr.length; i += 2) {
				for(int j = 0; j < arr[0].length; j += 2) {
					if(arr[i][j] == 0 && arr[i][j+1] == 0 && arr[i+1][j] == 0 && arr[i+1][j+1] == 0) {
						temp[i/2][j/2] = 0;
					}else if(arr[i][j] == 1 && arr[i][j+1] == 1 && arr[i+1][j] == 1 && arr[i+1][j+1] == 1) {
						temp[i/2][j/2] = 1;
					}else {
						if(arr[i][j] == 0)
							answer[0]++;
						else if(arr[i][j] == 1)
							answer[1]++;
						
						if(arr[i][j+1] == 0)
							answer[0]++;
						else if(arr[i][j+1] == 1)
							answer[1]++;
						
						if(arr[i+1][j] == 0)
							answer[0]++;
						else if(arr[i+1][j] == 1)
							answer[1]++;
						
						if(arr[i+1][j+1] == 0)
							answer[0]++;
						else if(arr[i+1][j+1] == 1)
							answer[1]++;
						
						temp[i/2][j/2] = 2;
					}
				}
			}			
			arr = temp;
		}
		
		if(arr[0][0] != 2) {
			if(arr[0][0] == 0)
				answer[0]++;
			else if(arr[0][0] == 1)
				answer[1]++;
		}
				
		for(int i : answer) {
			System.out.println(i);
		}

	}

}


