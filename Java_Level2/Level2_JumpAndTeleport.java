// ���α׷��ӽ� - ������ ���� �̵�

public class Level2_JumpAndTeleport {

	public static void main(String[] args) {
		int n = 5000;
		int ans = 0;
		
		while(n > 0) {
			if(n % 2 == 1) {
				ans++;
				n--;
			}else {
				n /= 2;
			}
		}
		
		System.out.println(ans);
	}

}
