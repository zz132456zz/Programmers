// 프로그래머스 - [1차] 비밀지도

public class Level1_secret_map {

	public static void main(String[] args) {
		int n = 6;
		int[] arr1 = {46,33,33,22,31,50};
		int[] arr2 = {27,56,19,14,14,10};
		String[] answer = new String[n];
		//
		
		for(int i=0;i<n;i++) {
			//String b1 = String.format("%0"+n+"d", Integer.parseInt(Integer.toBinaryString(arr1[i]|arr2[i]))).replace("0", " ").replace("1", "#");
			String b1 = Integer.toBinaryString(arr1[i]|arr2[i]);
			if(b1.length()<n) {
				b1 = String.format("%"+n+"s", b1);
			}
			b1 = b1.replaceAll("0", " ");
			b1 = b1.replaceAll("1", "#");
			answer[i] = b1;
		}
		
		
		
//		for(int i=0;i<n;i++) {
//			String b1 = String.format("%0"+n+"d", Integer.parseInt(Integer.toBinaryString(arr1[i])));
//			String b2 = String.format("%0"+n+"d", Integer.parseInt(Integer.toBinaryString(arr2[i])));
//			for(int j=0;j<n;j++) {
//				String s1 = "";
//				String s2 = "";
//				s1 += b1.charAt(j);
//				s2 += b2.charAt(j);
//				if("1".equals(s1) || "1".equals(s2)) {
//					if(j==0) {
//						answer[i] = "#";
//					}else {
//						answer[i] += "#";
//					}
//				}else {
//					if(j==0) {
//						answer[i] = " ";
//					}else {
//						answer[i] += " ";
//					}
//				}
//			}			
//		}
		
		
		
		
		
		
		//
		for(int i=0;i<n;i++) {
			System.out.println(answer[i]);
		}

	}

}
