// 프로그래머스 - 소수 찾기

public class Level1_findPrime {

	public static void main(String[] args) {
		
		int n = 1000000;
		long begin = System.currentTimeMillis();
		
		
//		ArrayList<Integer> prime = new ArrayList<Integer>();
//		prime.add(2);
//		int size = prime.size();
//		
//		for(int i = 2; i <= n; i++) {
//			for(int j = 0; j < size; j++) {
//				if(i % prime.get(j) == 0) {
//					break;
//				}else if(j == size-1) {
//					prime.add(i);
//					size++;
//				}
//				
//			}
//		}
		
		int answer=0;
		int[] arr = new int[n+1];
		arr[0]=1;
		arr[1]=1;
		for(int i = 2;i <= n;i++) {
			for(int j = 2; j <= n/i ;j++) {
				arr[i*j]=1;
			}
		}
		for(int i=1;i<=n;i++) {
			if(arr[i]==0) {
				answer++;
			}
		}
		System.out.println(answer);
		
//		for(int i=0;i<10;i++) {
//			for(int j=1;j<=10;j++) {
//				System.out.print(arr[(10*i)+j]);
//			}
//			System.out.println();
//		}
		
		
		
		long end = System.currentTimeMillis();
		
		
		
		
		System.out.println((end - begin) + "s");

	}

}
