// 프로그래머스 - 완주하지 못한 선수

import java.util.*;

public class Level1_marathon {

	public static void main(String[] args) {
		
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		
		String answer = "";
		
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		int i;
		for(i=0;i < completion.length;i++) {
			if(!participant[i].equals(completion[i])) {
				answer = participant[i];
				//return answer;
			}
		}
		answer = participant[i];
		//return answer;
		System.out.println(answer);
		
		
		
		
//		ArrayList<String> list = new ArrayList();
//		
//		for(int i=0;i<participant.length;i++) {
//			list.add(participant[i]);
//		}
//		for(int j=0;j<completion.length;j++) {
//			list.remove(completion[j]);
//		}
//		System.out.println(list.get(0));
		
		
//		String answer ="";
//		int index = 0;
//		
//		for(int i=0;i<participant.length;i++) {
//			index = Arrays.asList(completion).indexOf(participant[i]);
//			if(index==-1) {
//				answer = participant[i];
//				System.out.println(answer);
//			}
//		}
//		
//		HashMap<String,String> test1 = new HashMap<String,String>();
//		
//		for(int i=0;i<participant.length;i++) {
//			test1.put(participant[i], participant[i]);
//		}
//		for(int j=0;j<completion.length;j++) {
//			if(completion[j].equals(test1.get(completion[j]))) {
//				test1.remove(completion[j]);
//			};
//		}
//		System.out.println(test1);
//		System.out.println("leo".equals(test1.values()));
		
		

	}

}
