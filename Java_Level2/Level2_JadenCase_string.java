// ���α׷��ӽ� - JadenCase ���ڿ� �����

public class Level2_JadenCase_string {

	public static void main(String[] args) {
		//touppercase tolowercase ���� �� ����. split�� " "���� ""�� �ϸ� ������.
		String s = "d2ddD   aaaa";
		String answer = "";
		
		String[] arr = s.split(" ");
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals("")) {
				answer += " ";
				continue;
			}
			if(97 <= arr[i].charAt(0) && arr[i].charAt(0) <= 122) 
				answer += (char)(arr[i].charAt(0) - 32);
			else 
				answer += arr[i].charAt(0);
			
			for(int j = 1; j < arr[i].length(); j++) {
				if(65 <= arr[i].charAt(j) && arr[i].charAt(j) <= 90)
					answer += (char)(arr[i].charAt(j) + 32);
				else 
					answer += arr[i].charAt(j);
			}
			answer += " ";
		}
		
		
		System.out.println(answer.substring(0, answer.length() - 1) + s.substring(s.indexOf(arr[arr.length - 1])+arr[arr.length - 1].length()));
		
	}

}
