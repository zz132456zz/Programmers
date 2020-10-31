// 프로그래머스 - 서울에서 김서방 찾기

import java.util.*;

public class Level1_findKim {

	public static void main(String[] args) {
		
		String answer = "";
		String[] seoul = {"Jane", "Kim"};
		ArrayList<String> arr = new ArrayList<String>();

	    for(int i = 0;i<seoul.length;i++){
	        arr.add(seoul[i]);
	    }
	    int x = arr.indexOf("Kim");
	      
	    answer = "김서방은 "+x+"에 있다";
	      
	    System.out.println(answer);

	}

}
