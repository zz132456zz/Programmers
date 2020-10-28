// 프로그래머스 - 2016년

public class Level1_2016 {

	public static void main(String[] args) {
		int a = 5;
		int b = 24;
		
		String answer = "";
		
		int day_sum = 0;
		int day;
		int f_day;
		
		if(a > 1) {day_sum += 31;}
		if(a > 2) {day_sum += 29;}
		if(a > 3) {day_sum += 31;}
		if(a > 4) {day_sum += 30;}
		if(a > 5) {day_sum += 31;}
		if(a > 6) {day_sum += 30;}
		if(a > 7) {day_sum += 31;}
		if(a > 8) {day_sum += 31;}
		if(a > 9) {day_sum += 30;}
		if(a > 10) {day_sum += 31;}
		if(a > 11) {day_sum += 30;}
		day = day_sum + b;
		f_day = day % 7;
		
		if(f_day == 1) {answer = "FRI";}
		else if(f_day == 2) {answer = "SAT";}
		else if(f_day == 3) {answer = "SUN";}
		else if(f_day == 4) {answer = "MON";}
		else if(f_day == 5) {answer = "TUE";}
		else if(f_day == 6) {answer = "WED";}
		else if(f_day == 0) {answer = "THU";}
		
		System.out.println(answer);
	}

}
