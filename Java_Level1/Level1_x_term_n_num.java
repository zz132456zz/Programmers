// ���α׷��ӽ� - x��ŭ ������ �ִ� n���� ����

public class Level1_x_term_n_num {

	public static void main(String[] args) {
		
		int x = 2;
		int n = 5;
		
		long[] answer = new long[n];
		
		for(int i = 0; i < n; i++) {
			answer[i]= x * (i + 1);
		}
		
		System.out.println(answer[0]);
		System.out.println(answer[1]);
		System.out.println(answer[2]);
		System.out.println(answer[3]);
		System.out.println(answer[4]);
		
	}

}
