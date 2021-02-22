// 프로그래머스 - [3차] 파일명 정렬

import java.util.Arrays;
import java.util.Comparator;

public class Level2_SortFilename {

	public static void main(String[] args) {
		String[] files = {"foo9.txt", "foo010bar020.zip", "F-15"};
		String[] answer = new String[files.length];
		
		String[][] HNT = new String[files.length][3];
		
		for(int i = 0; i < files.length; i++) {
			String temp = files[i];
			String NUMBER = "";
			int idx = 0;
			while(true) {
				if(temp.charAt(idx) >= '0' && temp.charAt(idx) <= '9') {
					HNT[i][0] = temp.substring(0, idx);
					break;
				}
				idx++;
			}
			while(true) {
				if(idx < temp.length() && temp.charAt(idx) >= '0' && temp.charAt(idx) <= '9') {
					NUMBER += temp.charAt(idx);
				}else {
					HNT[i][1] = NUMBER;
					break;
				}
				idx++;
			}
			HNT[i][2] = temp.substring(idx);
		}
		
		Arrays.sort(HNT, new Comparator<String[]>() {
			@Override
			public int compare(String[] t1, String[] t2) {				
				if(t1[0].toUpperCase().compareTo(t2[0].toUpperCase()) == 0) {
					return Integer.parseInt(t1[1]) - Integer.parseInt(t2[1]);
				}else {
					return t1[0].toUpperCase().compareTo(t2[0].toUpperCase());
				}	
			}
		});
		
		for(int i = 0; i < files.length; i++) {
			answer[i] = HNT[i][0] + HNT[i][1] + HNT[i][2];
		}
		
		
		
		for(int i = 0; i < HNT.length; i++) {
			for(int j = 0; j < HNT[0].length; j++) {
				System.out.print(HNT[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int i = 0; i < files.length; i++) {
			System.out.println(answer[i]);
		}
		
	}

}
