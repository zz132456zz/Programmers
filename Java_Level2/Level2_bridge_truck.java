// 프로그래머스 - 다리를 지나는 트럭

import java.util.*;

public class Level2_bridge_truck {

	public static void main(String[] args) {
		int bridge_length = 100;
		int weight = 100;
		int[] truck_weights = {10,10,10,10,10,10,10,10,10,10};
		int answer = 0;
		
		int[] bridge = new int[bridge_length];
		int time = 0;
		int index = 0;
		int sum = 0;
		while(true) {
			time++;
			for(int i=bridge_length-1;i>0;i--) {
				sum+=bridge[i-1];
				bridge[i]=bridge[i-1];
			}
			if(sum+truck_weights[index]<=weight) {
				bridge[0]=truck_weights[index];
				index++;
			}else {
				bridge[0] = 0;
			}
			if(index==truck_weights.length) {
				break;
			}
			sum=0;
		}
		
		System.out.println(time);
		answer= time+bridge_length;
		System.out.println(answer);
	}

}
