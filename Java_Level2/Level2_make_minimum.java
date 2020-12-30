// 프로그래머스 - 최솟값 만들기

import java.util.Arrays;
import java.util.Collections;

public class Level2_make_minimum {

	public static void main(String[] args) {
		int[] A = {1,4,2};
		int[] B = {5,4,4};
		Integer[] B2 = new Integer[B.length];
		for(int i=0;i<B.length;i++) {
			B2[i] = B[i];
		}
		
		int answer = 0;
		
		Arrays.sort(A);
		Arrays.sort(B2, Collections.reverseOrder());
		
		for(int i = 0;i<A.length;i++) {
			answer += A[i]*B2[i];
		}
		
		
		
		
		
		
		
		System.out.println(answer);

	}

}
