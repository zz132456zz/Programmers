// 프로그래머스 - [1차] 다트 게임

public class Level1_dartgame {

	public static void main(String[] args) {
		String dartResult = "1S2D*3T";
		int answer = 0;
		
		int[] dart = new int[3];
		char[] arr = new char[dartResult.length()];
		
		for(int i=0;i<dartResult.length();i++) {
			arr[i] = dartResult.charAt(i);
		}
		
		int st;
		int temp;
		int index = 0;
		
		for(int i=0;i<3;i++) {
			temp = Integer.parseInt(Character.toString(arr[index]));
			index++;
			if(arr[index]==83 || arr[index]==68 || arr[index]==84) {
				st = temp;
			}else {
				index++;
				st = 10;
			}
			
			if(arr[index]==83) {
				st = st*1;
			}else if(arr[index]==68) {
				st = st*st;
			}else if(arr[index]==84) {
				st = st*st*st;
			}
			index++;
			
			if(index != dartResult.length()) {
				if(arr[index]==42 || arr[index]==35) {
					if(arr[index]==35) {
						st *= -1;
					}else if(arr[index]==42) {
						st *= 2;
						if(i>=1) {
							dart[i-1] *= 2;
						}
					}
					index++;
				}
			}
			dart[i]=st;
		}
		
		for(int i =0;i<3;i++) {
			answer+=dart[i];
			System.out.println(dart[i]);
		}
		System.out.println();
		System.out.println(answer);

	}

}
