// 프로그래머스 - 오픈채팅방

import java.util.*;

public class Level2_openchat {

	public static void main(String[] args) {
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prode", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};
		
		int Change = 0;
		for(int i = 0; i < record.length; i++) {
			if(record[i].charAt(0) == 'C') {
				Change++;
			}
		}
		
		String[] answer = new String[record.length - Change];
		
		Map<String, String> nickname = new HashMap<>();
		
		for(int i = 0; i < record.length; i++) {
			String[] temp = record[i].split(" ");
			
			if(temp.length == 3) {
				nickname.put(temp[1], temp[2]);
			}
		}
		
		int down_index = 0;
		for(int i = 0; i < record.length; i++) {
			String[] temp = record[i].split(" ");
			
			if(temp[0].equals("Enter")) {
				answer[i - down_index] = nickname.get(temp[1]) + "님이 들어왔습니다.";
			}else if(temp[0].equals("Leave")) {
				answer[i - down_index] = nickname.get(temp[1]) + "님이 나갔습니다.";
			}else if(temp[0].equals("Change")) {
				down_index++;
				continue;
			}
		}
		
		
		
		
		
		for(int i=0;i<answer.length;i++) {
			System.out.println(answer[i]);
		}
	}

}
