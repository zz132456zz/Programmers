
public class Level2_number_baseball {
	
	public static void main(String[] args) {
		int[][] baseball = {{123,1,1},{356,1,0},{327,2,0},{489,0,1}};
		int answer = 0;
		
		String[] num = new String[baseball.length];
		int[] strike = new int[baseball.length];
		int[] ball = new int[baseball.length];
		
		for(int i = 0; i < baseball.length; i++) {
			num[i] = Integer.toString(baseball[i][0]);
			strike[i] = baseball[i][1];
			ball[i] = baseball[i][2];
		}

		int strike2 = 0;
		int ball2 = 0;
		int correct = 0;
		
		for(int i = 1; i <= 9; i++){
            for(int j = 1; j <= 9; j++){                
                for(int k = 1; k <= 9; k++){         
                	if(i == j || j == k || i == k)
                		continue;      	
                	
                	for(int a = 0; a < baseball.length; a++) {                           		
                		if(num[a].indexOf(Integer.toString(i)) == 0) 
                			strike2++;                		
                		else if(num[a].indexOf(Integer.toString(i)) != -1) 
                			ball2++;                		
                		
                		if(num[a].indexOf(Integer.toString(j)) == 1) 
                			strike2++;               		
                		else if(num[a].indexOf(Integer.toString(j)) != -1) 
                			ball2++;                		              		
                		
                		if(num[a].indexOf(Integer.toString(k)) == 2) 
                			strike2++;               		
                		else if(num[a].indexOf(Integer.toString(k)) != -1) 
                			ball2++;                		        		
                		
                		if(strike[a] == strike2 && ball[a] == ball2)
                			correct++;              		
                		
                		strike2 = 0;
                		ball2 = 0;            		
                	}
                	
                	if(correct == baseball.length) 
                		answer++;                	
                	
                	correct = 0;               	                   
                }                
            }            
        }
		
		
		
		System.out.println(answer);

	}

}
