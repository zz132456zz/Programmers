// ���α׷��ӽ� - ��ȭ��ȣ ���

public class Level2_phone_book {

	public static void main(String[] args) {
		String[] phone_book = {"119", "97674223","1195524421"};
		boolean answer = true;
		
		for(int i=0;i<phone_book.length;i++) {
			for(int j=0;j<phone_book.length;j++) {
				if(i != j && phone_book[j].indexOf(phone_book[i]) == 0) {
					//return false;
				}
			}
		}
		
		System.out.println(answer);

	}

}
