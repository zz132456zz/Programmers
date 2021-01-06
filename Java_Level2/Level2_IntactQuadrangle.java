// 프로그래머스 - 멀쩡한 사각형

public class Level2_IntactQuadrangle {

	public static void main(String[] args) {
		int w = 8;
		int h = 12;
		long answer = (long)w * (long)h;
		
		for(long i = 0; i < h; i++) {
			double x = (double) w * i / (double) h;
			double next_x = (double) w * (i + 1) / (double) h;
			
			answer -= (long)(Math.ceil(next_x) - Math.floor(x));
		}	
		
		System.out.println(answer);
	}

}
