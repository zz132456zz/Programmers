
public class Level2_top {

	public static void main(String[] args) {
		int[] heights = {1,5,3,6,7,6,5};
		int[] answer = new int[heights.length];
		
		for(int i = heights.length - 1;i>=0;i--) {
			int j;
			for(j = i;j>=0;j--) {
				if(heights[i]<heights[j]) {
					answer[i]=j+1;
					break;
				}
			}
			if(j<0) {
				answer[i]=0;
			}
			
		}
		
		
		
		for(int i=0;i<answer.length;i++) {
			System.out.println(answer[i]);
		}
	}

}
