import java.util.*;

public class Level2_h_index {

	public static void main(String[] args) {
		int[] citations = {1,2,6,6,7};
		int answer = 0;
		
		Arrays.sort(citations);
		
		if(citations[citations.length - 1] == 0) {
			//return 0;
		}
		
		for(int i = citations[citations.length-1]; i >= 0; i--) {
			int index = citations.length - i;
			if(index >= 0 && citations[index] >= i) {
				answer = i;
				break;
			}
		}
		
		System.out.println(answer);

	}

}
