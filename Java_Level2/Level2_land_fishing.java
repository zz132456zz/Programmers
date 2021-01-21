// ÇÁ·Î±×·¡¸Ó½º - ¶¥µû¸Ô±â

public class Level2_land_fishing {

	public static void main(String[] args) {
		int[][] land = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
		int answer = 0;
		
		for(int i = 1; i < land.length; i++) {
			for(int j = 0; j < 4; j++) {
				if(j == 0) {
					land[i][j] = Math.max(land[i-1][1] + land[i][j], Math.max(land[i-1][2] + land[i][j], land[i-1][3] + land[i][j]));
				}else if(j == 1) {
					land[i][j] = Math.max(land[i-1][0] + land[i][j], Math.max(land[i-1][2] + land[i][j], land[i-1][3] + land[i][j]));
				}else if(j == 2) {
					land[i][j] = Math.max(land[i-1][0] + land[i][j], Math.max(land[i-1][1] + land[i][j], land[i-1][3] + land[i][j]));
				}else if(j == 3) {
					land[i][j] = Math.max(land[i-1][0] + land[i][j], Math.max(land[i-1][1] + land[i][j], land[i-1][2] + land[i][j]));
				}
			}
		}
		
		for(int i = 0; i < 4; i++) {
			if(answer < land[land.length - 1][i]) {
				answer = land[land.length - 1][i];
			}
		}

		
		System.out.println(answer);

	}
	
	

}
