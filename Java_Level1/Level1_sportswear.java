// 프로그래머스 - 체육복


public class Level1_sportswear {

	public static void main(String[] args) {
		
		int n = 9;
		int[] lost = {2,4,8};
		int[] reserve = {1,3,5,7};
		int answer = 0;
		
		
		int[] student = new int[n];
		
		
        for(int i=0;i<n;i++) {
            student[i] = 1;
        }
        for(int i=0;i<reserve.length;i++) {
            student[reserve[i]-1]++;
        }
        for(int i=0;i<lost.length;i++) {
            student[lost[i]-1]--;
        }


        for(int i = 1;i < n-1;i++) {
            if(student[i-1]==0 && student[i]==2){
                student[i]=1;
                student[i-1]=1;
            }
            if(student[i-1]==2 && student[i]==0) {
                student[i]=1;
                student[i-1]=1;
            }
            if(student[i]==2 && student[i+1]==0) {
                student[i]=1;
                student[i+1]=1;
            }
            if(student[i]==0 && student[i+1]==2) {
                student[i]=1;
                student[i+1]=1;
            }
        }
        for(int i=0;i<n;i++){
            if(student[i]==1 || student[i]==2){
                answer++;
            }
        }
		
		
		System.out.println(answer);

	}

}
