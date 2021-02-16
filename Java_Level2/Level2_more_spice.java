// 프로그래머스 - 더 맵게

import java.util.*;

public class Level2_more_spice {

	public static void main(String[] args) {
		int[] scoville = {1,2,3,9,10,12};
		int K = 7;
		int answer = 0;
		
		Arrays.sort(scoville);
		
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		for(int i=0;i<scoville.length;i++) {
			q.add(scoville[i]);
		}
		
		while(q.peek() < K) {
			int temp1 = q.poll();
			int temp2 = q.poll();
			int temp3 = temp1+ temp2*2;
			q.add(temp3);
			
			answer++;
			if(q.size() == 1 && q.peek() < K) {
				System.out.println("-1");
				break;
			}
		}
		
		System.out.println(answer);
		
		
		System.out.println(q.size());
		
		int size = q.size();
		for(int i=0;i<size;i++) {
			System.out.println(q.poll());
		}
		
		System.out.println(answer);
	}

}
