// ���α׷��ӽ� - �ڿ��� ������ �迭�� �����

public class Level1_InvertedArray {

	public static void main(String[] args) {
		long n = 12345;
		
		int length = (int)Math.log10(n) + 1;
		
		int[] answer = new int[length];
		
		for(int i = 0; i < length; i++) {
			answer[i] = (int)(n % 10);
			n /= 10;
		}
		
		System.out.println(length);
		for(int i = 0; i < length; i++) {
			System.out.println(answer[i]);
		}
	}

}
