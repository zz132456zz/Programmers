// ���α׷��ӽ� - ���￡�� �輭�� ã��

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
	      
	    answer = "�輭���� "+x+"�� �ִ�";
	      
	    System.out.println(answer);

	}

}
