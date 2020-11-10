// 프로그래머스 - 핸드폰 번호 가리기

public class Level1_hide_number {

	public static void main(String[] args) {
		String phone_number = "01033334444";
		String answer = "";
	      
	      for(int i = 0; i<phone_number.length(); i++){
	          if(i >= phone_number.length() - 4){
	              answer += phone_number.charAt(i);
	          }
	          else{
	              answer += '*';
	          }
	      }
	      
	      System.out.println(answer);
		

	}

}
