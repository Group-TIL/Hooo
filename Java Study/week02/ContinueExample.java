package sec03.exam05_continue;

public class ContinueExample {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			
			if(i%2 != 0) {
				continue; // 아래쪽 코드 실행하지 않고 for문의 처음으로 이동
			}
			System.out.println(i);
		}

	}

}

