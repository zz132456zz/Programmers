// ���α׷��ӽ� - ���� ������ �Ǻ�

public class Level1_IntSquareRoot {

	public static void main(String[] args) {
		long n = 121;
		long answer = 0;
		
		double a = Math.sqrt(n) - (long)Math.sqrt(n);
		
		if(a > 0)
			answer = -1;
		else 
			answer = (long)Math.pow(Math.sqrt(n) + 1, 2);
		
		
		System.out.println(answer);
	}

}
