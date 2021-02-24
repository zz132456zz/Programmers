// 프로그래머스 - 단체사진 찍기

public class Level2_TakeGroupPhoto {

	public static int cnt = 0;
	
	public static void main(String[] args) {
		int n = 2;
		String[] data = {"N~F=0","R~T>2"};
		int answer = 0;
		cnt = 0;
		
		char[] name = {'A','C','F','J','M','N','R','T'};
		int all_num = 40320;
		
		permutation(data, name, 0);
			
		answer = all_num - cnt;
		
		System.out.println(answer);
		
	}

	static void permutation(String[] data, char[] name, int depth) {
	    if (depth == 8) {
	        count(data, name);
	        return;
	    }
	 
	    for (int i = depth; i < 8; i++) {
	        swap(name, depth, i);
	        permutation(data, name, depth + 1);
	        swap(name, depth, i);
	    }
	}
	 
	static void swap(char[] name, int depth, int i) {
	    char temp = name[depth];
	    name[depth] = name[i];
	    name[i] = temp;
	}
	
	static void count(String[] data, char[] name) {
		String temp = new String(name);
		
		for(int j = 0; j < data.length; j++) {
			char sign = data[j].charAt(3);
			if(sign == '=') {
				if(Math.abs(temp.indexOf(data[j].charAt(0)) - temp.indexOf(data[j].charAt(2))) != Integer.parseInt(Character.toString(data[j].charAt(4))) + 1) {
					cnt++;
					break;
				}
			}else if(sign == '<') {
				if(Math.abs(temp.indexOf(data[j].charAt(0)) - temp.indexOf(data[j].charAt(2))) >= Integer.parseInt(Character.toString(data[j].charAt(4))) + 1) {
					cnt++;
					break;
				}
			}else if(sign == '>') {
				if(Math.abs(temp.indexOf(data[j].charAt(0)) - temp.indexOf(data[j].charAt(2))) <= Integer.parseInt(Character.toString(data[j].charAt(4))) + 1) {
					cnt++;	
					break;
				}
			}	
		}
    }
}
