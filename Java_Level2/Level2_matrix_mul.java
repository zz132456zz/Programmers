// ���α׷��ӽ� - ����� ����

public class Level2_matrix_mul {

	public static void main(String[] args) {
		int[][] arr1 = {{2,3,2},{4,2,4,},{3,1,4}};
		int[][] arr2 = {{5,4,3},{2,4,1},{3,1,1}};
		int[][] answer = new int[arr1.length][arr2[0].length];
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2[0].length;j++) {
				int a=i; // a �ʿ����
				int b=j; // b �ʿ����
				int k=0;
				while(k<arr1[0].length) {
					answer[i][j]+=arr1[a][k]*arr2[k][b];
					k++;
				}
			}
		}
		
		for(int i=0;i<3;i++) {
			for(int k=0;k<3;k++) {
				System.out.println(answer[i][k]);
			}
		}
		

	}

}
