// 프로그래머스 - 프린터

import java.util.*;

public class Level2_printer {

	public static void main(String[] args) {
		int[] priorities = {2,1,3,2};
		//int[] priorities = {1,1,9,1,1,1};
		int location = 2;
		
		int answer = 0;
		
		int[] point = new int[priorities.length];
		point[location] = 1;
		
		Queue<Integer> q1 = new LinkedList<Integer>();
		Queue<Integer> q2 = new LinkedList<Integer>();
		
		PriorityQueue<Integer> p_q = new PriorityQueue<Integer>(priorities.length, new Comparator<Integer>() {
			public int compare(Integer w1, Integer w2) {
				return w1 >= w2 ? -1 : 1;
			}
		});
		
		for(int i=0;i<priorities.length;i++) {
			p_q.offer(priorities[i]);
			q1.offer(priorities[i]);
			q2.offer(point[i]);
		}
		
		
		
		while(!q1.isEmpty()) {
			if(q1.peek()==p_q.peek()) {
				q1.poll();
				p_q.poll();
				answer++;
				if(q2.poll()==1) {
					System.out.println(answer);
					return;
				}
			}else {
				q1.offer(q1.poll());
				q2.offer(q2.poll());
			}
			
			
			
		}

		while(!p_q.isEmpty()) {
			//System.out.println(p_q.poll());
		}
		
		for(int i=0;i<priorities.length;i++) {
			//System.out.println(point[i]);
		}
	}

}
